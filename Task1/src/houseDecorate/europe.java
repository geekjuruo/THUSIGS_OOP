package houseDecorate;
import houseSystem.house;

public class europe extends decorate{
	public europe(house old) {
		super(old);
	}
	
	@Override
	public int getHousePrice() {
		return this.oldHouse.getHousePrice() + 60;
	}
}