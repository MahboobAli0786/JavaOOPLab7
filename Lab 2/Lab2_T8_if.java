import java.util.Scanner;
public class Lab2_T8_if{
public static void main(String args[])
{Scanner read=new Scanner(System.in);
char letter;
do{
System.out.println("Enter the first number");
int n1=read.nextInt();
System.out.println(" Enter the second number");
int n2=read.nextInt();
System.out.println(" Enter the second arithmetic operation + - / * ");
char symbol=read.next().charAt(0);
if(symbol=='+')
{
System.out.println(" The result of addition is:"+(n1+n2));}
else if(symbol=='-')
{
System.out.println(" The result of subtraction is:"+(n1-n2));}

else if(symbol=='/')
{System.out.println(" The result of division is:"+(n1/n2));}
else if(symbol=='*')
{System.out.println(" The result of multiplicatin is:"+(n1*n2));}
else 
System.out.println(" Invalid input:");
System.out.println(" To continue press N or n if not press any other key");
letter=read.next().charAt(0);
}while(letter=='n'||letter=='N');
}}
