/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional_statement;

import java.util.Scanner;

/**
 *
 * @author S M Arsalan Shah
 */
public class Conditional_statement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner state=new Scanner(System.in);
             
        
        System.out.println("Enter your pass ");
        String pass ;
        pass=state.nextLine();
        //nested if/else
        if(pass.equals("login123")){  
            
            
            System.out.println("sucessful login ");
            
              System.out.println("enter your age");
              int age ;
              age=state.nextInt();
             if(age >= 20 ) {
                System.out.println("valid age");
                System.out.println("enter your exp");
                int exp ;
                exp=state.nextInt();
                
                if(exp >= 2){
                    System.out.println("selected");
                     if( exp==2 ){
                     System.out.println("your salary is 20000");
                 
                       }else if( exp==3 ){
                       System.out.println("your salary is 30000");
                 
                 }
                else {System.out.println("your salary is 100000");}
                }else{System.out.println("sorry! you are not selected");}
             
             }
             else {System.out.println("invalid age");}
                
        }else if(pass.equals("")){
        System.out.println("its required");
        }
        else{System.out.println("sorry! incorrect pass ");}
       
        
        
        
    }
    
}
