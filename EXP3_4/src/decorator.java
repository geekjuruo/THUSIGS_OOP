// 装饰类
public class decorator {
	
	public void chooseBrix(milkTea milktea, String brix) {
		milktea.brix = brix;
	}
	
	public void chooseIce(milkTea milktea, String ice) {
		milktea.ice = ice;
	}
	
	public void chooseMaterial(milkTea milktea, String material) {
		milktea.material = material;
	}
	
	public void chooseScale(milkTea milktea, String scale) {
		milktea.scale = scale;
	}
}
