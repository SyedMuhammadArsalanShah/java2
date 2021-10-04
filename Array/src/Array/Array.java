/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
//        int[] marks = new int[user.nextInt()];
//        marks[0] = user.nextInt();
//        marks[1] = 4;
//        marks[2] = 3;
//        marks[3] = 2;
//        marks[4] = 1;
//        System.out.println(marks[0]);

        //int[] marks2 = new int[]{4, 5, 6, 3};
        int[] marks1 = {1, 2, 4, 10, 15, 5};
        int num = user.nextInt();
//        System.out.println(marks[4]);
        boolean check = true;
        for (int i = 0; i < marks1.length; i++) {
            if (marks1[i] == num) {
                check = false;
            System.out.println("this  value is used in array series" + marks1[i]);

            }
        }
        if (check==true) {
   
            System.out.println("this num is  not found" + num);
        }
    }
}
//        
//        int[] uni = {23, 78, 65, 45, 77, 45, 67, 56, 65, 45};
//        int size = uni.length;
//        for (int i = 0; i < size; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (uni[i] == uni[j]) {
//                    int count = 0;
//                    count++;
//                    System.out.println(uni[i] + "=" + count);
//                }
//            }


