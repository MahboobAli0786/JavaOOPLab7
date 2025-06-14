import java.util.Scanner;
public class Lab2_T8_s{
public static void main(String args[])
{Scanner read=new Scanner(System.in);
System.out.println("Enter the first number");
int n1=read.nextInt();
System.out.println(" Enter the second number");
int n2=read.nextInt();
System.out.println(" Enter the second arithmetic operation + - / * ");
char symbol=read.next().charAt(0);
switch(symbol)
{
case'+':
System.out.println(" The result of addition is:"+(n1+n2));
break;
case'-':
System.out.println(" The result of subtraction is:"+(n1-n2));
break;
case'/':
System.out.println(" The result of division is:"+(n1/n2));
break;
case'*':
System.out.println(" The result of multiplicatin is:"+(n1*n2));
break;
default:{System.out.println(" Invalid input:");


}}
