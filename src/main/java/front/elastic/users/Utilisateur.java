package front.elastic.users;

import org.elasticsearch.common.geo.GeoPoint;

public class Utilisateur {
	
	private Integer id;
	private String connection;
	private String type;
	private Integer age;
	private String genre;
	private GeoPoint geoLoc;



	public Utilisateur() {
		super();
	}

	

	public Utilisateur(Integer id, String connection, String type, Integer age, String genre, GeoPoint geoLoc) {
	super();
	this.id = id;
	this.connection = connection;
	this.type = type;
	this.age = age;
	this.genre = genre;
	this.geoLoc = geoLoc;
}



	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", connection=" + connection + ", type=" + type + ", age=" + age + ", genre="
				+ genre + ", geoLoc=" + geoLoc + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public GeoPoint getGeoLoc() {
		return geoLoc;
	}

	public void setGeoLoc(GeoPoint geoLoc) {
		this.geoLoc = geoLoc;
	}




	


}
