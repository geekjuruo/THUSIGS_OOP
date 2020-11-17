package fileSystem;

public class textFile {
	private String name;
	
	public textFile(String name) {
		this.name = name;
	}
	
	public void killVirus() {
		System.out.println("对文本文件'" + this.name + "'杀毒");
	}
}
