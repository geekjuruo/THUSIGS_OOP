package fileSystem;

public class videoFile {
	private String name;
	
	public videoFile(String name) {
		this.name = name;
	}
	
	public void killVirus() {
		System.out.println("对视频文件'" + this.name + "'杀毒");
	}
}
