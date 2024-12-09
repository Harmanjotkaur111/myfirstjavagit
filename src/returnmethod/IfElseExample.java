package returnmethod;

public class IfElseExample {
	//**
	
	public String TrafficSignal(String colour)
	{ 
		// if it is green >> Good to Go
	//else if it is red >> stop
		  //others, ready to go;
         String signal;
         if (colour == "Green")
        	 signal = "Good to Go";
         else if(colour == "Red") {
        	   signal = "Stop";
         }
         else
        	 signal = "Ready to GO";
          return signal;
}  
	    public static void main(String[] args) {
	    	 //create object of the class
	    	IfElseExample ife= new IfElseExample();
	    	 //use string to store the value
	    	String SignalDirection = ife.TrafficSignal("Green");
	    	System.out.println("Signal appears :" + SignalDirection);
	    }
	
}