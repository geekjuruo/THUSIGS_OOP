package discountSystem;

public class discount_10 implements discountInterface {
	
	@Override
	public float getDiscountNumber(float X) {
		float theDiscountNumber = (float) (X*0.95);
		return theDiscountNumber;
	}
}
