package loop;

public class reverseNumbers {
	  public void backnumbers() {
		  for (int i = 10; i >= 1; i--) {
			  System.out.println("The value of reverse number is :" +i);
		  }
	  }
	  public static void main (String[] args)
	  {
		  //To call method only one time
		  new reverseNumbers().backnumbers();
	  }

}
