package loop;

public class breakmethod {
	      // method name which is printNumbers
	 public void printNumbers() {
		 //initialization; condition; increment decrement
		 for(int i = 1; i <10; i++)
		 {
			
			 //System.out.println("The value of i is : " + i );
			 if(i==1) {
				 break;
			 }
			  System.out.println("I am inside the loop");
		 }
		 System.out.println("I am outside the loop");
	 }
	 public static void main (String[] args)
	 //Execution inside main method
	 {
		 // create objects and call method because of only one time execution
		 new breakmethod().printNumbers();
	 }
}


