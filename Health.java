
class Health extends Insurance {

	public Health() {
		super("Health");
		this.setCost();
	}

	@Override
	public void setCost(){
		this.monthlyCost = 196;
	}	

	@Override
	public void display() {
		System.out.println("Insure type is: "+ this.getInsuranceType());
		System.out.println("Cost per month is: " + this.getCost());
	}
}