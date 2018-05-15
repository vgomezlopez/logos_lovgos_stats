package dao.mongo.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import dao.mongo.entity.ConnectionUsers;
import dao.mongo.entity.Session;
import dao.mongo.entity.Sessions;
import dao.mongo.entity.User;

@Repository
public class SessionService {
	
	@Autowired
	MongoOperations mongoOps;
	
	@Autowired
	public SessionService(MongoOperations mongoOps) {
		this.mongoOps = mongoOps;
	}
	
	public ConnectionUsers getConnectionsByUserID(Integer id){
		Query query = new Query(Criteria.where("_id").is(id));
		return  mongoOps.findOne(query, ConnectionUsers.class);
	}
	
	public List<ConnectionUsers> getAllUserConnections() {
		return mongoOps.findAll(ConnectionUsers.class);
	}
	
	
	public List<Session> getAllSessionByDate(LocalDate date) {
		 List<ConnectionUsers> sessionsUsers = mongoOps.findAll(ConnectionUsers.class);
		 List<Session> allSessionsByDate = new ArrayList<Session>();
		 for( ConnectionUsers s : sessionsUsers) {
			Sessions listeSessions[] = s.getSessions();
			for(int i =0; i< listeSessions.length; i++) {
				LocalDateTime dateTime = listeSessions[i].getSession().getDateConnexion();
				LocalDate dateSession = LocalDate.of(dateTime.getYear(), dateTime.getMonth(), dateTime.getDayOfMonth());
				if(dateSession.equals(date)) {
					allSessionsByDate.add(listeSessions[i].getSession());
//					System.out.println("user_id : " +s.get_id() +" sessions : "+listeSessions[i].getSession());
				}
			}
		 }
		return allSessionsByDate;
	}
	
	public LocalDate getDateConnexionMin() {
		Query query = new Query();
		query.limit(1);
		query.with(new Sort(Sort.Direction.ASC, "sessions.session.dateConnexion"));
		List<ConnectionUsers> sessionsUsers = mongoOps.find(query, ConnectionUsers.class);
		LocalDate dateMin = LocalDate.of(3000, 01, 01);
		for( ConnectionUsers s : sessionsUsers) {
			Sessions listeSessions[] = s.getSessions();
			for(int i =0; i< listeSessions.length; i++) {
				LocalDateTime dateTime = listeSessions[i].getSession().getDateConnexion();
				LocalDate dateSession = LocalDate.of(dateTime.getYear(), dateTime.getMonth(), dateTime.getDayOfMonth());
				if(dateSession.isBefore(dateMin)) {
					dateMin=dateSession;
				}
			}
		 }
		return dateMin;
		
	}
	
	public LocalDate getDateConnexionMax() {
		Query query = new Query();
		query.limit(1);
		query.with(new Sort(Sort.Direction.DESC, "sessions.session.dateConnexion"));
		List<ConnectionUsers> sessionsUsers = mongoOps.find(query, ConnectionUsers.class);
		LocalDate dateMax = LocalDate.of(1900,01,01);
		for( ConnectionUsers s : sessionsUsers) {
			Sessions listeSessions[] = s.getSessions();
			for(int i =0; i< listeSessions.length; i++) {
				LocalDateTime dateTime = listeSessions[i].getSession().getDateConnexion();
				LocalDate dateSession = LocalDate.of(dateTime.getYear(), dateTime.getMonth(), dateTime.getDayOfMonth());
				if(dateSession.isAfter(dateMax)) {
					dateMax=dateSession;
				}
			}
		 }
		return dateMax;
		
	}
	


}
