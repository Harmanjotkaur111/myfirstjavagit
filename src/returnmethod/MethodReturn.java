package returnmethod;

public class MethodReturn {
	
	public String getteam(String game) {
		String team;
		if(game=="Cricket") {
			team="India will play";
		}
		else {
			team="Australia will play";
		}
		return team;
	}
	public static void main (String[] args) {
		MethodReturn mr = new MethodReturn();
		String mystate= mr.getteam("Cricket");
		System.out.println("team is : "+mystate);
	}

}
