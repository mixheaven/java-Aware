
public abstract class Vehicle {
	
	//attributs
		private String brand;
		private int kilometers;

	//Création des constructeur
		public Vehicle(String brand) {			
			this(brand,0);
		}
		public Vehicle(String brand, int kilometers) {			
			this.brand = brand;
			this.kilometers = kilometers;
		}
	//Creation de getteurs
		public String getBrand() {
			return this.brand;
		}
		
		public int getKilometers() {
			return this.kilometers;
		}
		
	//Creation de setteurs
		public void setBrand(String brand) {
			this.brand = brand;
			
		}
		public void setKilometers(int kilometers) {
			this.kilometers = kilometers;
		}
	
	//methodes
		public abstract String doStuff();

}
