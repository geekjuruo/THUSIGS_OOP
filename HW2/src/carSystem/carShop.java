package carSystem;
import carClass.*;

// 汽车商店类
public class carShop {
	private car carOfTheShop; 
	
	public void createCar(String carType) {
		if(carType.equals("Audi")) {
			this.carOfTheShop = new Audi();
		}
		else if (carType.equals("Benz")) {
			this.carOfTheShop = new Benz();
		}
		else if (carType.equals("BMW")) {
			this.carOfTheShop = new BMW();
		}
		else if (carType.equals("Ford")) {
			this.carOfTheShop =new Ford();
		}
		else if (carType.equals("Toyota")) {
			this.carOfTheShop = new Toyota();
		}
	}
	
	public float getCarPrice(int flag1) {
		return this.carOfTheShop.getPrice(flag1);
	}
	
	public int getCarNum(int flag2) {
		return this.carOfTheShop.getNum(flag2);
	}

}
