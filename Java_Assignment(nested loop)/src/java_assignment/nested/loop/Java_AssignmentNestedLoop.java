/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_assignment.nested.loop;

/**
 *
 * @author S M Arsalan Shah
 */
public class Java_AssignmentNestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Program 1");
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println("Program 2");
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("*");

            }
            System.out.println("");
        }

        System.out.println("program 3");
        for (int i = 1; i <= 5; i++) {

            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Program 4");

        for (int j = 1; j <= 5; j++) {
            
            for (int i = 1; i <= j; i++) {

                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("program 5");
        for (int j = 5; j > 0; j--) {
            
            for (int i = 1; i <= j; i++) {

                System.out.print("*");
            }
            System.out.println("");

        }
        System.out.println("program 6");
        for (int i = 1; i <=5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++) {
                System.out.print("*" + " ");
            }
            System.out.println("");

        }
        System.out.println("program 7");
        for (int i = 5; i >0; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            
            for (int a =1 ; a <= i; a++) {
                System.out.print("*" + " ");
            }
            System.out.println("");

        }
        
        
        
        
        
        

    }
}
//output
//run:
//Program 1
//******
//******
//******
//******
//******
//Program 2
//*
//**
//***
//****
//*****
//program 3
//     *
//    **
//   ***
//  ****
// *****
//Program 4
//1
//22
//333
//4444
//55555
//program 5
//*****
//****
//***
//**
//*
//program 6
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//program 7
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 
//BUILD SUCCESSFUL (total time: 0 seconds)
