package returnmethod;


	
public class staticfunction {

		public static void main(String[] args) {
			int a = 20, b = 10;
			add(a, b); // calling to static method, no need to create an object to call a static method

		}

		public static void add(int a, int b) {
			int c = a + b;
			System.out.println("Sum of " + a + " and " + b + " is " + c);
		}

	}

