package dao.mongo.entity;

public enum LovgosMotif {
	Amuser(1), Serieux(2), PratiquerLangues(3),RencontreGens(4),PeuImporte(5);
	   private int value;

	   private LovgosMotif(int value) {
	      this.value = value;
	   }
	   public String getLovgosMotif() {
	      return Integer.toString(value);
	   }

}
