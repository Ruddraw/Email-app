package email.app;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternativeEmail;
    private String companySuffix = "ruddraw_asad.com";

//constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        

        //Call a method for asking the department - return the department
        this.department = setDepartment();
        


        //call a method that returns random passwords
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //combined element for generating the email
        email = firstName.toLowerCase() +"."+lastName.toLowerCase()+"@"+department + "." +companySuffix;
        // System.out.println("Your Email is: "+ email);

    }
    
//Ask for the department
    private String setDepartment(){
        System.out.println("New worker: "+ firstName +"\n"+"Department Codes:  \n1 for Sales\n2 for development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if(departmentChoice == 1){ return "sales";}
        else if(departmentChoice == 2){ return "dev";}
        else if(departmentChoice == 3){ return "acc";}
        else{return "";}

    }

//generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@%&*#";
        char[] password = new char[length];
        for(int i = 0; i <length; i++){
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


//Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
//Set the alternative email
    public void setAlternativeEmail(String altEmail){
        this.alternativeEmail = altEmail;
    }
//Set the mailbox capacity
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    public String getPassword() {
        return password;
    }
    
    public String showInfo(){
        return "Display name: " +firstName+ " "+lastName + 
                "\nCompany Email: "+email+
                "\nMailbox Capacity: "+ mailBoxCapacity + "mb";
    }


}
