package houseDecorate;
import houseSystem.house;

public class china extends decorate{
	public china(house old) {
		super(old);
	}
	
	@Override
	public int getHousePrice() {
		return this.oldHouse.getHousePrice() + 20;
	}
}