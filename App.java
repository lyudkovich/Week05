package week05;
//Create a class named App that has a main method.
//a.  In this class instantiate an instance of each of your logger classes that implement the Logger interface.
//b. Test both methods on both instances, passing in Strings of your choice.

public class App {

	public static void main(String[] args) {
		Logger logger1 = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		System.out.println("AsteriskLogger");
		logger1.log("Hello");
		logger1.error("Hello");
		
		System.out.println("SpacedLogger");
		logger2.log("Hello");
		logger2.error("Hello");		

	}

}
