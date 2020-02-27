package Email;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Email {
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private String email;
   private int mailboxCapacity = 500;
   private int defaultPasswordLength =10;
   private String alternateEmail;
   private String companySuffix = "company.com";

   //constructor//

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
        this.mailboxCapacity = mailboxCapacity;
        this.alternateEmail = alternateEmail;

        email = firstName.toLowerCase()+ lastName.toLowerCase()+ "@" + department+ "." + companySuffix;

    }
//Getters and Setters//
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    private String randomPassword(int length) {
       String passwordSet = "ABCDEFGHJIKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789!@#$%";
       char[]password = new char[length];
       for (int i = 0; i < length; i++){
           int rand = (int) (Math.random()*passwordSet.length());
           password[i] = passwordSet.charAt(rand);
       }
       return new String(password);
    }

    public int getMailboxCapacity() {
        return this.mailboxCapacity;
    }

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    private String setDepartment() {
        System.out.println("New worker:"+ firstName+ ".\n"+ "DEPARTMENT CODES: \n1 for Sales\n2 for Department\n3 for Accounting\nEnter Department Code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1){
            return "sales";
        }else if(departmentChoice == 2){
            return "dev";
        }else if (departmentChoice == 3){
            return "acct";
        }else{
            return "";
        }
    }

    public String showInfo(){
        return "DISPLAY NAME: "+ firstName + " " + lastName+
                "\nCOMPANY EMAIL: "+ email+ "\nYOUR PASSWORD IS: " +password+
                "\nMAILBOX CAPACITY: "+ mailboxCapacity + "mb";
    }


}
