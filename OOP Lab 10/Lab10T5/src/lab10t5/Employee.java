/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10t5;

/**
 *
 * @author Mahboob
 */
public abstract  class  Employee {
    
    String name ;
    String id;
    
    Employee (String name ,
    String id){this.id= id;
    this.name= name;
        
        
        
        
    }
    
    
    abstract double claculatesalary();
    
}
