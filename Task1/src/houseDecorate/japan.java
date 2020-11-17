package houseDecorate;
import houseSystem.house;

public class japan extends decorate{
	public japan(house old) {
		super(old);
	}
	
	@Override
	public int getHousePrice() {
		return this.oldHouse.getHousePrice() + 30;
	}
}