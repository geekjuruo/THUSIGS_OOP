package discountSystem;

public class discountFactory {
	public discountInterface getDiscountInterface(float X) {
		discountInterface result = null;
		if (X > 10 && X <= 50 ) {
			result = new discount_10();
		} else if (X > 50 && X <= 100) {
			result = new discount_50();
		} else if (X > 100 && X <= 200) {
			result = new discount_100();
		} else if (X > 200) {
			result = new discount_200();
		} else {
			result = new discount_0();
		}
		
		return result;
	}
}
