package pl.sda.zdjavapol73.homework.classesandinterfaces.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public static final Pattern emailAdressPattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

    public static boolean validation(String email){
        Matcher matcher = emailAdressPattern.matcher(email);
        return matcher.find();
    }

    public void validateEmail(String emailAddress){

        class Email {

            String emailAddress;

            public Email(String emailAddress) {
                if(emailAddress.isEmpty() || emailAddress == null || !validation(emailAddress)){
                    this.emailAddress = "unknown";
                    System.out.println("Invalid email adress: " + this.emailAddress);
                } else {
                    this.emailAddress = emailAddress;
                    System.out.println("Valid email adress: " + this.emailAddress);
                }
            }
        }

        Email email = new Email(emailAddress);
    }
}
