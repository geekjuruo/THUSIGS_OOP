// 销售部员工
public class saler {
	void submit(order O) {
		O.changeState("已提交");
	}
	
	void withdraw(order O) {
		if (O.state.equals("审核未通过")) {
			O.changeState("已取消");
		}
	}
	
	void finish(order O) {
		if (O.state.equals("收货")) {
			O.changeState("完成");
		}
	}
}
