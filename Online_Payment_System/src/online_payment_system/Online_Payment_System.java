/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package online_payment_system;

/**
 *
 * @author Mahboob
 */

abstract class Payment{
    
    private double amount;
    private String  currency;
    Payment( double amount, String  currency){
        
        this.amount= amount;
        this.currency= currency;
        
    }
    
    Payment(){
       double amount=0.1;
      String  currency= "rupee";
        
        
    }
    public  void setamount(double amount){
        
        if ( amount <0){
            
            System.out.println(" Amount must be greater than 0");
        }
        this.amount= amount;
    }
  public  void setcurrency(String  currency)  {
      
      
      this.currency= currency;
  }
    
   void paymentinfo(){
       
       System.out.println(" currency is :"+currency);
              System.out.println("amount  is :"+amount);
  
   }
   
   abstract void processpayment();
   
  
       
       
       
   }


 interface seccureTransaction{
     
     void verifyidentity(String username, String password);
     void generatereceipt();
 }

class Creditcardpayment extends Payment implements seccureTransaction{
     private String username;
  private  String password;
  
  void setusername(String username){
      
      
      this.username= username;
  }
  
  void  setpassword (String password){
      
      this.password= password;
      
  }
  
  
   String getusername(){
       
       return username;
   }
    String  getpasword() {
          
       return password;   
      } 
        
        public  void verifyidentity(String username, String password){
             
             System.out.println(" username" +username);
             
             System.out.println(" password"+ password);
             
         } 
    
    void verifyidentity(){
        
        System.out.println(" username:"+ username);
        System.out.println("Password: "+password);
    } 
    
    void processpayment(){
        
        
        System.out.println(" Payment processed successfully");
    }
    
    public void generatereceipt(){
         
         
         System.out.println(" Receipt generated");
     }
}

class PaypalPayment extends Payment implements seccureTransaction{
    
  private String username;
  private  String password;
  
  void setusername(String username){
      
      
      this.username= username;
  }
  
  void  setpassword (String password){
      
      this.password= password;
      
  }
  
  
   String getusername(){
       
       return username;
   }
    String  getpasword() {
          
       return password;   
      } 
        
        public  void verifyidentity(String username, String password){
             
             System.out.println(" username" +username);
             
             System.out.println(" password"+ password);
             
         } 
    
    void verifyidentity(){
        
        System.out.println(" username:"+ username);
        System.out.println("Password: "+password);
    } 
    
    void processpayment(){
        
        
        System.out.println(" Paymentc  was  processed successfully");
    }
    
    public void generatereceipt(){
         
         
         System.out.println(" Receipt   has been generated ");   
    
    
}
}
public class Online_Payment_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Creditcardpayment p1= new Creditcardpayment();
        PaypalPayment p2= new PaypalPayment();
        
      p1.verifyidentity("121ari", "xrq");
        p1.generatereceipt();
       p1.processpayment();
       
       
       p2.verifyidentity("119ari", "xyz");
       p2.generatereceipt();
       p2.processpayment();
    }
    
}
