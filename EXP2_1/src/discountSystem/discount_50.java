package discountSystem;

public class discount_50 implements discountInterface {
	
	@Override
	public float getDiscountNumber(float X) {
		float theDiscountNumber = (float) (X*0.92);
		return theDiscountNumber;
	}
}