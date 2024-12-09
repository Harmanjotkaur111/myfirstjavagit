package polymorphism;

public class Testclass {

	 public static void main(String[] args) {
		  Animal anim= new Animal(); // 
		 	   anim.sound();
		    Animal anim2= new cat(); // Runtime polymophism decides at the runtime which method to call based on the type of object and class name
		           anim2.sound();
		    Animal anim3= new dog();
		            anim3.sound();
		     
	 }
}
