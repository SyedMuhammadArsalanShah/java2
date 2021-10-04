/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_conditional_statements;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Assignment1_conditional_statements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner task= new Scanner(System.in);
        //Enter any option : Create Account?Y/N code
        System.out.println("Enter any option : Create Account?Y/N");
        String option ;
        option= task.nextLine();
        
        if(option.equals("Y")){
            //Create Account code
            System.out.println("Create Account");
            System.out.println("Enter Your Name");
            String userName;
            userName=task.nextLine();
            System.out.println("Enter Your Email");
            String email;
            email=task.nextLine();
            System.out.println("Enter Your Password");
            String pass;
            pass =task.nextLine();
            // login code
            System.out.println("Now Login with your Account");
            System.out.println("Enter Your Name");
            String userName1;
            userName1=task.nextLine();
            System.out.println("Enter Your Password");
            String pass1;
            pass1 =task.nextLine();
             //Verification
           if(userName.equals(userName1) && pass.equals(pass1) ){
                 // Marksheet
                 System.out.println("Enter Your Name");
                 String name ;
                 name=task.nextLine();
                 System.out.println("Enter Your Class");
                 int cal ;
                 cal=task.nextInt();
                 //subject marks
                 System.out.println("Enter Eng Marks");
                 double eng ;
                 eng=task.nextInt();
                 System.out.println("Enter Urdu Marks");
                 double urdu ;
                 urdu=task.nextInt();
                 System.out.println("Enter Maths Marks");
                 double math ;
                 math=task.nextInt();
                 // sum of  obtained marks
                 double total;
                 total =eng+urdu+math;
                 //percentage
                 double per=(total/300)*100;
                 //grade
                String grade;
                if(per >=80 && per<=100){
                 grade="A+";
                }else if(per >=70 && per<=79){
                 grade="A";
                }else if(per >=60 && per<=69){
                 grade="B";
                }else if(per >=50 && per<=59){
                 grade="C";
                }else if(per >=40 && per<=49){
                 grade="D";
                }else{grade="fail";}
                System.out.println("Name is  :"+name);  
                System.out.println("Class is : "+cal);  
                System.out.println("English  :"+eng);  
                System.out.println("Urdu  :"+urdu);  
                System.out.println("Mathematics :"+math);  
                System.out.println("Obtained Marks Is :"+total);
                System.out.println("Percentage Is :"+per+"%");
                System.out.println("Grade Is :"+grade);
           }else{System.out.println("Invalid Username or password");}
        } else if(option.equals("N"))
        {System.out.println("You can't continue");
        }
      else {System.out.println("select correct option ");

    }
        
   
//OUTPUT:
// run:
//Enter any option : Create Account?Y/N
//Y
//Create Account
//Enter Your Name
//SYED MUHAMMAD ARSALAN SHAH
//Enter Your Email
//arsalanshahofficial2001@gmail.com
//Enter Your Password
//login_arsalan
//Now Login with your Account
//Enter Your Name
//SYED MUHAMMAD ARSALAN SHAH
//Enter Your Password
//login_arsalan
//Enter Your Name
//SYED MUHAMMAD ARSALAN SHAH
//Enter Your Class
//12
//Enter Eng Marks
//70
//Enter Urdu Marks
//100
//Enter Maths Marks
//90
//Name is  :SYED MUHAMMAD ARSALAN SHAH
//Class is : 12
//English  :70.0
//Urdu  :100.0
//Mathematics :90.0
//Obtained Marks Is :260.0
//Percentage Is :86.66666666666667%
//Grade Is :A+
//BUILD SUCCESSFUL (total time: 1 minute 47 seconds)

}
}
