package myfirstjavaproject;

public class javaclass {
	//data
	String name = "Harmanjot kaur";
	int age= 26;
	//method starts
	public void test()
	{
		System.out.println("Welcome to java programming language");
	}
public static void main(String[]args) {
	//creation of object
	javaclass obj1= new javaclass();
	System.out.println("My name is: " +obj1.name);
	System.out.println("My age is: " +obj1.age);
	//call class and creation of object2
	javaclass obj2= new javaclass();
	//call method
	obj2.test();
}
}
