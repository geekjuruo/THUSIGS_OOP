package fileSystem;

public class audioFile {
	private String name;
	
	public audioFile(String name) {
		this.name = name;
	}
	
	public void killVirus() {
		System.out.println("对音频文件'" + this.name + "'杀毒");
	}
}
