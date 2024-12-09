package loop;

public class whileodd {
	
	public void printNumbers()
    {
    	int j=1;
    	while(j<=15) {
    		System.out.println("The value of j is : "+j);
    		j += 2;
    	}
    }
    public static void main (String[] args) {
    	// whileodd wo= new whileodd();
    	                  
    	                // wo.printNumbers();
    	new whileodd().printNumbers();
}
}
