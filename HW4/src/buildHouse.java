
public abstract class buildHouse {
	public void buildTheHouse() {
		buildTheFoundation();
		buildTheSupport();
		buildTheWall();
		buildTheWindow();
	}
	
	public void buildTheFoundation() { // 建造地基
		System.out.println("建造地基");
	}
	
	public abstract void buildTheSupport(); // 建造支撑
		
	
	public abstract void buildTheWall(); // 建造墙体
	
	public void buildTheWindow() { // 建造窗户
		System.out.println("建造窗户");
	}
}
