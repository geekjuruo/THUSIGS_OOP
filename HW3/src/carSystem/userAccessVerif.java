package carSystem;

public class userAccessVerif {
	public void verifUserAccess(String User) {
		if (User.equals("high level user")) {
			System.out.println("您是高级用户，可以获知本月生产汽车数量，也可以获知每辆汽车完成生产的时间");
		} else {
			System.out.println("您是普通用户，只可以获知每辆汽车完成生产的时间");
		}
	}
}
