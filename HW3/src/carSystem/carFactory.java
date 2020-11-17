package carSystem;

public class carFactory {
	car theCarOfTheFactory;
	
	public carFactory(car theCarOfTheFactory) {
		this.theCarOfTheFactory = theCarOfTheFactory;
	}
	
	public void domesticPipeLine() {
		System.out.println("************国产流水线开始***********");
		theCarOfTheFactory.domesticUserNeeds();
		System.out.println("************国产流水线完成***********");
	}
	
	public void importPipeLine() {
		System.out.println("************进口流水线开始***********");
		theCarOfTheFactory.importUserNeeds();
		System.out.println("************进口流水线完成***********");
	}
}
