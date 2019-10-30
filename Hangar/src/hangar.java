
public class hangar {
	
	public static void main(String[] args) {
		
		//refference
		Car clio = new Car("Clio");
		Boat titanic = new Boat("Titanic");
		//setteurs
		clio.setKilometers(110);
		titanic.setKilometers(80);
		
		System.out.println("1. la marque de la voiture est " + clio.getBrand());
		System.out.println("2. La vitesse de la voiture est " + clio.getKilometers() + " km");
		System.out.println("3. " + clio.doStuff());
	

		
		System.out.println("1. la marque du est " + titanic.getBrand());
		System.out.println("2. La vitesse de la voiture est " +titanic.getKilometers() + " km");
		System.out.println("3. " + titanic.doStuff());
	
	}

}
