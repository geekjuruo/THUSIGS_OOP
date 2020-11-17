package carSystem;

public class agent {
	carFactory factory;
	userAccessVerif verifAccess;
	
	public agent(car theCarOfTheAgent) {
		this.factory = new carFactory(theCarOfTheAgent);
		this.verifAccess = new userAccessVerif();
	}
	
	public void getUserAccess(String User) {
		this.verifAccess.verifUserAccess(User);
	}
	
	public void domesticMethod() {
		this.factory.domesticPipeLine();
	}
	
	public void importMethod() {
		this.factory.importPipeLine();
	}
	
}
