/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10t5;

/**
 *
 * @author Mahboob
 */
public class Lab10T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Fulltimeemployee ft=  new Fulltimeemployee(12100," mahboob","ar- 119");   
     Parttimeemployee pt= new  Parttimeemployee(12100," mahboob","ar- 119",121.2);
        System.out.println("Salary is "+ft.claculatesalary());  
        ft.paytax();
        System.out.println(" salary is "+pt.claculatesalary()); 
        pt.paytax();
    }
    
}
