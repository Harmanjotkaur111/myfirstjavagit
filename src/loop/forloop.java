package loop;
     //define class named "forloop"
public class forloop {
	      // method name which is printNumbers
	 public void printNumbers() {
		 //initialization; condition; increment decrement
		 for(int i = 1; i <10; i++)
		 {
			
			 System.out.println("The value of i is : " + i );
		 }
	 }
	 public static void main (String[] args)
	 //Execution inside main method
	 {
		 // create objects and call method because of only one time execution
		 new forloop().printNumbers();
	 }

}
