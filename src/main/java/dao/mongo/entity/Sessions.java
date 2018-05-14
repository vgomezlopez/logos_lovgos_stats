package dao.mongo.entity;

public class Sessions {
	
	public Session session;

	public Sessions(Session session) {
		super();
		this.session = session;
	}



	public Sessions() {
		super();
	}



	@Override
	public String toString() {
		return "Sessions [session=" + session + "]";
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
	
	

}
