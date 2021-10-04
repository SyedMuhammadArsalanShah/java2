/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while_loops;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class While_loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//           int i, fact = 1, number;
//        number = scan.nextInt();
//        for (i = 1; i <= number; i++) {
//            fact *= i; // fact = fact * i;
//        }System.out.println(fact);
//        int a, fact1 = 1, number1;
//        number1 = scan.nextInt();
//        a=1;
//        while( a <= number1) {
//            fact1 *= a; // fact = fact * i;
//            
//            a++;
//        }System.out.println(fact1);
//        int j=1;
//        while (j<=10){     
//          if (j % 2 == 0){
//              System.out.println("even" + j );
//          } else{  System.out.println("odd" + j );} 
//           j++;
//     
//        }
        //    Scanner scan = new Scanner(System.in);
//        int a=0;
//        int num=0;
//        while (a<10 && num >= 0) {
//           System.out.println("enter  number");
//             num= scan.nextInt();
//            System.out.println("value" + num);
//            a++;
        
        int num = 0;
        int num1 = 1;
        for (int i = 0; i <= 10; i++) {

            int Sum = num + num1;
            num = num1;
            num1 = Sum;
            System.out.println(num1 );
        }
    }

}
