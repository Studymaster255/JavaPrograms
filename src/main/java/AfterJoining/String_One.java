package AfterJoining;

import java.util.regex.Pattern;

public class String_One {

	private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
	public static void main(String[] args) {
	
		String_One one=new String_One();
		boolean  ab=one.isValid("mystudy@1235.co");
		System.out.println(ab);
		}
	public boolean isValid(String email)
	{
		return Pattern.matches(EMAIL_REGEX, email);
	}
	}
	
	


