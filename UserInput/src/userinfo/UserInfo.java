/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinfo;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class UserInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // user input code 
                 Scanner userInfo = new Scanner(System.in);
                 System.out.println("enter your name");
                 String name ;
                 name=userInfo.nextLine();
                 System.out.println("enter your age");
                 int age ;
                 age=userInfo.nextInt();
                 System.out.println("enter your Height");
                 double height;
                 height =userInfo.nextDouble();
                 System.out.println("enter your Grade");
                 char grade ;
                 grade=userInfo.next().charAt(0);
                 System.out.println(name );
                 System.out.println(age );
                 System.out.println(height);
                 System.out.println( grade);                      
            
    }
                 
                 
                 
                 
       
    }

