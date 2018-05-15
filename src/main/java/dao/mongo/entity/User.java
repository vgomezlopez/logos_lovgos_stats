package dao.mongo.entity;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
	
	@Id
	private Integer _id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private String mail;
	private String photoUrl;
	private String genre;
	private LocalDate dateNaissance;
	private Geolocalisation geoLoc;
	private String type;
	private Boolean statutPremium;
	private String presentation;
	private  String motif[];
	private Integer trancheAgeRecherche[];
	private String genresRecherches[];
	

	
	
	public User() {
		super();
	}

	public User(Integer _id, String nom, String prenom, String login, String password, String mail, String photoUrl,
			String genre, LocalDate dateNaissance, Geolocalisation geoLoc, String type, Boolean statutPremium,
			String presentation, String[] motif, Integer[] trancheAgeRecherche, String[] genresRecherches) {
		super();
		this._id = _id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.mail = mail;
		this.photoUrl = photoUrl;
		this.genre = genre;
		this.dateNaissance = dateNaissance;
		this.geoLoc = geoLoc;
		this.type = type;
		this.statutPremium = statutPremium;
		this.presentation = presentation;
		this.motif = motif;
		this.trancheAgeRecherche = trancheAgeRecherche;
		this.genresRecherches = genresRecherches;
	}




	@Override
	public String toString() {
		return "User [_id=" + _id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", password="
				+ password + ", mail=" + mail + ", photoUrl=" + photoUrl + ", genre=" + genre + ", dateNaissance="
				+ dateNaissance + ", geoLoc=" + geoLoc + ", type=" + type + ", statutPremium=" + statutPremium
				+ ", presentation=" + presentation + ", motif=" + Arrays.toString(motif) + ", trancheAgeRecherche="
				+ Arrays.toString(trancheAgeRecherche) + ", genresRecherches=" + Arrays.toString(genresRecherches)
				+ "]";
	}

	public Integer get_id() {
		return _id;
	}




	public void set_id(Integer _id) {
		this._id = _id;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLogin() {
		return login;
	}




	public void setLogin(String login) {
		this.login = login;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getMail() {
		return mail;
	}




	public void setMail(String mail) {
		this.mail = mail;
	}




	public String getPhotoUrl() {
		return photoUrl;
	}




	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}




	public LocalDate getDateNaissance() {
		return dateNaissance;
	}




	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}




	public Geolocalisation getGeoLoc() {
		return geoLoc;
	}




	public void setGeoLoc(Geolocalisation geoLoc) {
		this.geoLoc = geoLoc;
	}




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public Boolean getStatutPremium() {
		return statutPremium;
	}




	public void setStatutPremium(Boolean statutPremium) {
		this.statutPremium = statutPremium;
	}




	public String getPresentation() {
		return presentation;
	}




	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}




	public String[] getMotif() {
		return motif;
	}




	public void setMotif(String[] motif) {
		this.motif = motif;
	}




	public Integer[] getTrancheAgeRecherche() {
		return trancheAgeRecherche;
	}




	public void setTrancheAgeRecherche(Integer[] trancheAgeRecherche) {
		this.trancheAgeRecherche = trancheAgeRecherche;
	}




	public String[] getGenresRecherches() {
		return genresRecherches;
	}




	public void setGenresRecherches(String[] genresRecherches) {
		this.genresRecherches = genresRecherches;
	}




	





}