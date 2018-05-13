package front.elastic.users;


import org.elasticsearch.common.geo.GeoPoint;

public class Eleves extends Utilisateur {
	
private boolean statutPremium;



public Eleves(Integer id, String connection, String type, Integer age, String genre,
		GeoPoint geoLoc, boolean statutPremium) {
	super(id, connection, type, age, genre, geoLoc);
	this.statutPremium = statutPremium;
}


@Override
public String toString() {
	return "Eleves [statutPremium=" + statutPremium + "]";
}


public boolean isStatutPremium() {
	return statutPremium;
}

public void setStatutPremium(boolean statutPremium) {
	this.statutPremium = statutPremium;
}

	


}
