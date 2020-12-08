
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		milkTea M = new milkTea();
		decorator D = new decorator();
		
		D.chooseScale(M, "超大杯");
		D.chooseBrix(M, "正常糖");
		D.chooseIce(M, "少冰");
		D.chooseMaterial(M, "珍珠");
		
		M.getThings();
		
	}

}
