package pattermatching;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Regex {

	/**
	 * @param args
	 */
	public static String Rule3="Shivani123";
	public static void Rule3Validation() { // declar the method

		boolean isRule3;
		String Rule3Regex ="^[A-Z]{1}[a-z]{5}[0-9]{1}";
		Pattern pattern = Pattern.compile(Rule3);
		if (Rule3 == null) {
			isRule3 = false;
		}
		Matcher matcher = pattern.matcher(Rule3);
		isRule3 = matcher.matches();
		

//check the condition
		if (isRule3)
			System.out.println(Rule3+ " is an Valid Rule3\n");
		else
			System.out.println(Rule3+ " is an Invalid Rule3");
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rule3Validation();// call the method
	}

}

