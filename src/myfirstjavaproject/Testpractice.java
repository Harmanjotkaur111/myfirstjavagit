package myfirstjavaproject;

public class Testpractice {
	             //parametrized method
	public void addition(int a, int b)
	
    
    {
   	     //Data type using 3 variables
   	   int sum = a+b;
   	 System.out.println("Addition is "  +sum);
    }
	
	public void test ()
	// Accessing in other method NOT in main method 
	{
		int a=50, b=20;
		 //Practice prc1 = new Practice();
		 //prc1.addition(a , b);
	}
	public static void main (String [] args)
	{
		
		int a=50, b=20;
		 // Accessing method outside the class Testpractice
	   Testpractice prc2 = new  Testpractice();
	   //prc1.addition(a , b);
	            prc2.test ();
}
           
	
	
}
