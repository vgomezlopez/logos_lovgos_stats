package dao.mongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import dao.mongo.entity.ConnectionUsers;
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

}
