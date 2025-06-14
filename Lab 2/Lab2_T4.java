import java.util.Scanner;
public class Lab2_T4{
public static void main(String args[])
{
Scanner read=new Scanner(System.in);
System.out.println("Enter the number:");
int num=read.nextInt();
if(num<=100)
{
int result=num/10;
int remainder=num%10;
if(remainder==result)
{System.out.println("This is Palindrome");

}
else{System.out.println("This is  not Palindrome");
}}
else if (num>=101&&num<=1000)
{
int result=num/100;
int  remainder=num%10;
if(remainder==result)
{System.out.println("This is Palindrome");}
else{
System.out.println("This is  not Palindrome");
}}

}}