package constructor;

public class Book {
// Declaring variables
	String Author;
	 String Title;
	Book(){
		     // Default constructor 
	    	 // initialization of variables
		      Author = "Adem";
	    	 Title= "Action movie"; 
	    	 // why in double quotes because of data type string
	     }
	  public void write() {
 System.out.println("The Author of the book is:" + Author + "And The Title of the book is: "+ Title);
	  }
	public static void main(String[] args) {
		Book bk = new Book(); // Calls the default method
		bk.write();
	}
	
}
   