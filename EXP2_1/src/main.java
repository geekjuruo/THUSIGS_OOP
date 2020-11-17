import discountSystem.*;

import taxSystem.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		discountFactory discountFunc = new discountFactory();
		taxFactory taxFunc = new taxFactory();
		
		int count = 150; // 测试消费金额
		char product = 'X'; // 测试生产商
		
		discountInterface discount = discountFunc.getDiscountInterface(count);
		taxInterface tax = taxFunc.getTaxInterface(product);
		
		System.out.printf("原销售额为：%.2f 万元\n", (float) count);
		
		
		System.out.printf("打折后销售额为：%.2f 万元\n", discount.getDiscountNumber(count));
		
		System.out.printf("生产商为：%s \n", product);
		
		System.out.printf("应缴纳税收额为：%.2f 万元\n", tax.getTaxNumber(discount.getDiscountNumber(count)));
	}

}
