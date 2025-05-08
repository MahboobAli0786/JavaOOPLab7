/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10t2;

/**
 *
 * @author Mahboob
 */
interface Vehicle {
    
    
    void start();
    void stop();
    
}

class car implements  Vehicle{
    
     
  public   void start(){
        
        System.out.println(" Car starts with key");
    }
   public  void stop(){
        
        
        System.out.println(" car stopped");
    }
    
}

class  Bike implements Vehicle {
    
    public   void start(){
        
        System.out.println(" Bike starts with kick ");
    }
   public  void stop(){
        
        
        System.out.println(" Bike stopped");
    }
    
}
public class Lab10T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        car  c1= new  car ();
       Bike b1= new  Bike();
       
       c1.start();
       c1.stop();
       b1.start();
       b1.stop();
        
        
        
    }
    
}
