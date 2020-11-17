package fileSystem;

public class imageFile {
	private String name;
	
	public imageFile(String name) {
		this.name = name;
	}
	
	public void killVirus() {
		System.out.println("对图片文件'" + this.name + "'杀毒");
	}
}
