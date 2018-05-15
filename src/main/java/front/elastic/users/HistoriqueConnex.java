package front.elastic.users;

import java.time.LocalDate;

public class HistoriqueConnex {
	
	private LocalDate dateJour;
	private Integer nbConnections;
	
	
	
	public HistoriqueConnex() {
		super();
	}



	public HistoriqueConnex(LocalDate dateJour, Integer nbConnections) {
		super();
		this.dateJour = dateJour;
		this.nbConnections = nbConnections;
	}
	
	



	@Override
	public String toString() {
		return "HistoriqueConnex [dateJour=" + dateJour + ", nbConnections=" + nbConnections + "]";
	}



	public LocalDate getDateJour() {
		return dateJour;
	}



	public void setDateJour(LocalDate dateJour) {
		this.dateJour = dateJour;
	}



	public Integer getNbConnections() {
		return nbConnections;
	}



	public void setNbConnections(Integer nbConnections) {
		this.nbConnections = nbConnections;
	}
	
	
	

}
