/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10t4;

/**
 *
 * @author Mahboob
 */



interface Flyable {
        
        
        void fly();
}

interface Swimmable{
        
        
        void swim();}




class Duck implements Flyable, Swimmable{
    
     public void fly(){
        
        
        System.out.println(" Duck can't fly ");
    }
    
  public    void swim(){
         
         
         System.out.println(" Duck can swim");
     }
}
public class Lab10T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Duck d1= new Duck();
      d1.fly();
      d1.swim();
        
        
    }
    
}
