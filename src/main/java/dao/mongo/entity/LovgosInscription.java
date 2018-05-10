package dao.mongo.entity;

public enum LovgosInscription {

	Inscrit(1), NonInscrit(2);
	   private int value;

	   private LovgosInscription(int value) {
	      this.value = value;
	   }
	   public String getLovgosInscription() {
	      return Integer.toString(value);
	   }

	   
}
