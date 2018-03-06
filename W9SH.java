//Author: Hemant Sah
import java.util.*;  //Use Import keyword in order to inherit the abcanner predefined class, via using *, may inherit the all predefined classes of util including abcanner

public class Computation       // Super Class or Parent Class
{
	public static void main(String[] args) // Main class
	{	
		abcanner abc =new abcanner (System.in);   // It's used to get input from the user.
		System.out.println("Enter the first Measured Value ");        
		double MV1, ET1, MV2, ET2, Answer1, AnswerError1, Answer2, AnswerError2;     // Declare the variables 
		MV1 = abc.nextDouble();                
		System.out.println("Enter the First Error Value "); 
		ET1= abc.nextDouble();        
		System.out.println("Enter the Second Measured Value "); 
		MV2 =abc.nextDouble();     
		System.out.println("Enter the Second Error Value "); 
		ET2 = abc.nextDouble();    
		System.out.println("Enter the Addition or Subtraction for Error Computation ");
		String com = abc.next();   
		if (com.equals("Addition"))    
		{
			Answer1 =MV1 + MV2;
			AnswerError1= ET1 + ET2;
			System.out.println("Addition is "+ Answer1 + " ± " + AnswerError1);
		}
		String como =abc.next();
		if (como.equals("Subtraction"))  
		{
			Answer2 =MV1 - MV2;
			AnswerError2=ET1 - ET2;
			System.out.println("Subtraction is " + Answer2 + " ± " + AnswerError2);
			
		}
		
	 }
