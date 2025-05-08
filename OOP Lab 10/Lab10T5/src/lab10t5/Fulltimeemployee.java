/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10t5;

/**
 *
 * @author Mahboob
 */
public class Fulltimeemployee extends Employee implements Taxpayer{
     Fulltimeemployee(int salary, String name ,
    String id){
         
         super(name,id);
         this.salary= salary;
     }
    
    
    int salary;
    
     double claculatesalary( ){
         salary= 30*100;
         return salary;
         
     }
   public     void paytax(){
           
           System.out.println(" tax payed "+salary*0.2);
       }
    
}
