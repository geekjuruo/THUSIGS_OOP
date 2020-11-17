package taxSystem;

public class tax_X implements taxInterface{
	
	@Override
	public float getTaxNumber(float X) {
		float theTaxNumber = (float) (X * 0.05);
		return theTaxNumber;
	}
}
