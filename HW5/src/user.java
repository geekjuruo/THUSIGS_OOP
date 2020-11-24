import java.util.Observer;
import java.util.Observable;

public class user implements Observer{
	public void addUser(Observable O) {
		O.addObserver(this);
		System.out.println("用户订阅该系统");
	}
	
	public void deleteUser(Observable O) {
		O.deleteObserver(this);
		System.out.println("用户取消订阅该系统");
	}
	
	@Override
    public void update(Observable O, Object arg) {
		System.out.println("用户收到通知:" + ((shop)O).getNews());
	}
}
