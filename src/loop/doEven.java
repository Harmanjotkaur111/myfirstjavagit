package loop;

public class doEven {
	public void printNumbers() {
		int k=2;
		do {
			System.out.println("The value of k is : " +k);
			k+=2;
		} while(k<10);
	}
      public static void main(String[] args) {
    	  new doEven().printNumbers();
      }
}


