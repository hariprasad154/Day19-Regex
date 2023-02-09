package Com.BridgeLabs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class UserRegistationTest {
    //    Scanner src = new Scanner(System.in);
    static UserRegistation obj;

    //the True Values
    //        Hari -Valid
    //        Prasad -Valid
    //        abc.xyz@bl.co.in -Valid
    //        +91 9876243210 -Valid
    //        l1230*L9078l -Valid
    @Test
    public void userRegistationTestFirstname() {
        System.out.println("The First Name Testing ");
//        System.out.println("enter the firstName");
//        String firstName = src.next();
        //      obj.userFirstName(firstName);
        boolean result = obj.userFirstName("Hari");
        System.out.println(result);
        Assertions.assertTrue(result);

    }

    @Test
    public void userRegistationTestLaststname() {
        System.out.println("The last Name Testing ");
//        System.out.println("enter the lastName");
//        String lastName = src.next();
        boolean result = obj.userLastName("prasad");
        Assertions.assertTrue(result);


    }

    @Test
    public void userRegistationTestEmail() {
        System.out.println("The Email Testing ");
//        System.out.println("enter the email");
//        String email = src.next();
//        obj.userEmail(email);
        boolean result = obj.userEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void userRegistationTestPhone() {
        System.out.println("The Phon number Testing ");
//        System.out.println("enter the phoneNumber");
//        String phoneNum = src.next();
//        obj.phoneNumber(phoneNum);
        boolean result = obj.phoneNumber("91 9866817259");
        Assertions.assertTrue(result);

    }

    @Test
    public void userRegistationTestPassword() {
        System.out.println("The Password Testing ");
//        System.out.println("enter the Password");
//        String password = src.next();
//        obj.password(password);
        boolean result = obj.password("l1230*L9078l");
        Assertions.assertTrue(result);


    }
}
