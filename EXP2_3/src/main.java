import fileSystem.*;

import folderSystem.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		folder rootFolder = new folder("根文件夹");
		
		folder textFolder = new folder("文本文件夹");
		folder imageFolder = new folder("图片文件夹");
		folder videoFolder = new folder("视频文件夹");
		folder exeFolder = new folder("可执行文件夹");
		textFile allText = new textFile("汇总.txt");
		
		textFile dailyText = new textFile("日记.txt");
		textFolder.addTextFile(dailyText);
		
		imageFile picImage = new imageFile("照片.jpg");
		imageFile screenImage = new imageFile("截图.gif");
		imageFolder.addImageFile(picImage);
		imageFolder.addImageFile(screenImage);
		
		videoFile recordVideo = new videoFile("录屏.mp4");
		folder audioFolder = new folder("音频文件夹");
		audioFile recordAudio = new audioFile("录音.mp3");
		audioFolder.addAudioFile(recordAudio);
		videoFolder.addVideoFile(recordVideo);
		videoFolder.addFolder(audioFolder);
		
		exeFile GTAEXE = new exeFile("GTA5.exe");
		imageFile pngImgae = new imageFile("icon.png");
		folder nullFolder = new folder("存档文件夹（空）");
		exeFolder.addExeFile(GTAEXE);
		exeFolder.addImageFile(pngImgae);
		exeFolder.addFolder(nullFolder);
		
		rootFolder.addFolder(textFolder);
		rootFolder.addFolder(imageFolder);
		rootFolder.addFolder(videoFolder);
		rootFolder.addFolder(exeFolder);
		rootFolder.addTextFile(allText);
		
		rootFolder.killVirus();
		
	}

}
