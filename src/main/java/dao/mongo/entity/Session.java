package dao.mongo.entity;

import java.lang.annotation.Target;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author MSI_elo
 *
 */
public class Session {
	
	public String plateforme;
	
	public LocalDateTime dateConnexion;
	
	public LocalDateTime dateDeconnexion;
	
	private Geolocalisation geoLoc;
	
	
	public Session() {
		super();
	}


	public Session(String plateforme, LocalDateTime dateConnexion, LocalDateTime dateDeconnexion, Geolocalisation geoLoc) {
		super();
		this.plateforme = plateforme;
		this.dateConnexion = dateConnexion;
		this.dateDeconnexion = dateDeconnexion;
		this.geoLoc = geoLoc;
	}


	@Override
	public String toString() {
		return "Session [plateforme=" + plateforme + ", dateConnexion=" + dateConnexion + ", dateDeconnexion="
				+ dateDeconnexion + ", geoLoc=" + geoLoc + "]";
	}


	public String getPlateforme() {
		return plateforme;
	}


	public void setPlateforme(String plateforme) {
		this.plateforme = plateforme;
	}


	public LocalDateTime getDateConnexion() {
		return dateConnexion;
	}


	public void setDateConnexion(LocalDateTime dateConnexion) {
		this.dateConnexion = dateConnexion;
	}


	public LocalDateTime getDateDeconnexion() {
		return dateDeconnexion;
	}


	public void setDateDeconnexion(LocalDateTime dateDeconnexion) {
		this.dateDeconnexion = dateDeconnexion;
	}


	public Geolocalisation getGeoLoc() {
		return geoLoc;
	}


	public void setGeoLoc(Geolocalisation geoLoc) {
		this.geoLoc = geoLoc;
	}
	
	
	
	
	

}
