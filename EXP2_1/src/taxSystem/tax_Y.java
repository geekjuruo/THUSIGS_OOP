package taxSystem;

public class tax_Y implements taxInterface{
	
	@Override
	public float getTaxNumber(float X) {
		float theTaxNumber = (float) (X * 0.07);
		return theTaxNumber;
	}
}
