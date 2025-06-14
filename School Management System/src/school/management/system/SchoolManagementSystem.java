/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package school.management.system;

/**
 *
 * @author Mahboob
 */

class person {
    
   private  String name;
     private int age;
    
     
      person( String name,int age){
      
      
      if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        

      this.name= name;
    }
    person(String name){
        
    
      this.name= name;
    }
   
    
    public void setname(String name){
        
        this.name= name;
    }
    public String  getname (){
        
        return name;
    }
    
    
    public void setage (int age){
        
        
        this.age= age;
    }
    
    public int getage (){
        
        return age ;
    }
    
    
}


interface Evaluatable{
    
    
   void evaluatePerformance();
}

class Student extends person implements Evaluatable {
    String roll_num;
    
     Student( String roll_num,String name,int age){
         
         
         super( name, age);
         
         
         this.roll_num= roll_num;
         
            
     }
public void evaluatePerformance() {
    System.out.println("Roll Number: " + roll_num);
    System.out.println("Performance: Good. Needs improvement in practicals.");
}
  }
     
      abstract class Course{
          
           Course(String  courseName){
               
             this.courseName= courseName;  
           }
          
          String  courseName;
          abstract void  getCourseDetails();
      }


    class  MathCourse extends Course{
        
         
          MathCourse(String  courseName){
               
          super(courseName);
           }
        
      void getCourseDetails() {
    System.out.println("Course Name: " + courseName);
    System.out.println("This course covers algebra, calculus, and statistics.");
}
        
    }
    
    class EnglishCourse  extends  Course {
        
          EnglishCourse(String  courseName){
               
          super(courseName);
           }
        void getCourseDetails() {
    System.out.println("Course Name: " + courseName);
    System.out.println("This course focuses on grammar, vocabulary, and writing skills.");
}

        
    }
    

class teacher extends person {
    
    
    String subject;
    
    teacher ( String name,int age,String subject){
        
        
        super( name, age);
        this.subject= subject;
                
        
        
    }
    
    
    
}





public class SchoolManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
    // Creating Person objects
    person p1 = new person("Ali");
    person p2 = new person("Ahmed", 20);
    
    System.out.println("Person 1 Name: " + p1.getname());
    System.out.println("Person 2 Name: " + p2.getname() + ", Age: " + p2.getage());
    
    // Creating Student
    Student s1 = new Student("AI-119", "Mahboob", 20);
    System.out.println("\n--- Student Details ---");
    System.out.println("Name: " + s1.getname());
    System.out.println("Age: " + s1.getage());
    s1.evaluatePerformance();  // This prints roll number and evaluation message
    
    // Creating Teacher
    teacher t1 = new teacher("Yasir", 35, "English");
    System.out.println("\n--- Teacher Details ---");
    System.out.println("Name: " + t1.getname());
    System.out.println("Age: " + t1.getage());
    System.out.println("Subject: " + t1.subject);
    
    // Creating and displaying course details
    EnglishCourse c1 = new EnglishCourse("English");
    MathCourse c2 = new MathCourse("Math");
    
    System.out.println("\n--- Course Details ---");
    c1.getCourseDetails();
    c2.getCourseDetails();
    
    try{p1.setage(-1);
        
        
    } catch(   IllegalArgumentException e){
        
        System.out.println(" "+e.getMessage());
    }


      
    }}
    

