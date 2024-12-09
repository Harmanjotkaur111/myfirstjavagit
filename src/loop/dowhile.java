package loop;

public class dowhile {
	public void printNumbers() {
		int k=0;
		do {
			System.out.println("The value of k is : " +k);
			k++;
		} while(k<10);
	}
      public static void main(String[] args) {
    	  new dowhile().printNumbers();
      }
}
