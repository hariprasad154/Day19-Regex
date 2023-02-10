package Com.BridgeLabs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistation {
    public boolean userFirstName(String firstName) {
        /*
         * the A-Z lattters 1 or more capital latters  and a|-z more than 2 latters
         * has to be taken
         */

        Pattern FirstNamepattern = Pattern.compile("^[A-Z]+[a-z]{2,}$");
        Matcher matcher = FirstNamepattern.matcher(firstName);
        Boolean result=matcher.matches();
        if (matcher.matches()) {
            System.out.println(firstName + " -Valid");
            return true;
        } else {
            System.out.println(firstName + " is Invalid");
            return false;
        }

    }

    public boolean userLastName(String LastName) {
        Pattern LastNamepattern = Pattern.compile("^[A-Z]+[a-z]{2,}$");
        Matcher matcher = LastNamepattern.matcher(LastName);

        if (matcher.matches()) {
            System.out.println(LastName + " -Valid");
            return true;

        } else {
            System.out.println(LastName + " is Invalid");
            return false;
        }


    }

    public boolean userEmail(String email) {
        Pattern emailPattern = Pattern.compile("^[a-z]{3}[.]{1}[a-zA-z]{1,}+@+[a-z]{2,}[.]{1}+co+[.]?[a-z]{0,}$");
        Matcher matcher = emailPattern.matcher(email);
//        Boolean result=matcher.matches();
        if (matcher.matches()) {
            System.out.println(email + " -Valid");
            return true;
        } else {
            System.out.println(email + " is Invalid");
            return false;
        }

    }


    public boolean phoneNumber(String phonNum) {
        Pattern phonNumMatcher = Pattern.compile("^[+]?[0-9]{2}[\\s]?[0-9]{10}$");
        Matcher matcher = phonNumMatcher.matcher(phonNum);
        Boolean result=matcher.matches();
        if (matcher.matches()) {
            System.out.println(phonNum + " -Valid");
            return true;
        } else {
            System.out.println(phonNum + " is Invalid");
            return false;
        }


    }


    public boolean password(String password) {
        //my pattern    [a-zA-Z0-9]*[A-Z]+[1-9]+[a-zA-Z0-9]*{8,16}$
        Pattern PasswordMatcher = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,20}$");
        //^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$
        Matcher matcher = PasswordMatcher.matcher(password);
        Boolean result=matcher.matches();
        if (matcher.matches()) {
            System.out.println(password + " -Valid");
            return true;
        } else {

            System.out.println(password + " is Invalid");
            return false;
        }

    }

    public void User() {
        Scanner src = new Scanner(System.in);
        UserRegistation obj1 = new UserRegistation();
        //-------------------------------------------//
        System.out.println("enter the firstName");
        String firstName = src.next();
        System.out.println(obj1.userFirstName(firstName));
        //-------------------------------------------//
//        System.out.println("enter the lastName");
//        String lastName = src.next();
//        System.out.println(obj1.userLastName(lastName));
        boolean result = obj1.userLastName("Prasad");
        System.out.println(result);

        //-------------------------------------------//
        System.out.println("enter the email");
        String email = src.next();
        System.out.println(obj1.userEmail(email));
        //-------------------------------------------//
        System.out.println("enter the phoneNumber");
        String phoneNum = src.next();
        System.out.println(obj1.phoneNumber(phoneNum));//+91 9876243210

        //-------------------------------------------//
        System.out.println("enter the Password");
        String Password = src.next();
        System.out.println(obj1.password(Password));//"l1230*L9078l"

    }


}
