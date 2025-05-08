/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10t5;

/**
 *
 * @author Mahboob
 */
public class Parttimeemployee extends Employee implements Taxpayer {
    Parttimeemployee(int salary, String id,String name,double hourlyrate
  ){
        super(name,id);
        this.hourlyrate= hourlyrate;
        
        
        
        
    }
    
    
  double  salary;
  double  hourlyrate ;
    
     double claculatesalary( ){
         salary= hourlyrate*100;
         return salary;
         
     }
   public     void paytax(){
           
           System.out.println(" tax payed "+salary*0.1);
       }  
    
}
