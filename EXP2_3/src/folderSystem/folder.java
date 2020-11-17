package folderSystem;
import java.util.ArrayList;

import fileSystem.*;

public class folder {
	private String name;
	 
	private ArrayList<folder> folderList = new ArrayList<folder>();
	private ArrayList<textFile> textList = new ArrayList<textFile>();
	private ArrayList<imageFile> imageList = new ArrayList<imageFile>();
	private ArrayList<videoFile> videoList = new ArrayList<videoFile>();
	private ArrayList<audioFile> audioList = new ArrayList<audioFile>();
	private ArrayList<exeFile> exeList = new ArrayList<exeFile>();
  
	public folder(String name) {
		this.name = name;
	}

    public void addFolder(folder fold) {
        folderList.add(fold);
    }
 
    public void addTextFile(textFile text) {
        textList.add(text);
    }
    
    public void addImageFile(imageFile image) {
        imageList.add(image);
    }
    
    public void addVideoFile(videoFile video) {
        videoList.add(video);
    }
    
    public void addAudioFile(audioFile audio) {
        audioList.add(audio);
    }
    
    public void addExeFile(exeFile exe) {
        exeList.add(exe);
    }
	
	public void killVirus() {
		System.out.println("对文件夹'" + this.name + "'进行杀毒");
	
	for(Object obj : folderList) {
		((folder)obj).killVirus();
	}
	
	for(Object obj : textList) {
		((textFile)obj).killVirus();
	}
	
	for(Object obj : imageList) {
		((imageFile)obj).killVirus();
	}
	
	for(Object obj : videoList) {
		((videoFile)obj).killVirus();
	}
	
	for(Object obj : audioList) {
		((audioFile)obj).killVirus();
	}
	
	for(Object obj : exeList) {
		((exeFile)obj).killVirus();
	}
  }
}


