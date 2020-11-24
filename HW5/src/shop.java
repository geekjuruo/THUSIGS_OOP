import java.util.Observable;

public class shop extends Observable{
	public String news = "";
	
	public void setNews(String s) {
		this.news = s;
		setChanged();
		notifyObservers();
	}
	
	public String getNews() {
		return news;
	}
	
}	
