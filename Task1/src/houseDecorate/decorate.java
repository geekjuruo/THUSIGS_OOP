package houseDecorate;
import houseSystem.house;

public abstract class decorate extends house {
	protected house oldHouse;
	
	public decorate(house old) {
		this.oldHouse = old;
	}
	
	@Override
	public abstract int getHousePrice();
}
