package carSystem;

// 测试功能类
public class main {
	public static void main(String[] args) {
		carShop shop = new carShop();
		
		shop.createCar("Audi");
		shop.buyCar();
		shop.sellCar();
		
		shop.createCar("Benz");
		shop.buyCar();
		shop.sellCar();
		
		shop.createCar("BMW");
		shop.buyCar();
		shop.sellCar();
		
		shop.createCar("Ford");
		shop.buyCar();
		shop.sellCar();
		
		shop.createCar("Toyota");
		shop.buyCar();
		shop.sellCar();
	}
}
