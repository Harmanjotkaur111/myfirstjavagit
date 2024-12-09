package loop;

public class forodd {
           public void oddNumbers() {
        	   for (int i = 1; i <= 15; i += 2) {
        		   System.out.println("The value of i is :" +i);
        	   }
           }
           public static void main (String[] args) {
        	   new forodd().oddNumbers();
           }
}
