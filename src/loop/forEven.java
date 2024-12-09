package loop;

public class forEven {
        public void evenNumbers()
        {
        	for(int i = 2; i <= 20; i += 2) 
        	{
        		System.out.println("The value of i is: "+i);
        	}
        }
        	public static void main (String[] args) 
        	{
                 new forEven().evenNumbers();
}
        
}