package houseSystem;
import houseType.*;
import houseDecorate.*;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		house theHouse = null;
		
		System.out.printf("请选择您所需要的房子户型:\n");
		int area = scanner.nextInt();
		if (area == 40) {
			System.out.printf("40平米的房子价格为60万\n");
			theHouse = new house40();
		} else if (area == 80) {
			System.out.printf("80平米的房子价格为100万\n");
			theHouse = new house80();
		} else if (area == 100) {
			System.out.printf("100平米的房子价格为200万\n");
			theHouse = new house100();
		} else {
			System.out.printf("只有3种户型的房子可以选择\n");
			return;
		}
		
		System.out.printf("请选择您所需要的装修程度:\n");
		int decorate_level = scanner.nextInt();
		if (decorate_level == 1) {
			System.out.printf("精装修价格为50万\n");
			theHouse = new exquisite(theHouse);
		} else if (decorate_level == 2) {
			System.out.printf("普通装修价格为20万\n");
			theHouse = new normal(theHouse);
		} else if (decorate_level == 3) {
			System.out.printf("毛胚房价格为5万\n");
			theHouse = new easy(theHouse);
		} else {
			System.out.printf("只有3种装修程度可以选择\n");
			return;
		}
		
		System.out.printf("请选择您所需要的装修风格:\n");
		int decorate_style = scanner.nextInt();
		if (decorate_style == 1) {
			System.out.printf("欧式装修价格为60万\n");
			theHouse = new europe(theHouse);
		} else if (decorate_style == 2) {
			System.out.printf("美式装修价格为40万\n");
			theHouse = new america(theHouse);
		} else if (decorate_style == 3) {
			System.out.printf("日式房装修价格为30万\n");
			theHouse = new japan(theHouse);
		} else if (decorate_style == 4) {
			System.out.printf("中国风装修价格为20万\n");
			theHouse = new china(theHouse);
		} else {
			System.out.printf("只有4种装修程度可以选择\n");
			return;
		}
		
		System.out.println("您最后的总价为：" + theHouse.getHousePrice() + "万元！！！");
	}
}
