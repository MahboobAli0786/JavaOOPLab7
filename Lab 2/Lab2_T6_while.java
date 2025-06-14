import java.util.Scanner;
 public class Lab1_T6_while{
public static void main(String args[])
{
int pin_code=7866;
Scanner read=new Scanner(System.in);
int i=0;
while(i<4){
System.out.println("Enter the pin code:");

int guess_pincode=read.nextInt();
if(i==0)
{
if(pin_code==guess_pincode)
{

System.out.println("Welcome:");
break;
}
}
if(pin_code==guess_pincode)
{
System.out.println("Congrats. pin is unlocked:");
break;}

System.out.println("Try again:");
i++;}
if(i==3)
System.out.println("Sorry limit reached. Acces denied:");


}}


