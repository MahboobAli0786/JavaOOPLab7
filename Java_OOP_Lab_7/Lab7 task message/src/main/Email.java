/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Mahboob
 */
public class Email extends Message  {
    
    String receiver;
    String sender;
    String subject;
    
    
    Email( String receiver,String text,
    String sender, String subject){
       
        super(text);
        
        
        this.receiver= receiver;
        this.sender= sender;
        this.subject= subject;
        
        
        
        
        
    }
    
    
    void display(){
        System.out.println(this.receiver);
        System.out.println(this.sender);
        System.out.println(this.subject);
        System.out.println(super.text);
        
        
        
    }
    
}
