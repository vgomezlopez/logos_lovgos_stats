package dao.mongo.entity;

public enum UserType {

	Student(1), Professor(2);
	
	   private int value;

	   private UserType(int value) {
	      this.value = value;
	   }
	   public String getUserType() {
	      return Integer.toString(value);
	   }
	
}
