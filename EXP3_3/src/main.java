
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 创建各个角色
		saler S = new saler();
		systemRoot SR = new systemRoot();
		warehouseRoot WR = new warehouseRoot();
		user U = new user();
		// 创建新订单
		order O = new order();
		
		// 销售部员工提交订单
		S.submit(O);
		System.out.println(O.getState());
		//系统管理员审核
		SR.ready(O);
		System.out.println(O.getState());
		//仓库管理员发货
		WR.send(O);
		System.out.println(O.getState());
		//客户收货
		U.get(O);
		System.out.println(O.getState());
		//销售部员工确认
		S.finish(O);
		System.out.println(O.getState());
		
		System.out.println("**********************");
		// 创建新订单
		order O2 = new order();
		// 销售部员工提交订单
		S.submit(O2);
		System.out.println(O2.getState());
		//系统管理员审核不通过
		SR.fail(O2);
		System.out.println(O2.getState());
		//退回销售部员工修改，取消订单
		S.withdraw(O2);
		System.out.println(O2.getState());		
		
	}

}
