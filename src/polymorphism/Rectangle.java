package polymorphism;

public class Rectangle {
     
	    void draw( int length, int breadth)
	    {
  System.out.println("The length of rectangle is: "+length+" And The breadth of rectangle is :" +breadth );
}
	    void draw( int area)
	    {
  System.out.println("The Area of rectangle is: " +area);

	    }
	    void draw( String colour)
	    {
  System.out.println("The colour of rectangle is: " +colour);

	    }
	    public static void main(String[] args) {
	    	Rectangle rc= new Rectangle();
	    	rc.draw(10,20);
	    	rc.draw(200);
	    	rc.draw("Blue");
	    }
}
