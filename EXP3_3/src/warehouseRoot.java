//仓库管理员
public class warehouseRoot {
	void insufficient(order O) {
		if (O.state.equals("备货")) {
			O.changeState("货物数量不足");
		}
	}
	
	void send(order O) {
		if (O.state.equals("备货")) {
			O.changeState("发货");
		}
	}
}
