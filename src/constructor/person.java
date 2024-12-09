package constructor;

public class person {
         String name;
         int age;
          person (String name, int age)   //parameterized constructor
         {
              this.name= name; // this keyword is used when class variables and variables inside the constructor both are same 
              this.age= age;
         }
         public void appear()
         {
        	 System.out.println("Name of the person is :" + name);
        	 System.out.println("Age of the person is :" + age);
}
          public static void main (String[] args)
          { 
        	     person pr= new person("Alex", 29);
        	     pr.appear();
}
}