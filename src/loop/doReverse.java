package loop;

public class doReverse { 
	public void backNumbers() {
		int k=10;
		do {
			System.out.println("The value of k is : " +k);
			k--;
		} while(k>0);
	}
      public static void main(String[] args) {
    	  new doReverse().backNumbers();
      }
	}


