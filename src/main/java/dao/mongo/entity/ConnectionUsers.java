package dao.mongo.entity;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "connex")
public class ConnectionUsers {
	
	@Id
	private Integer _id;
	private Sessions sessions[];
	
	
	
	public ConnectionUsers() {
		super();
	}


	public ConnectionUsers(Integer _id, Sessions[] sessions) {
		super();
		this._id = _id;
		this.sessions = sessions;
	}


	@Override
	public String toString() {
		return "ConnectionUsers [_id=" + _id + ", sessions=" + Arrays.toString(sessions) + "]";
	}


	public Integer get_id() {
		return _id;
	}


	public void set_id(Integer _id) {
		this._id = _id;
	}


	public Sessions[] getSessions() {
		return sessions;
	}


	public void setSessions(Sessions[] sessions) {
		this.sessions = sessions;
	}
	
	
	
	

}
