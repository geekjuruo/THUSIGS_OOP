package carSystem;
import carClass.*;

public class main {

	public static void main(String[] args) {

		System.out.println("-------------------Test 1------------------");
		//创建一个高级权限用户
		String highUser = "high level user";
		// 以奥迪车作为测试用例，其他车型同理
		car Audi = new Audi();
		// 创建一个代工系统
		agent Agent1 = new agent(Audi);
		// 查询该用户权限
		Agent1.getUserAccess(highUser);
		// 使用进口流水线
		Agent1.importMethod();
		
		System.out.println("-------------------Test 2------------------");
		//创建一个低级权限用户
		String lowUser = "low level user";
		// 以现代车作为测试用例，其他车型同理
		car Hyundai = new Hyundai();
		// 创建一个代工系统
		agent Agent2 = new agent(Hyundai);
		// 查询该用户权限
		Agent2.getUserAccess(lowUser);
		// 使用国产流水线
		Agent2.domesticMethod();
		
	}

}
