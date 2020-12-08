// 客户类
public class user {
	void get(order O) {
		if (O.state.equals("发货")) {
			O.changeState("收货");
		}
	}
}
