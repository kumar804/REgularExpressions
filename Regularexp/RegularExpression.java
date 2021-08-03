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
    
    /*
     * mobileNumValidation is a function to check the valid mobile number
     * @param mobileNum
     * @return the boolean value either true or false
     * checking the country code  and 10 digit number must be there
     */
    public static boolean mobileNumValidation(String mobileNum) {
        String mobileNumber = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
        Pattern p = Pattern.compile(mobileNumber);
        if ( mobileNumber == null ){
            return false;
        }
        Matcher m = p.matcher(mobileNum);

        return m.matches();
    }
    /*
     passwordValidation is a function to check password validation
      password validation part 1 is enter minimum 8 characters
     */
    public static boolean passwordValidation(String password){

        String regex = "^[a-z A-z]{8,}$";
        Pattern p = Pattern.compile(regex);

        if ( password == null ){
            return false;
        }
        Matcher m = p.matcher(password);

        return m.matches();
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
        System.out.print("Enter the your Mobile Number : ");
        String mNumber = input.nextLine();
        System.out.println(mobileNumValidation(mNumber));
        //geting input for password

        System.out.print("Enter the your Password : ");
        String password = input.nextLine();
        System.out.println(passwordValidation(password));
    }



    }

