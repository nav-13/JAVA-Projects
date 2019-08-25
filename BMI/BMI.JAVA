import java.util.Scanner; 
public class BMI {

public static void main(String[] args){
	
	double BMI,heightInFeet,heightInMetres,weightInKG;
	
	Scanner input = new Scanner(System.in);
	
	//take user input in feet
	System.out.println("Please enter your height in feet \neg 6.2");
	heightInFeet = input.nextDouble();
	
	//formula to convert feet into metres
	heightInMetres = heightInFeet/3.28;
		
	//take user input for weight
	System.out.println("Please enter your weight\neg 60");
	weightInKG = input.nextDouble();
	
	//works out BMI
	BMI = weightInKG/(heightInMetres * heightInMetres);
	System.out.println("Your BMI is " + BMI);
	
	//works out the BMI range
	if(BMI<18.5){
		System.out.println("You are under weight");
		}
		
	    else if(BMI >= 18.5 && BMI <= 25){
		System.out.println("You are normal weight");
		}
		
		else if(BMI>25 && BMI <= 30){
		System.out.println("You are over weight");
		}
		
		else if(BMI>30){
		System.out.println("You are OBESE");
		}
	}
}
 