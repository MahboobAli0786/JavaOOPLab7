/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
class Animal{
    
   int age ;
   String name;
   Animal(String name,int age ){
       
       this.age= age;
       this.name= name;
     
       
       
   }
    
    
}

class  Dog extends Animal{
    
   Dog (String name,int age){
       
       super(name,age);
       
       
   } 
    
    
}

class  Cat extends Animal{
    
  Cat(String name,int age){
       
       super(name,age);
       
       
   } 
}
    

/**
 *
 * @author Mahboob
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Animal a1= new  Dog("African",10);
         Animal a2= new  Cat (" Pinky",4);
         
         
         System.out.println(a1.age);
         System.out.println(a1.name);
         
         System.out.println(a2.age);
         System.out.println(a2.name);
    }
    
}
