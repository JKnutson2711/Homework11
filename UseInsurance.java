import java.util.Scanner;
public class UseInsurance {
	public static void main(String[] args) {
	      
	       String typeOfInsurance;
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the insurance type you want displayed eithier Life or Health");
	       typeOfInsurance = sc.next();
	      
	       if(typeOfInsurance.equalsIgnoreCase("Life")) {
	      
	           Life life = new Life();
	          
	           life.setCost();
	           life.display();
	          
	       } else if(typeOfInsurance.equalsIgnoreCase("Health")) {
	          
	           Health health = new Health();
	          
	           health.setCost();
	           health.display();
	       } else {
	           System.out.println("That is not a insurance type!");
	       }
    
	   }
}
