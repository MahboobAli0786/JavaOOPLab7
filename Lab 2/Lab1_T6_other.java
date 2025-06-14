import java.util.Scanner;
 public class Lab1_T6_other{
public static void main(String args[])
{
int pin_code=7866;
Scanner read=new Scanner(System.in);
int i=0;
int attempt=0;
while(i<4){

System.out.println("Enter the pin code:");

int guess_pincode=read.nextInt();

if(pin_code==guess_pincode)
{
if(attempt==0 )
{
System.out.println("Welcome:");
break;}
else{
System.out.println("Congrats. pin is unlocked:"
break;);
}}

System.out.println("Try again:");
attempt++;
i++;
if(attempt==3)
System.out.println("Sorry limit reached. Acces denied:");

}

}}


