// 订单类
public class order {
	public String state;
	
	public order() {
		this.state = "已提交";
	}
	
	public String getState() {
		return this.state;
	}
	
	void changeState(String newState) {
		this.state = newState;
	}
}
