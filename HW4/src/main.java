
public class main {

	public static void main(String[] args) {
		buildHouse woodenHouse = new buildWoodenHouse();
		
		woodenHouse.buildTheHouse();
		
		buildHouse glassHouse = new buildGlassHouse();
		
		glassHouse.buildTheHouse();
		
	}

}
