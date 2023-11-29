package program;

import java.util.regex.*;

public class RegExPractice {

	public static void main(String[] args) {
//		Pattern pattern=Pattern.compile("[A-Z]?[\\w\\W]{7,}");
//		Matcher matcher = pattern.matcher("sabgyhv@rdgnvh");
//		System.out.println(matcher.matches());
		
//		Pattern p=Pattern.compile("[\\w]+[@]{1}[\\w]+([.]com)");
//		Matcher m=p.matcher("bhanuprakash33350@gmail.cm");
//		System.out.println(m.matches());
//		
		
	//	Pattern p=new Pattern();
		
		//boolean password=p.compile("[A-Z]?[\w\W]{7,}").matcher("Bhanu@25").matches();
		
		
		boolean passwordIsCorrectOrNot=Pattern.matches("[A-Z]?[\\w\\W]{7,}","Bhanu@25");
		if (passwordIsCorrectOrNot) {
			System.out.println("It is a valid Password format");	
		}
		else {
			System.out.println("It is not a valid Password format");
		}
		
		boolean emailIsCorrectOrNOt=Pattern.matches("[a-z 0-9]+[@]{1}[a-z]+([.]com)","bhanuprakash09071998gmail.com");	
		
		if(emailIsCorrectOrNOt) {
			System.out.println("It is a valid valid Email Id");
		}
		else {
			System.out.println("It is a not valid Email Id");
		}
		boolean phoneNumIsCorrectOrNot=Pattern.matches("^\\+[1-9]{2,}[^6789]?\\d{9,}", "+91 8884228505");
		System.out.println(phoneNumIsCorrectOrNot);
	}
	//^\+[1-9]{2,}[^6789]?\d{9,}
}
