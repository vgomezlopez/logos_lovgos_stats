package dao.mongo.entity;

public enum Gender {
	
	Male(1), Female(2), Other(3);
	   private int value;

	   private Gender(int value) {
	      this.value = value;
	   }
	   
	   public String getGender() {
	      return Integer.toString(value);
	   }

}
