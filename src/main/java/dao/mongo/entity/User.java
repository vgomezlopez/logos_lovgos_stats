package dao.mongo.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
	
	@Id
	private String _id;
	private String connection;
	private String userType;
	private String birthDate;
	private String gender;
	private String lovgosInscr;
	private List<String> coordinates;
	private List<String> lovgosMotif;
	private String nbrLove;
	

	
	
	public User() {
		super();
	}



	public User(String connection, String userType, String birthDate, String gender, String lovgosInscr,
			List<String> coordinates, List<String> lovgosMotif, String nbrLove) {
		super();
		this.connection = connection;
		this.userType = userType;
		this.birthDate = birthDate;
		this.gender = gender;
		this.lovgosInscr = lovgosInscr;
		this.coordinates = coordinates;
		this.lovgosMotif = lovgosMotif;
		this.nbrLove = nbrLove;
	}



	public User(String _id, String connection, String userType, String birthDate, String gender, String lovgosInscr,
			List<String> coordinates, List<String> lovgosMotif, String nbrLove) {
		super();
		this._id = _id;
		this.connection = connection;
		this.userType = userType;
		this.birthDate = birthDate;
		this.gender = gender;
		this.lovgosInscr = lovgosInscr;
		this.coordinates = coordinates;
		this.lovgosMotif = lovgosMotif;
		this.nbrLove = nbrLove;
	}



	@Override
	public String toString() {
		return "User [_id=" + _id + ", connection=" + connection + ", userType=" + userType + ", birthDate=" + birthDate
				+ ", gender=" + gender + ", lovgosInscr=" + lovgosInscr + ", coordinates=" + coordinates
				+ ", lovgosMotif=" + lovgosMotif + ", nbrLove=" + nbrLove + "]";
	}



	public String get_id() {
		return _id;
	}


	public void set_id(String _id) {
		this._id = _id;
	}


	public String getConnection() {
		return connection;
	}


	public void setConnection(String connection) {
		this.connection = connection;
	}

	public String getUserType() {
		return userType;
	}


	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getLovgosInscr() {
		return lovgosInscr;
	}



	public void setLovgosInscr(String lovgosInscr) {
		this.lovgosInscr = lovgosInscr;
	}



	public List<String> getCoordinates() {
		return coordinates;
	}



	public void setCoordinates(List<String> coordinates) {
		this.coordinates = coordinates;
	}



	public List<String> getLovgosMotif() {
		return lovgosMotif;
	}



	public void setLovgosMotif(List<String> lovgosMotif) {
		this.lovgosMotif = lovgosMotif;
	}



	public String getNbrLove() {
		return nbrLove;
	}



	public void setNbrLove(String nbrLove) {
		this.nbrLove = nbrLove;
	}
	
	
	


}