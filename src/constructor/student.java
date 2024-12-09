package constructor;

public class student {
	   String name;	    	 // variables declaration
        int age;
        String grade;
        public student ()  // constructor with no parameters
        {
        	this.name= "unassigned";
        	this.age= 0;
            }
         public student (String name, int age)  // constructor with two parameters
        
         {
        	 this.name= name;
        	 this.age= age;
        	 
}
         public student (String name, int age, String grade)  // constructor with two parameters
         
         {
        	 this.name= name;
        	 this.age= age;
        	 this.grade= grade;
}
         public void details()
         {
        	 System.out.println("Name of the person is :" + name);
        	 System.out.println("Age of the person is :" + age);
        	 System.out.println("grade of the person is :" + grade);
        	 
}
         public static void main(String[] args) {
        	 student st= new student ();
        	 student st1= new student ("Chris", 29);
        	 student st2= new student ("Chris", 29,"pass");
        	 st.details();
        	 st1.details();
        	 st2.details();
         }
}



