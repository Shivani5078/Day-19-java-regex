package pattermatching;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Regex {

	/**
	 * @param args
	 */
	public static String Emailid="shivani732@gmail.com";
	public static void EmailidValidation() { // declar the method

		boolean isEmailid;
		String emailidRegex = "^[a-z0-9+_.-]+@[a-z0-9.-]+$";
		Pattern pattern = Pattern.compile(Emailid);
		if (Emailid == null) {
			isEmailid = false;
		}
		Matcher matcher = pattern.matcher(Emailid);
		isEmailid = matcher.matches();
		

//check the condition
		if (isEmailid)
			System.out.println(Emailid + " is an Valid Emailid\n");
		else
			System.out.println(Emailid+ " is an Invalid Emailid");
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailidValidation();// call the method
	}

}

