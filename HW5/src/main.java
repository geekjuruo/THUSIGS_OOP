
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user user_ = new user();
		shop shop_ = new shop();
	
        // 用户订阅推送
        user_.addUser(shop_);
        
        // 系统推送消息
        shop_.setNews("亲，有降价大优惠哦，还不赶紧来！");
        shop_.setNews("亲，我们的商品热销，就要涨价了，你可要抓紧了哦！");
        shop_.setNews("亲，你好久没来了，我们这里买一个商品即送价值10元的优惠劵哦！");
        
        //用户取消订阅
        user_.deleteUser(shop_);
	}

}
