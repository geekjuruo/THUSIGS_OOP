package houseDecorate;
import houseSystem.house;

public class easy extends decorate{
	public easy(house old) {
		super(old);
	}
	
	@Override
	public int getHousePrice() {
		return this.oldHouse.getHousePrice() + 5;
	}
}
