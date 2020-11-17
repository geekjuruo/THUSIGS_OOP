
public class kerrigan {
	private static kerrigan instance = null;  
	
	public void printFunc(String X) {
		System.out.println(X);
	}
	
	public static kerrigan getInstance() {
		if (instance == null) {
			synchronized (kerrigan.class) {
				if (instance == null) {
					instance = new kerrigan();
				}
			}
		}
		return instance;
	}
	
	
}
