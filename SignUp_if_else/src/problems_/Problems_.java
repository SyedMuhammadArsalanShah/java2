/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems_;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Problems_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        // option 
        System.out.println("Create Account? Y / N ");        
        char character =scan.next().charAt(0);
        scan.nextLine();
        if(character=='Y' || character=='y') 
        { 
            System.out.println("Create Account");
            //user info for account creation
            System.out.println("Enter You Name");
            String name;
            name=scan.nextLine();
            System.out.println("Enter You Email");
            String email;
            email=scan.nextLine();
             System.out.println("Enter You password");
            String pass;
            pass=scan.nextLine();
            // login for authentication
            System.out.println("Now Login with your Account");
            
            System.out.println("Enter You Name");
            String name1;
            name1=scan.nextLine();
            System.out.println("Enter You password");
            String pass1;
            pass1=scan.nextLine(); 
            if(name.equals(name1) && pass.equals(pass1)){
        
            System.out.println("now you can");
           
            
            } 
            else{System.out.println("Invalid Username or Password");}
            } 
            else{System.out.println("you cant continue");  }          
             
      
        

}}
