/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaters_practice;

import java.security.DrbgParameters;
import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Operaters_practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
     Scanner marksheet = new Scanner(System.in);
       // ----------------******Marksheet *****----------------
                 System.out.println("Enter Your Name");
                 String name ;
                 name=marksheet.nextLine();
                 System.out.println("Enter Your Class");
                 int cal ;
                 cal=marksheet.nextInt();
                 //subject marks
                 System.out.println("Enter Eng Marks");
                 double eng ;
                 eng=marksheet.nextInt();
                 System.out.println("Enter Urdu Marks");
                 double urdu ;
                 urdu=marksheet.nextInt();
                 System.out.println("Enter Maths Marks");
                 double math ;
                 math=marksheet.nextInt();
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
                System.out.println("Obtained Marks Is :"+total);
                System.out.println("Percentage Is :"+per+"%");
                System.out.println("Grade Is :"+grade);
                              
                 
              // --------*****Even Number/Odd Number *****---------
              
              int number ;
              number=marksheet.nextInt();
              if (number%2==0){
                  System.out.println("even number");
              }else {System.out.println("odd number");}
                 
              // ----------------******Leapyear *****----------------
              
              int year ;
              year=marksheet.nextInt();
              if (number%4==0){
                  System.out.println("leap year");
              }else {System.out.println("Is not leap year");}
                 
                 
                 
                
    }
    
}
