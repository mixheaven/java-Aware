
public class Classroom {

	public static void main(String[] args) {
		// methode statique		
		// Jean claude rcoit une nouvelle instance de class Wilder
		Wilder jeanClaude = new Wilder("Jean-Claude");
		// utlisiation de getters
		jeanClaude.setAware(true);
		System.out.println("1." + jeanClaude.whoAmI());
		
		
		
		Wilder henri = new Wilder("Henri", false);
		System.out.println("2. " + henri.whoAmI());

	}
	

}