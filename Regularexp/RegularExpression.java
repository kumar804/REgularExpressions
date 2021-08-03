package Regularexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    /*
    created function to check valid first name having max
    3 char start with caps lock
     */
    public static boolean usernameValidation(String name){
        String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
        Pattern p = Pattern.compile(regex);
        if (name == null)
        {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }
    /**
     * email is a function checks the email validity
     * there are 3 mandatory  field abc , bridglabz , co
     * two optional field
     */
    public static void email(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email");
        String email = sc.nextLine();
        String regex = "^[abc](.+)[A-Za-z+_.-]+@[bridgelabz](.+)[co](.+)[A-Za-z]$";
        System.out.println("The email is: " + email);
        System.out.println("Check the email is correct? " + email.matches(regex));
    }



// main method
    public static void main(String[] args) {
        System.out.println("Welcome to regular expression");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the your First Name : ");
        String fname = input.nextLine();
        System.out.println(usernameValidation(fname));
        //taking input of last name
        System.out.print("Enter the your Last Name : ");
        String lname = input.nextLine();
        System.out.println(usernameValidation(lname));

        email();


    }
}
