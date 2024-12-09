package loop;

public class forTenNumbers {
	public void executeNumbers()
	{
		for (int i=1; i<=10; i++)
		
			{
				
				 System.out.println("The value of i is : " + i );
			 }
		}
		public static void main (String[] args)
		 //Execution inside main method
		 {
			 // create objects and call method because of only one time execution
			 new forTenNumbers().executeNumbers();
	}

}
