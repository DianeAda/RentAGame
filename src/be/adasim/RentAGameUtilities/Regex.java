package be.adasim.RentAGameUtilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	private static String regexlettre = "^[a-zA-Z ]+$";
	private static Pattern patternlettre = Pattern.compile(regexlettre);
	
	private static String regexpass = "^.(?=.{8,})((?=.*[!@#$%^&*()=+{};:,<.>]){1,})((?=.*\\\\\\\\d){0,})((?=.*[a-z]){0,1})((?=.*[A-Z]){0,1}).*$";
	private static Pattern patternpass = Pattern.compile(regexpass);
		
	public static boolean verifPass(String pass) {
		Matcher matcherpass = patternpass.matcher(pass);
		if(matcherpass.matches() == true)
			return true;
		else
			return false;
	}
	
	public static boolean verifLettre(String str) {
		Matcher matcherlettre = patternlettre.matcher(str);
		if(matcherlettre.matches() == true)
			return true;
		else
			return false;
	}
		
}