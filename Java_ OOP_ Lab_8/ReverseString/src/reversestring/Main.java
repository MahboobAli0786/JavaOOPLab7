package reversestring;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



import java.util.Scanner;

/**
 *
 * @author Mahboob
 */



 
public class Main {
    
    Scanner read= new Scanner(System.in);
 
 String Word= read.nextLine();
 String reversed="";
 for(int i=Word.length()-1;i>=0;i--)
 {
     reversed=reversed+Word.charAt(i);
     
     
 }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m1= new Main();
        
         System.out.println(" Enter the number to reverse");

        // TODO code application logic here
    }
    
}
