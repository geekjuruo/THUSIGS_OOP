package phoneSystem;
import phoneDecorate.*;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone phone = new simplePhone();
		
		System.out.printf("简单的手机测试：\n");
		System.out.printf(phone.alert());
		
		System.out.printf("可震动手机测试：\n");
		phone = new shock(phone);
		System.out.printf(phone.alert());
		
		System.out.printf("可闪光手机测试：\n");
		phone = new flash(phone);
		System.out.printf(phone.alert());
		
		
	}

}
