/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10t1;

/**
 *
 * @author Mahboob
 */


abstract class Animal{
    
    abstract void  makesound();
    void eat (){
        
        System.out.println(" Animal is eating ");
    }}
    class dog extends Animal{
        
        
        void  makesound(){
            
            System.out.println(" Dog is barking ");
        } 
        
        
        
    }
    
class cat extends Animal{
    
    void  makesound(){
        
        
        System.out.println(" cat meaows");
    }
    
}
public class Lab10T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      dog  d1= new dog ();
      cat c1= new cat();
      d1.eat();
      d1.makesound();
      c1.eat();
      c1.makesound();
      
      
    }
    
}
