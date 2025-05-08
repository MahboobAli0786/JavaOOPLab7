/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10t3;

/**
 *
 * @author Mahboob
 */

abstract class Shape {
    
    
    abstract void area();
}


interface printable {
    
    
    void print();
}
class Rectangle extends Shape implements  printable {
    int width;
    int height;
    Rectangle( int width,int height) {
    this.height= height;
    this.width= width;
}
    
   void area(){
       
       
       System.out.println(" area  is " + width* height);
   } 
   public void print(){
       System.out.println(" Area calculated ");
       
       
   }
   
    
}
public class Lab10T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Rectangle r1= new  Rectangle(4,5);
         r1.area();
         r1.print();
        
    }
    
}
