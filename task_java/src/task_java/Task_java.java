/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_java;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Task_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("OBJECT #1");
        int sum = 0;
        int sum1 = 999999999;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter " + i + " Number");
            int num = scan.nextInt();

            if (sum < num) {
                sum = num;

            }
            if (sum1 > num) {
                sum1 = num;

            }

        }
        System.out.println("largest value " + sum);
        System.out.println("smallest value " + sum1);

        System.out.println("OBJECT #2");
        System.out.println(" ENTER NUMBER ");
        int number = scan.nextInt();
        int i;
        for (i = 0; number != 0; i++) {
            number /= 10; //removing 1234,123,12,1 har time i zero ki value 

        }
        System.out.println("Total Number Of Digits " + i);

    }

}
//// output
//run:
//OBJECT #1
//Enter 1 Number
//30
//Enter 2 Number
//1
//Enter 3 Number
//2
//Enter 4 Number
//36
//Enter 5 Number
//678
//Enter 6 Number
//9991
//Enter 7 Number
//201
//Enter 8 Number
//2012
//Enter 9 Number
//2015
//Enter 10 Number
//2000
//largest value 9991
//smallest value 1
//OBJECT #2
// ENTER NUMBER 
//999999999
//total number  of digits 9
//BUILD SUCCESSFUL (total time: 1 minute 20 seconds)
