package fileSystem;

public class exeFile {
	private String name;
	
	public exeFile(String name) {
		this.name = name;
	}
	
	public void killVirus() {
		System.out.println("对可执行文件'" + this.name + "'杀毒");
	}
}
