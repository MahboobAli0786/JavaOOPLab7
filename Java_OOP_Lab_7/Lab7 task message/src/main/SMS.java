/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Mahboob
 */
public class SMS extends Message  {
    
    
    
    String recepientcontact; 
            
           SMS(String recepientcontact, String text){
               
             super(text);
               this.recepientcontact= recepientcontact;
               
           } 
            
            
            void display (){
        
        
        System.out.println( super.text);
        System.out.println(this.recepientcontact);
    }
    
    
}
