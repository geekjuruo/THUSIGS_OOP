package taxSystem;

public class taxFactory {
	public taxInterface getTaxInterface(char X) {
		taxInterface result = null;
		if (X == 'X') {
			result = new tax_X();
		} else if (X == 'Y') {
			result = new tax_Y();
		} else if (X == 'Z') {
			result = new tax_Z();
		}
		return result;
	}
}
