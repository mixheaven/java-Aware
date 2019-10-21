
public class Wilder {
	//atributs
	private String firstname;
	private boolean aware;
	
	//constructeur
	public Wilder(String firstname) {
		this.firstname = firstname;
		this.aware = false;
	}
		
	public Wilder(String firstname, boolean aware) {
		this.firstname = firstname;
		this.aware = aware;
	}
	//methode instanciée
	public String whoAmI() {
		if (!this.aware)
			return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
		else
			return "Je m'appelle " + this.getFirstname() + " et je suis aware";

	}
	//accesseurs
	public String getFirstname() {
		return this.firstname;
	}
	public boolean isAware() {
		while(this.aware = false) {
			
		}
		return this.aware;
	}
	//mutateur
	public void setFirstname (String firstname) {
		this.firstname = firstname;
	}
	public void setAware(boolean aware) {
		this.aware = aware;
	}
}