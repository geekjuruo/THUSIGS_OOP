package duckSystem;
import duckType.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("这是一只灰鸭\n");
		grayDuck duck = new grayDuck();
		duck.show();
		
		System.out.printf("这是一只红头鸭\n");
		redDuck duck1 = new redDuck();
		duck1.show();
		
		System.out.printf("这是一只棉花鸭\n");
		cottonDuck duck2 = new cottonDuck();
		duck2.show();
		
		System.out.printf("这是一只橡皮鸭\n");
		rubberDuck duck3 = new rubberDuck();
		duck3.show();
		
	}

}
