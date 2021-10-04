/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_variables;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Java_variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("even odd program ");
        int num = 5;
        if (num % 2 == 0) {
            System.out.println("even");

        } else {
            System.out.println("odd");
        }
        System.out.println("even odd program ");
        int num1 = scan.nextInt();

        if (num1 > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
        System.out.println("sentence count");
        String sen = "A quick brown fox jump over a lazy dog";
        String[] word = sen.split(" ");
        int i;
        int count = 0, count1 = 0, count2 = 0, count3 = 0;

        for (i = 0; i < sen.length(); i++) {
            count++;
        }
        System.out.println("alphabets=:" + count);
        for (i = 0; i < word.length; i++) {

        }

        System.out.println("words= :" + i);
        for (i = 0; i < sen.length(); i++) {
            if ((sen.charAt(i) == 'a' || sen.charAt(i) == 'e' || sen.charAt(i) == 'i' || sen.charAt(i) == 'o' || sen.charAt(i) == 'u') || (sen.charAt(i) == 'A' || sen.charAt(i) == 'E' || sen.charAt(i) == 'I' || sen.charAt(i) == 'O' || sen.charAt(i) == 'U')) {

                count1++;
                if ((sen.charAt(i) >= 65 && sen.charAt(i) <= 90)) {
                    count2++;
                } else if (sen.charAt(i) >= 97 && sen.charAt(i) <= 122) {
                    count3++;

                }
            }

        }
        System.out.println("vowels time" + count1);
        System.out.println("vowels uppercase " + count2);
        System.out.println("vowels lowercase " + count3);

        for (int j = 0; j <= 3; j++) {

            int k;
            for (k = 0; k <= 3; k++) {

                System.out.print(k + " , " + j + "  ");
            }
            System.out.println();
        }

        int[][] avv = {
            {1, 2, 3333},
            {123},
            {1, 2, 3},};
        System.out.println("array" + avv[0][2]);

        String[][] avv1 = {
            {"mon = ", "urdu: " ,"pst:", "math:", "Isl:", "eng:"},
            {"tue = ", "urdu: " ,"--",    "pst:", "math:", "eng:"},
            {"wed = ", "urdu: " ,"math:","--", "pst:",  "eng:"},
            {"thr = ", "urdu: " , "eng:" ,"--", "math:", "Isl:",},
            {"fri = ", "Isl :"   ,"urdu:","pst:", "--","--"},
            {"sat = ", "Isl :"   ,"urdu:","pst:", "math:", "eng:"},
            {"sun = ", "-- " ,"--", "--", "--", "--"},};
        for (int j = 0; j < avv1.length; j++) {
            for (int k = 0; k < avv1[j].length; k++) {
                System.out.print( avv1[j][k] + " ");
            }
            System.out.println();
        }
        for (int j = 5; j > 0; j--) {
            for (int k =j; k < 5; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < j; k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int j = 1; j <= 4; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print(k);
            }
            System.out.println("");
        }
        
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < j; k++) {
                System.out.print(j);
            }
            System.out.println("");
 
        }
    }
}
