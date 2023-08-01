package AfterJoining;

import java.util.Locale;
import java.util.regex.Pattern;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import com.google.inject.matcher.Matcher;

public class Facker {

	public static void main(String[] args) {
		FakeValuesService fakeValuesService = new FakeValuesService(
			      new Locale("en-GB"), new RandomService());

		for(int i=0;i<=10;i++)
		{
			 String email = fakeValuesService.bothify("????##@gmail.com");
			// System.out.println(email);
			 String b=fakeValuesService.numerify("####");
			// System.out.println(b);
			 Object c=fakeValuesService.fetchObject("4188");
			 //System.out.println(c);
			 String d=fakeValuesService.regexify("[a-z1-9A-Z]{5}");
			 System.out.println(d);
		}
			   
			  

	}

}
