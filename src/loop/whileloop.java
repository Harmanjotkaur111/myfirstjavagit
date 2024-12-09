package loop;

public class whileloop {
        public void printNumbers()
        {
        	int j=0;
        	while(j<10) {
        		System.out.println("The value of j is : "+j);
        		j++;
        	}
        }
        public static void main (String[] args) {
        	new whileloop().printNumbers();
        }
}
