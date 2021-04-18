
class Life extends Insurance {
	public Life() {
		super("Life");
	    this.setCost();
	}
	  
	@Override
	public void setCost(){
		this.monthlyCost = 36;
	}
	  
	@Override
	public void display() {
		System.out.println("Insure type is: "+ this.getInsuranceType());
		System.out.println("Cost per month is: " + this.getCost());
	}
}
