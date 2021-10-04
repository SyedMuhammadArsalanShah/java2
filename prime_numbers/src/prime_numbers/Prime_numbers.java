/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime_numbers;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Prime_numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean Prime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
       
        int num = scan.nextInt();

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

    }

}
//output
//Enter any number:
//2
//2 is  a Prime Number