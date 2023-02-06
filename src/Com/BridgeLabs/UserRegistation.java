package Com.BridgeLabs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistation {
	public void UserFirstName(String Firstname) {
		Pattern FirstNamepattern = Pattern.compile("^[A-Z]+[a-z]{2,}$");
		Matcher matcher = FirstNamepattern.matcher(Firstname);
        if (matcher.matches()) {
            System.out.println(Firstname +" -Valid");
        } else {
            System.out.println(Firstname +" is Invalid");
        }
	}
	public void UserLastName(String Lastname) {
		Pattern LastNamepattern = Pattern.compile("^[A-Z]+[a-z]{2,}$");
		Matcher matcher = LastNamepattern.matcher(Lastname);
        if (matcher.matches()) {
            System.out.println(Lastname +" -Valid");
        } else {
            System.out.println(Lastname +" is Invalid");
        }
	}
//	public void UserEmail(String Email) {
//		Pattern EmailPattern = Pattern.compile("^[A-Z0-9+_.-]+@[A-Z0-9.-]+$");
//		Matcher matcher = EmailPattern.matcher(Email);
//        if (matcher.matches()) {
//            System.out.println(Email +" -Valid");
//        } else {
//            System.out.println(Email +" is Invalid");
//        }
//	}
	

	public void PhineNumber(String phonNum) {
		Pattern phonNumMatcher = Pattern.compile("^[+]?[0-9]{2}[\\s]{1}[0-9]{10}$");
		Matcher matcher = phonNumMatcher.matcher(phonNum);
        if (matcher.matches()) {
            System.out.println(phonNum +" -Valid");
        } else {
            System.out.println(phonNum +" is Invalid");
        }
	}
	public void Password(String Password) {
		Pattern PasswordMatcher = Pattern.compile("^[a-zA-Z0-9]{8,16}$");
		Matcher matcher = PasswordMatcher.matcher(Password);
        if (matcher.matches()) {
            System.out.println(Password +" -Valid");
        } else {
            System.out.println(Password +" is Invalid");
        }
	}
	
}
