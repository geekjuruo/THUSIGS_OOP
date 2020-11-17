package houseDecorate;
import houseSystem.house;

public class normal extends decorate{
	public normal(house old) {
		super(old);
	}
	
	@Override
	public int getHousePrice() {
		return this.oldHouse.getHousePrice() + 20;
	}
}
