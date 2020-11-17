package taxSystem;

public class tax_Z implements taxInterface{
	
	@Override
	public float getTaxNumber(float X) {
		float theTaxNumber = (float) (X * 0.075);
		return theTaxNumber;
	}
}
