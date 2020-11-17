package phoneDecorate;

import phoneSystem.phone;

public abstract class decorate extends phone {
	protected phone oldPhone;
	
	public decorate(phone old) {
		this.oldPhone = old;
	}
	
	@Override
	public abstract String alert();
}
