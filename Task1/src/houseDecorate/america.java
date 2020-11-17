package houseDecorate;
import houseSystem.house;

public class america extends decorate{
	public america(house old) {
		super(old);
	}
	
	@Override
	public int getHousePrice() {
		return this.oldHouse.getHousePrice() + 40;
	}
}