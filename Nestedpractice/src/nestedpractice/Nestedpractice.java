/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedpractice;

/**
 *
 * @author S M Arsalan Shah
 */
public class Nestedpractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
       for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
           }
            System.out.println("");

        }
        System.out.println("s"); 
          for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
           }
            System.out.println("");

        }
    }
}
