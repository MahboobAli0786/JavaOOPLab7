/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentarray;

/**
 *
 * @author Mahboob
 */
public class Studentarray {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int student []= new int[5];
        for( int i=0;i<student.length;i++){
            
           student [i]= i; 
            
        }
        
         for( int i=0;i<student.length;i++){
            
             System.out.println(student[i]); 
            
        }
      
    }
    
}
