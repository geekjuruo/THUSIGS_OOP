package phoneDecorate;

import phoneSystem.phone;

public class flash extends decorate{
	public flash(phone old) {
		super(old);
	}
	
	@Override
	public String alert() {
		return this.oldPhone.alert() + "闪光提示！！！\n";
	}
}
