/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programs;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class AllPrograms {

    Scanner scan = new Scanner(System.in);

    void simple_calculation_variable() {
        int number1 = 50;
        int number2 = 30;
        int ans = number1 - number2;
        System.out.println("Number 1=" + number1 + ",Number 2=" + number2 + "subtraction is" + ans);
        int number4 = 30;
        int number5 = 50;
        int ans1 = number4 + number5;
        System.out.println("Number 1=" + number4 + ",Number 2=" + number5 + "addition is" + ans1);
        int number6 = 50;
        int number7 = 30;
        int ans2 = number6 * number7;
        System.out.println("Number 1=" + number6 + ",Number 2=" + number7 + "multiplicationis is" + ans2);
        int number8 = 30;
        int number9 = 50;
        int ans3 = number8 / number9;
        System.out.println("Number 1=" + number8 + ",Number 2=" + number9 + "division is" + ans3);

    }

    void datainfo_variable() {
        String name = "Syed Muhmmad Arsalan Shah";
        int age = 19;
        double height = 5.7;
        char grade = 'A';
        System.out.println(" Name is =" + name);
        System.out.println(" Age is =" + age);
        System.out.println(" Height is =" + height);
        System.out.println(" Grade is =" + grade);

    }

    void datainfo_userinput() {

        Scanner userInfo = new Scanner(System.in);
        System.out.println("enter your name");
        String name;
        name = userInfo.nextLine();
        System.out.println("enter your age");
        int age;
        age = userInfo.nextInt();
        System.out.println("enter your Height");
        double height;
        height = userInfo.nextDouble();
        System.out.println("enter your Grade");
        char grade;
        grade = userInfo.next().charAt(0);
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(grade);

    }

    void signup_login_marksheet() {

        Scanner task = new Scanner(System.in);
        //Enter any option : Create Account?Y/N code
        System.out.println("Enter any option : Create Account?Y/N");
        String option;
        option = task.nextLine();

        if (option.equals("Y")) {
            //Create Account code
            System.out.println("Create Account");
            System.out.println("Enter Your Name");
            String userName;
            userName = task.nextLine();
            System.out.println("Enter Your Email");
            String email;
            email = task.nextLine();
            System.out.println("Enter Your Password");
            String pass;
            pass = task.nextLine();
            // login code
            System.out.println("Now Login with your Account");
            System.out.println("Enter Your Name");
            String userName1;
            userName1 = task.nextLine();
            System.out.println("Enter Your Password");
            String pass1;
            pass1 = task.nextLine();
            //Verification
            if (userName.equals(userName1) && pass.equals(pass1)) {
                // Marksheet
                System.out.println("Enter Your Name");
                String name;
                name = task.nextLine();
                System.out.println("Enter Your Class");
                int cal;
                cal = task.nextInt();
                //subject marks
                System.out.println("Enter Eng Marks");
                double eng;
                eng = task.nextInt();
                System.out.println("Enter Urdu Marks");
                double urdu;
                urdu = task.nextInt();
                System.out.println("Enter Maths Marks");
                double math;
                math = task.nextInt();
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
            } else {
                System.out.println("Invalid Username or password");
            }
        } else if (option.equals("N")) {
            System.out.println("You can't continue");
        } else {
            System.out.println("select correct option ");

        }

    }

    void calculation_userinput() {

        Scanner scan = new Scanner(System.in);
        System.out.println(" 1.Press 1 for Addition \n 2.Press 2 for Subtraction \n 3.Press 3 for Multiplication \n 4.Press 4 for Division");
        System.out.println("enter any option 1-4");
        int number = scan.nextInt();

        switch (number) {
            case 1: {
                System.out.println("Enter number 1");
                int number1 = scan.nextInt();
                System.out.println("Enter number 2");
                int number2 = scan.nextInt();
                int number3 = number1 + number2;
                System.out.println("Addittion of " + number1 + " + " + number2 + " is :" + number3);
                break;
            }
            case 2: {
                System.out.println("Enter number 1");
                int number4 = scan.nextInt();
                System.out.println("Enter number 2");
                int number5 = scan.nextInt();
                int number6 = number4 - number5;
                System.out.println("Subtraction of " + number4 + " - " + number5 + " is :" + number6);
                break;
            }
            case 3: {
                System.out.println("Enter number 1");
                int number7 = scan.nextInt();
                System.out.println("Enter number 2");
                int number8 = scan.nextInt();
                int number9 = number7 * number8;
                System.out.println("Multiplication of " + number7 + " * " + number8 + " is :" + number9);
                break;
            }
            case 4: {
                System.out.println("Enter number 1");
                int number10 = scan.nextInt();
                System.out.println("Enter number 2");
                int number11 = scan.nextInt();
                if ((number10 % number11) == 0) {
                    int number12 = number10 / number11;
                    System.out.println("Division of " + number10 + " / " + number11 + " is :" + number12);
                } else {
                    double number12 = (double) number10 / number11;
                    System.out.println("Division of " + number10 + " / " + number11 + " is :" + String.format("%.2f", number12));
                }
                break;
            }
            default: {
                System.out.println("Invalid Option");
                break;
            }

        }

    }

    void conditional_statement_ifelse() {
        Scanner state = new Scanner(System.in);

        System.out.println("Enter your pass ");
        String pass;
        pass = state.nextLine();
        //nested if/else
        if (pass.equals("login123")) {

            System.out.println("sucessful login ");

            System.out.println("enter your age");
            int age;
            age = state.nextInt();
            if (age >= 20) {
                System.out.println("valid age");
                System.out.println("enter your exp");
                int exp;
                exp = state.nextInt();

                if (exp >= 2) {
                    System.out.println("selected");
                    if (exp == 2) {
                        System.out.println("your salary is 20000");

                    } else if (exp == 3) {
                        System.out.println("your salary is 30000");

                    } else {
                        System.out.println("your salary is 100000");
                    }
                } else {
                    System.out.println("sorry! you are not selected");
                }

            } else {
                System.out.println("invalid age");
            }

        } else if (pass.equals("")) {
            System.out.println("its required");
        } else {
            System.out.println("sorry! incorrect pass ");
        }

    }

    void tableprogram() {

        System.out.println("Table  program");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        for (int b = 1; b <= number2; b++) {
            int num = number1 * b;
            System.out.println(number1 + "*" + b + "=" + num);
        }

    }

    void sumoftennumber() {
        System.out.println("sum  of ten numbers program");
        int num3 = 0;
        for (int e = 1; e <= 10; e++) {
            num3 += e;

        }
        System.out.println(num3);

    }

    void sumoftennumberdec() {

        System.out.println("sum  of ten numbers with 10 to1  program");
        int num4 = 0;
        for (int f = 10; f >= 1; f--) {
            System.out.println(f);
            num4 += f;
        }
        System.out.println(num4);
    }

    void factorial() {
        System.out.println("factorial program");
        int h, fact = 1, number;
        System.out.println("enter number");
        number = scan.nextInt();
        for (h = 1; h <= number; h++) {
            fact *= h; // fact = fact * i;
        }
        System.out.println(fact);
    }

    void checkeven() {
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
    }

    void checkchar() {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter character for method 1");
        char ch1 = scan.next().charAt(0);
        scan.nextLine();
        if ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z')) {
            System.out.println("Alpahbet");
        } else if (ch1 >= '0' && ch1 <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("symbol");
        }

    }

    void checkcharasciisum10() {
        System.out.println("enter character for method 4");
        int int4 = 10;
        char chhhh1 = scan.next().charAt(0);
        char chhhh2 = (char) (int4 + chhhh1);//
        if ((chhhh2 >= 65 && chhhh2 <= 90) || (chhhh2 >= 97 && chhhh2 <= 122)) {
            System.out.println("Alpahbet");
        } else if (chhhh2 >= 48 && chhhh2 <= 57) {
            System.out.println("Digit");
        } else {
            System.out.println("symbol");
        }
        System.out.println("enter your character and check with" + int4 + " + :" + chhhh2);

    }
    void convertacii(){
    
    
    
    
    
    
    
    
    
    }
        }
 