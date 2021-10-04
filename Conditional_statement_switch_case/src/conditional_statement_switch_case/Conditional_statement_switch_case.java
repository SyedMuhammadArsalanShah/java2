/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional_statement_switch_case;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Conditional_statement_switch_case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        Scanner scan = new Scanner(System.in);
        System.out.println(" 1.Press 1 for Addition \n 2.Press 2 for Subtraction \n 3.Press 3 for Multiplication \n 4.Press 4 for Division");
        System.out.println("enter any option 1-4");
        int number =scan.nextInt();
        
        switch (number) {
            case 1:{
                System.out.println("Enter number 1");
                int number1 =scan.nextInt();
                System.out.println("Enter number 2");
                int number2 =scan.nextInt();
                int number3 =number1+number2;
                System.out.println("Addittion of "+number1+" + "+number2  + " is :"+number3);
                break;}
            case 2:{
                System.out.println("Enter number 1");
                int number4 =scan.nextInt();
                System.out.println("Enter number 2");
                int number5 =scan.nextInt();
                int number6 =number4-number5;
                System.out.println("Subtraction of "+number4+" - "+number5  + " is :"+number6);
                break;}
            case 3:{
                System.out.println("Enter number 1");
                int number7 =scan.nextInt();
                System.out.println("Enter number 2");
                int number8 =scan.nextInt();
                int number9 =number7*number8;
                System.out.println("Multiplication of "+number7+" * "+number8  + " is :"+number9);
                break;}
            case 4:{
                System.out.println("Enter number 1");
                int number10 =scan.nextInt();
                System.out.println("Enter number 2");
                int number11 =scan.nextInt();
                if ((number10%number11)==0){
                    int number12 = number10/number11;
                    System.out.println("Division of "+number10+" / "+number11  + " is :"+  number12);
                }else {
                    double number12 =( double )number10/number11;
                    System.out.println("Division of "+number10+" / "+number11  + " is :"+ String.format("%.2f", number12));}
                break;}
            default:{
                System.out.println("Invalid Option");
                break;}
           
        }
        
        
    }
    
}
