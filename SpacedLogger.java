package week05;

//a. If the log method received “Hello” as an argument, it should print H e l l o
//b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println(addSpaces(log));
	}

	@Override
	public void error(String error) {
		System.out.println("ERROR: " + addSpaces(error));
	}
	
    public static String addSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (i < str.length() - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}
