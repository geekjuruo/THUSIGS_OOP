package phoneDecorate;

import phoneSystem.phone;

public class shock extends decorate{
	public shock(phone old) {
		super(old);
	}
	
	@Override
	public String alert() {
		return this.oldPhone.alert() + "震动提示！！！\n";
	}
}
