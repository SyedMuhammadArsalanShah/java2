/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytask;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Arraytask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Program Number One");
//        int[] marks = new int[10];
//        for (int i = 0; i < marks.length; i++) {
//            marks[i] = scan.nextInt();
//        }
//        int sum = Integer.MIN_VALUE;
//        int sum1 = Integer.MAX_VALUE;
//        for (int i = 0; i < marks.length; i++) {
//
//            if (sum < marks[i]) {
//                sum = marks[i];
//
//            }
//            if (sum1 > marks[i]) {
//                sum1 = marks[i];
//
//            }
//
//        }
//        System.out.println("largest" + sum);
//        System.out.println("Smallest" + sum1);
        System.out.println("Program Number Two");

        int[] rev = new int[5];
        for (int j = 0; j < rev.length; j++) {
            System.out.println("Enter Number");
            rev[j] = scan.nextInt();
        }
       int k= rev.length-1;
        int[] ord =new  int[5];
        for (int j = 0; j <=ord.length-1; j++) {
          
         ord[j]=rev[k];
        k--;
          System.out.println(ord[j]+"index"+j);
        }
        System.out.println("Program Number Three");
        int[] check = new int[5];
        for (int i = 0; i < check.length; i++) {
            System.out.println("Enter Number");
            check[i] = scan.nextInt();
        }
        System.out.println("Check how many times your number has been Printed");
        int num2 = scan.nextInt();//2
        int count = 0;
        for (int i = 0; i < check.length; i++) {

            if (check[i] == num2) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println("your number = " + num2 + " : Print = " + count + " times ");

        } else {
            System.out.println("your number = " + num2 + "not print in array");
        }

    }

}
//output
//run:
//Program Number One
//20
//200
//200
//2000
//20000
//2
//23
//660
//88
//12
//largest20000
//Smallest2
//Program Number Two
//Enter Number
//5
//Enter Number
//4
//Enter Number
//3
//Enter Number
//2
//Enter Number
//1
//reverse  value1
//reverse  value2
//reverse  value3
//reverse  value4
//reverse  value5
//Program Number Three
//Enter Number
//20
//Enter Number
//20
//Enter Number
//20
//Enter Number
//66
//Enter Number
//66
//Check how many times your number has been Printed
//66
//your number = 66 : Print = 2 times
//BUILD SUCCESSFUL (total time: 54 seconds)
