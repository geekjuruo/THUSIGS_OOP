package carSystem;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carShop shop = new carShop();
		
		shop.createCar("Audi");
		System.out.printf("Audi车一般情况下：\n");
		System.out.printf("价格: %f 元; 保养次数: %d 次\n", shop.getCarPrice(0), shop.getCarNum(0));
		System.out.printf("Audi车老客户情况下：\n");
		System.out.printf("价格: %f 元; 保养次数: %d 次\n", shop.getCarPrice(1), shop.getCarNum(1));
		System.out.printf("Audi车节假日情况下：\n");
		System.out.printf("价格: %f 元; 保养次数: %d 次\n", shop.getCarPrice(2), shop.getCarNum(2));
		
		shop.createCar("Benz");
		System.out.printf("Benz车一般情况下：\n");
		System.out.printf("价格: %f 元; 保养次数: %d 次\n", shop.getCarPrice(0), shop.getCarNum(0));
		System.out.printf("Benz车老客户情况下：\n");
		System.out.printf("价格: %f 元; 保养次数: %d 次\n", shop.getCarPrice(1), shop.getCarNum(1));
		System.out.printf("Benz车节假日情况下：\n");
		System.out.printf("价格: %f 元; 保养次数: %d 次\n", shop.getCarPrice(2), shop.getCarNum(2));
		
		shop.createCar("BMW");
		System.out.printf("BMW车一般情况下：\n");
		System.out.printf("价格: %f 元; 保养次数: %d 次\n", shop.getCarPrice(0), shop.getCarNum(0));
		System.out.printf("BMW车老客户情况下：\n");
		System.out.printf("价格: %f 元; 保养次数: %d 次\n", shop.getCarPrice(1), shop.getCarNum(1));
		System.out.printf("BMW车节假日情况下：\n");
		System.out.printf("价格: %f 元; 保养次数: %d 次\n", shop.getCarPrice(2), shop.getCarNum(2));
		
		shop.createCar("Ford");
		System.out.printf("Ford车一般情况下：\n");
		System.out.printf("价格: %f 元; 保养次数: %d 次\n", shop.getCarPrice(0), shop.getCarNum(0));
		System.out.printf("Ford车老客户情况下：\n");
		System.out.printf("价格: %f 元; 保养次数: %d 次\n", shop.getCarPrice(1), shop.getCarNum(1));
		System.out.printf("Ford车节假日情况下：\n");
		System.out.printf("价格: %f 元; 保养次数: %d 次\n", shop.getCarPrice(2), shop.getCarNum(2));
		
		shop.createCar("Toyota");
		System.out.printf("Toyota车一般情况下：\n");
		System.out.printf("价格: %f 元; 保养次数: %d 次\n", shop.getCarPrice(0), shop.getCarNum(0));
		System.out.printf("Toyota车老客户情况下：\n");
		System.out.printf("价格: %f 元; 保养次数: %d 次\n", shop.getCarPrice(1), shop.getCarNum(1));
		System.out.printf("Toyota车节假日情况下：\n");
		System.out.printf("价格: %f 元; 保养次数: %d 次\n", shop.getCarPrice(2), shop.getCarNum(2));
		
	}

}
