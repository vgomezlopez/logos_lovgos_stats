package front.elastic.users;

import java.util.List;

import org.elasticsearch.search.aggregations.support.ValuesSource.GeoPoint;

public class ElevesLovegos extends Eleves {
	
	private List<String> motifs;




	public ElevesLovegos(Integer id, String connection, String type, Integer age, String genre,
			org.elasticsearch.common.geo.GeoPoint geoLoc, boolean statutPremium, List<String> motifs) {
		super(id, connection, type, age, genre, geoLoc, statutPremium);
		this.motifs = motifs;
	}

	@Override
	public String toString() {
		return "ElevesLovegos [motifs=" + motifs + "]";
	}

	public List<String> getMotifs() {
		return motifs;
	}

	public void setMotifs(List<String> motifs) {
		this.motifs = motifs;
	}
	
	



}
