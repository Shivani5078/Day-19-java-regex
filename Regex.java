package pattermatching;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Regex {

	/**
	 * @param args
	 */
	public static String firstName="shivani";
	public static void FirstNameValidation() { // declar the method

		boolean isFirstName;
		String firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(firstNameRegex);
		if (firstName == null) {
			isFirstName = false;
		}
		Matcher matcher = pattern.matcher(firstName);
		isFirstName = matcher.matches();
		

//check the condition
		if (isFirstName)
			System.out.println(firstName + " is an Valid First Name\n");
		else
			System.out.println(firstName + " is an Invalid First Name");
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstNameValidation();// call the method
	}

}
