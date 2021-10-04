/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package islamic_calculator;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Islamic_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner var = new Scanner(System.in);
        
        System.out.println("1Father");
        int father = var.nextInt();
        System.out.println("2Mother");
        int mother = var.nextInt();
        System.out.println("3Husband");
        int husband = var.nextInt();
        System.out.println("4Wife");
        int wife = var.nextInt();
        System.out.println("5Son");
        int son = var.nextInt();
        System.out.println("6Daughter");
        int daughter = var.nextInt();
        System.out.println("7G_mother(dadi)");
        int G_mother_dadi = var.nextInt();
        System.out.println("8G_mother(nani)");
        int G_mother_nani = var.nextInt();
        System.out.println("9sister");
        int sister = var.nextInt();
        System.out.println("10Granddaughter");
        int Granddaughter = var.nextInt();
        System.out.println("11Mother co sister");
        int Mother_co_sister = var.nextInt();
        System.out.println("12Father co-sister");
        int Father_co_sister = var.nextInt();
        if (son >= 0) {
            int nFat = father * (1 / 6);
        }
        if (daughter >= 0) {
            int nFat = father * (1 / 6);
            //yan per asabah dena hai
          
        }
        if (son == 0 || daughter == 0) {
         // 
        }
        if((son>=0)||(sister==2)){
               int nmot = mother * (1 / 6);
        }
    }
}
