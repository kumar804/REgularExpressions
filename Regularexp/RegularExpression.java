package Regularexp;

import java.util.ArrayList;
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
        ArrayList<String> email = new ArrayList<String>();
        email.add("abc@yahoo.com");
        email.add("abc-100@yahoo.com");
        email.add("abc.100@yahoo.com");
        email.add("abc111@abc.com");
        email.add("abc-100@abc.net");
        email.add("abc.100@abc.com.au");
        email.add("abc@1.com");
        email.add("abc@gmail.com");
        email.add("abc@gmail.com.com");
        email.add("abc+100@gmail.com");

        email.add("abc");
        email.add("abc@.com.my");
        email.add("abc123@gmail.a");
        email.add("abc123@.com");
        email.add("abc123@.com.com");
        email.add(".abc@abc.com");
        email.add("abc()*@gmail.com");
        email.add("abc@%*.com");
        email.add("abc..2002@gmail.com");
        email.add("abc.@gmail.com");
        email.add("abc@abc@gmail.com");
        email.add("abc@gmail.com.1a");
        email.add("abc@gmail.com.aa.au");
        String regex = "^[0-9A-Za-z]+(([._+-]{0,1})[0-9A-Za-z]+)*@[0-9A-Za-z]+.[a-z]{2,4}.([a-z]{2,3})*$";
        Pattern p = Pattern.compile(regex);
        for(String emails : email){
            Matcher matcher = p.matcher(emails);
            System.out.println(email +" : "+ matcher.matches()+"\n");
        }
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
      password validation part 3 is having minimum 1 numeric value.
      password validation part 4 is having exactly 1 special character.
     */
    public static boolean passwordValidation(String password){

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
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

