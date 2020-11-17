package discountSystem;

public class discount_200 implements discountInterface {
	
	@Override
	public float getDiscountNumber(float X) {
		float theDiscountNumber = (float) (X - 15.00);
		return theDiscountNumber;
	}
}