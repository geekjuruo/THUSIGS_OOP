package discountSystem;

public class discount_100 implements discountInterface {
	
	@Override
	public float getDiscountNumber(float X) {
		float theDiscountNumber = (float) (X*0.90);
		return theDiscountNumber;
	}
}