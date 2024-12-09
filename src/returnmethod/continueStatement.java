package returnmethod;
	
	public class continueStatement {

		public static void main(String[] args) {
			// print odd number 1 to 100
			for (int j = 1; j <= 100; j++) {
				if (j % 2 == 0) {
					continue;
				}
				System.out.println(j);
			}
		}

	}


