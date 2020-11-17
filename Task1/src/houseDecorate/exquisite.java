package houseDecorate;
import houseSystem.house;

public class exquisite extends decorate{
	public exquisite(house old) {
		super(old);
	}
	
	@Override
	public int getHousePrice() {
		return this.oldHouse.getHousePrice() + 50;
	}
}
