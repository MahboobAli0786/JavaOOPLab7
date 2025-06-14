import java.util.Scanner;
public class Lab2_T3{
public static void main(String args[])
{ 
Scanner read=new Scanner(System.in);
System.out.println(" Enter any Symbol:");
char symbol=read.next().charAt(0);
switch(symbol){
case'a':
case'e':
case'i':
case'o':
case'u':
case'A':
case'E':
case'I':
case'O':
case'U':
System.out.println("Letter is vowel");
break;
case 'y':
case 'Y':
case 'w':
case 'W':
System.out.println("Letter is  semi_vowel");
break;

default:{
System.out.println("Letter is  consonant");


}}

}}