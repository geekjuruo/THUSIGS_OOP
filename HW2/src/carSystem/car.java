package carSystem;

public abstract class car {
	public int price; // 价格
	public int num; // 保养次数


	public void setPrice(int x) {
		this.price = x;
	}
	
	public float getPrice(int flag1) {
		if (flag1 == 0) {
			return (float) this.price; // 一般情况下
		} else if (flag1 == 1) {
			return (float) (this.price * 0.85); // 老客户
		} else {
			return (float) (this.price * 0.8); // 节假日
		}
	}
	
	public void setNum(int x) {
		this.num = x;
	}
		
	public int getNum(int flag2) {
		if (flag2 == 0) { 
			return this.num; // 一般情况下 
		} else if (flag2 == 1) {
			return this.num; //  老客户
		} else {
			return this.num + 2; // 节假日
		}
	}
	
}
