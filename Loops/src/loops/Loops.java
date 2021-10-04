/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        Scanner scan = new Scanner(System.in);
        //        leap year program
        System.out.println("leap yearprogram");
        for (int a = 2001; a <= 2021; a++) {

            if (a % 4 == 0) {

                System.out.println("leap year" + a);
            }
        }
        // table program 
        System.out.println("Table  program");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        for (int b = 1; b <= number2; b++) {
            int num = number1 * b;
            System.out.println(number1 + "*" + b + "=" + num);
        }
        //sum  of ten numbers program
        System.out.println("sum  of ten numbers program");
        int num3 = 0;
        for (int e = 1; e <= 10; e++) {
            num3 += e;

        }
        System.out.println(num3);
        //sum  of ten numbers with 10 to1 
        System.out.println("sum  of ten numbers with 10 to1  program");
        int num4 = 0;
        for (int f = 10; f >= 1; f--) {
            System.out.println(f);
            num4 += f;
        }
        System.out.println(num4);
        // factorial program
        System.out.println("factorial program");
        int h, fact = 1, number;
        System.out.println("enter number");
        number = scan.nextInt();
        for (h = 1; h <= number; h++) {
            fact *= h; // fact = fact * i;
        }
        System.out.println(fact);
        // even/odd program
        System.out.println("even/odd program");
        System.out.println("enter 1 number");
        int number1st = scan.nextInt();

        System.out.println("enter 2 number");
        int number2nd = scan.nextInt();

        for (int i = number1st; i <= number2nd; i++) {

            if (i % 2 == 0) {

                System.out.println("even" + i);

            } else {
                System.out.println("odd" + i);
            }

        }

        // mark sheet program        
        System.out.println("mark sheet program");
        for (int j = 0; j < 5; j++) {
            System.out.println("Enter Your Name");
            String name;
            name = scan.nextLine();
            System.out.println("Enter Your Class");
            int cal;
            cal = scan.nextInt();
            //subject marks
            System.out.println("Enter Eng Marks");
            double eng;
            eng = scan.nextInt();
            System.out.println("Enter Urdu Marks");
            double urdu;
            urdu = scan.nextInt();
            System.out.println("Enter Maths Marks");
            double math;
            math = scan.nextInt();
            scan.nextLine();
            // sum of  obtained marks
            double total;
            total = eng + urdu + math;
            //percentage
            double per = (total / 300) * 100;
            //grade
            String grade;
            if (per >= 80 && per <= 100) {
                grade = "A+";
            } else if (per >= 70 && per <= 79) {
                grade = "A";
            } else if (per >= 60 && per <= 69) {
                grade = "B";
            } else if (per >= 50 && per <= 59) {
                grade = "C";
            } else if (per >= 40 && per <= 49) {
                grade = "D";
            } else {
                grade = "fail";
            }

            System.out.println("Name is  :" + name);
            System.out.println("Class is : " + cal);
            System.out.println("English  :" + eng);
            System.out.println("Urdu  :" + urdu);
            System.out.println("Mathematics :" + math);
            System.out.println("Obtained Marks Is :" + total);
            System.out.println("Percentage Is :" + per + "%");
            System.out.println("Grade Is :" + grade);

            for (int i = 1; i <= 5; i++) {

            }
        }
    }
}
