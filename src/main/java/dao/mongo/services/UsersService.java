package dao.mongo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import dao.mongo.entity.LovgosMotif;
import dao.mongo.entity.User;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;

@Repository
public class UsersService  {
	
	@Autowired
	MongoOperations mongoOps;
	
	@Autowired
	public UsersService(MongoOperations mongoOps) {
		this.mongoOps = mongoOps;
	}

//	public UsersService() {
//		MongoClient mongoClient = new MongoClient("localhost", 27017);
//		MongoDatabase db = mongoClient.getDatabase("test");
//		MongoCollection<Document> coll = db.getCollection("users");
//	}

	public void createUser(User user) {
		mongoOps.insert(user);
	}

	public void updateUserConnection(User user, String connect) {
////		User userNew = userOld;
////		userNew.setLogLovConnected(LogosLovgosConnection.NotConnected.getLogosLovgosConnection());
////		Document doc = createDocumentUser(userNew);
//
//		BasicDBObject queryGetUser = new BasicDBObject("_id", user.get_id());
//		BasicDBObject connection = new BasicDBObject();
//		
//		connection.put("connection", connect.toString());
//		System.out.println(connection);
//		UpdateResult resultUpdate = coll.updateOne(queryGetUser, connection);
//		
//		return resultUpdate;
//
	}


	public User getUserByID(String id){
		Query query = new Query(Criteria.where("_id").is(id));
		return  mongoOps.findOne(query, User.class);
	}




}
