/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested_loop;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Nested_loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
            }
        }
        int i = 1;
        
        while (i <= 5) {
            int j = 1;
            while (j <= 3) {
                System.out.println("i" + i);
                j++;
            }
            i++;
        }
        Scanner task = new Scanner(System.in);

//        for (int j = 0; j < 3; j++) {
//            System.out.println("enter number");
//            int num1 = user.nextInt();
//            for (int k = 1; k <=10 ; k++) {
//              int num = num1*k;
//           System.out.println(num);
//
//            }
//            
//        }
        for ( i = 0; i < 5; i++) {
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
                 task.nextLine();
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
           
               
       
        }
       
    }

}
