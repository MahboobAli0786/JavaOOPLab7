import java.util.Scanner;
 public class Lab2_T6_other{
public static void main(String args[])
{
int pin_code=7866;
Scanner read=new Scanner(System.in);

int attempt=0;
while(attempt<4){
System.out.println("Enter the pin code:");
int guess_pincode=read.nextInt();
if(pin_code==guess_pincode)
{
if(attempt==0 )
{
System.out.println("Welcome:");
}
else{
System.out.println("Congrats. pin is unlocked:");

} break;}
else{
attempt++;
if(attempt<4)
{
System.out.println("Incorrect PIN. Try again:");}}}
if(attempt==4)
{
System.out.println("Sorry limit reached. Acces denied:"
);}
}}


