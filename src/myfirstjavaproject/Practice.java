package myfirstjavaproject;

public class Practice {
	      
	               //parametrized method (variables) using addition method
	
         public void addition(int a, int b)
          
         {
        	     //Data type using 3 variables
        	   int sum = a+b;
        	 System.out.println("Addition is "  +sum);
         }
         
         public void subtraction (int a, int b)
         {
        	   int sub = a-b;
        	 System.out.println("Subtraction is " +sub);
         }
         public void multiplication (int a, int b)
         {
        	  int mul = a*b;
        	 System.out.println("multiplication is  "+mul);
         }
         public void division(int a, int b)
         {
        	  int div = a/b;
        	 System.out.println("division is " +div);
         }
         public static void main(String[] args)
        		 {
        	 int a=50, b=20;
        	 //creation of object prc under class Practice
        	 Practice prc = new Practice();
        	 // call method using object
        	 prc.addition(a, b);
        	 prc.subtraction(a,b);
        	 prc.multiplication(a,b);
        	 prc.division(a,b);
}
         }
