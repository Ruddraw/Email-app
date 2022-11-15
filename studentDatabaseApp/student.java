package studentDatabaseApp;

import java.util.Scanner;

public class student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

   //Constructor: prompt user to enter student's name
   public student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student's first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student's last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student's class level: ");
        this.gradeYear = in.nextInt();
        

        setStudentID();
         
    }
   //generate an Id
    private void setStudentID(){
        //Grade level + ID
        id++;
        this.studentID =  gradeYear + "" + id;//did't understand
    }

   //Enroll in courses
    public void enroll(){
        //get inside a loop, user hits 0
        do{
            System.out.println("Enter course to Enroll(Q to QUIT) : ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q") ){
                courses = courses + "\n" + course;
                tuitionBalance += costOfCourse;
            }
            else{
                break;
            }
        }
        while(1 !=0);

        
    }


   //view balance
   public void viewBalance(){
        System.out.println("Your Tuition fees is: "+ tuitionBalance);
   }
   //Pay tuition
   public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $ " + payment);
   }
   // show info
   public String toString(){
    return  "\n" +
            "\n" +
            "Payment Invoice: " +
            "\n" + "First name: " + firstName + 
            "\n" + "Last name: " +  lastName + 
            "\n" + "Grade Level: " + gradeYear + 
            "\n" + "Student ID: " + studentID +
            "\n" + "Course enrolled: " + courses + 
            "\n" + "Due: $ " + tuitionBalance;
   }
}
 