package dao.mongo.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "loves")
public class Loves {
	
	@Id
	private Integer idLove;
	private LocalDate dateHeure;
	private Boolean vu;
	private Integer idExp;
	private Integer idDest;
	
	
	public Loves() {
		super();
	}


	public Loves(Integer idLove, LocalDate dateHeure, Boolean vu, Integer idExp, Integer idDest) {
		super();
		this.idLove = idLove;
		this.dateHeure = dateHeure;
		this.vu = vu;
		this.idExp = idExp;
		this.idDest = idDest;
	}


	@Override
	public String toString() {
		return "Loves [idLove=" + idLove + ", dateHeure=" + dateHeure + ", vu=" + vu + ", idExp=" + idExp + ", idDest="
				+ idDest + "]";
	}


	public Integer getIdLove() {
		return idLove;
	}


	public void setIdLove(Integer idLove) {
		this.idLove = idLove;
	}


	public LocalDate getDateHeure() {
		return dateHeure;
	}


	public void setDateHeure(LocalDate dateHeure) {
		this.dateHeure = dateHeure;
	}


	public Boolean getVu() {
		return vu;
	}


	public void setVu(Boolean vu) {
		this.vu = vu;
	}


	public Integer getIdExp() {
		return idExp;
	}


	public void setIdExp(Integer idExp) {
		this.idExp = idExp;
	}


	public Integer getIdDest() {
		return idDest;
	}


	public void setIdDest(Integer idDest) {
		this.idDest = idDest;
	}
	
	
	

}
