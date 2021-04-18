
abstract class Insurance {
	   public String insuranceType;
	   public double monthlyCost;
	  

	   public Insurance(String insuranceType) {
	       this.insuranceType = insuranceType;
	   }

	   public double getCost() {
		   return monthlyCost;
	   }
	   
	   public String getInsuranceType() {
		   return insuranceType;
	   }
	 	  
	   public abstract void setCost();
	   public abstract void display();
}
