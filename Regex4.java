package pattermatching;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Regex {

	/**
	 * @param args
	 */
	public static String Mobileno="91 9552639242";
	public static void MobilenoValidation() { // declar the method

		boolean isMobileno;
		String MobilenoRegex ="^[0-9]{2}\\s{1}[0-9]{10}$" ;
		Pattern pattern = Pattern.compile(Mobileno);
		if (Mobileno == null) {
			isMobileno = false;
		}
		Matcher matcher = pattern.matcher(Mobileno);
		isMobileno = matcher.matches();
		

//check the condition
		if (isMobileno)
			System.out.println(Mobileno + " is an Valid Mobileno\n");
		else
			System.out.println(Mobileno+ " is an Invalid mobileno");
	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilenoValidation();// call the method
	}

}

