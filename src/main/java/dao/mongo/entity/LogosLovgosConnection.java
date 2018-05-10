package dao.mongo.entity;

public enum LogosLovgosConnection {
	
	Logos(1), Lovgos(2), LogosLovgos(3),NotConnected(4);
	   private int value;

	   private LogosLovgosConnection(int value) {
	      this.value = value;
	   }
	   public String getLogosLovgosConnection() {
	      return Integer.toString(value);
	   }
	   
	   
}
