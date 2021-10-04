/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_loops;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Assignment3_loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Check how many times your number has been Printed");
        int num2 = scan.nextInt();//2
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter " + i + " Number");
            int num1 = scan.nextInt();
            if (num1 == num2) {
                count++;
            }
        }

        System.out.println("your number = " + num2 + " : Print = " + count + " times ");
    }
}
// output   
//run:
//Check how many times your number has been Printed
//2
//Enter 1 Number
//2
//Enter 2 Number
//2
//Enter 3 Number
//2
//Enter 4 Number
//2
//Enter 5 Number
//5
//Enter 6 Number
//6
//Enter 7 Number
//7
//Enter 8 Number
//8
//Enter 9 Number
//9
//Enter 10 Number
//11
//your number = 2 : Print = 4 times 
//BUILD SUCCESSFUL (total time: 33 seconds)
