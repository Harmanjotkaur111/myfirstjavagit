package loop;

public class whileEven {
	public void printNumbers()
    {
    	int j=2;
    	while(j<=12) {
    		System.out.println("The value of j is : "+j);
    		j+=2;
    	}
    }
    public static void main (String[] args) {
    	new whileEven().printNumbers();
}
}
