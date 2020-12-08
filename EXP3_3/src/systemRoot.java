// 系统管理员
public class systemRoot {
	void fail(order O) {
		if (O.state.equals("已提交") || O.state.equals("货物数量不足")) {
			O.changeState("审核未通过");
		}
	}
	
	void ready(order O) {
		if (O.state.equals("已提交") || O.state.equals("货物数量不足") ) {
			O.changeState("备货");
		}
	}
}
