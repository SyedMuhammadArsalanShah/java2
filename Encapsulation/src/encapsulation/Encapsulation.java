/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
class Bike {

    int engineid;
    String name;
    String model;
    String platenumber;
Bike(int e,String a,String b,String c){
engineid=e;
name=a;
model=b;
platenumber=c;

}
}

class Program {

   

    void user() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();
        }
    }

    int factorial(int number) {

        System.out.println("factorial program");
        int fact = 1;
        System.out.println("enter number");
        //number = 5;
        for (int h = 1; h <= number; h++) {
            fact *= h; // fact = fact * i;
        }
        return fact;

    }

    int prime(int num) {
        boolean Prime = true;
        
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                Prime = false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if (Prime) {
            System.out.println(num + " is  a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
        return num;

    
}
}
//class factorial{
//    
//      Scanner scanner = new Scanner(System.in);
//    
//         void facto(){
//           
//             System.out.println("Enter fact number");
//           int num=scanner.nextInt();
//           int fact=1;
//          for (int i = 1; i <= num; i++) {                                       
//            fact=fact*i;
//         }System.out.println("factorial of = "+ num+" is = "+ fact);
//           
//}
//}

public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bike bike = new Bike(101,"honda","2020","2220");
        System.out.println("bikeinfo " + bike.name);
//        bike.engineid = 101;
//        bike.name = "Honda";
//        bike.model = "2021";
//        bike.platenumber = "Khi123";
//
//        Bike bike1 = new Bike();
//        bike1.engineid = 102;
//        bike1.name = "Superpower";
//        bike1.model = "2021";
//        bike1.platenumber = "Khi321";
//        System.out.println("Bike 1 details");
//        System.out.println("Bike Engine Id = " + bike.engineid);
//        System.out.println("Bike Name = " + bike.name);
//        System.out.println("Bike Model = " + bike.model);
//        System.out.println("Bike Platenumber = " + bike.platenumber);
//
//        System.out.println("Bike 2 details");
//        System.out.println("Bike Engine Id  = " + bike1.engineid);
//        System.out.println("Bike Name = " + bike1.name);
//        System.out.println("Bike Model = " + bike1.model);
//        System.out.println("Bike Platenumber = " + bike1.platenumber);
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter any number:");
//        prime.num = scan.nextInt();
//        prime.prime();
//        System.out.println("Enter any number:");
//        prime.num = scan.nextInt();
//        prime.prime();
//        prime.user();
         System.out.println(" factorial ");
        Scanner  user= new Scanner(System.in);
        Program prime = new Program();
        int ans = prime.prime(user.nextInt());
        System.out.println( ans);
//        factorial object1 = new factorial();
//          object1.facto();
    }

}
