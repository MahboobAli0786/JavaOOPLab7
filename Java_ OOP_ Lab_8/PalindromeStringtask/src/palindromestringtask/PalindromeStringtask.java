/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromestringtask;

/**
 *
 * @author Mahboob
 */

import java.util.Scanner;
public class PalindromeStringtask {
    
 
    
   boolean ispalindrome(String str){
       
      
       
       
       String reversed="";
       
       for(   int i=str.length()-1;i>=0;i--)
       {
           
           reversed+=str.charAt(i);
           
           
       }
         if(str.equalsIgnoreCase(reversed))
                 {
                      System.out.println( "it is palindrome ");
                      return true;
                 

                    

         
           
             }else     { System.out.println( "it is  not palindrome ");return false;}}
       
       
      
            
   
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner read= new Scanner( System.in);  
    
        
        PalindromeStringtask t1= new PalindromeStringtask();
        System.out.println("Enter the String to check");
        String str= read.nextLine();
  
        
        t1.ispalindrome(str);
    }
    
}
