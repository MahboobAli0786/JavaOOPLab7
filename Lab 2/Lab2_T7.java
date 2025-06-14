import java.util.Scanner;
 public class Lab2_T7{
public static void main(String args[])
{
Scanner  read=new Scanner(System.in);
System.out.println("Item Type "+"  Unit Price \n"+
"Apple :   300\n"+
" PineApple :   500\n "+
"Coconut:   :400 \n"+
"Oranges :   100\n" );
System.out.println("Enter the number of items you want to buy");
 int item=read.nextInt();
 int bill=0;
for(int i=1;i<=item;i++)
{
System.out.println("Enter 1 for apple\n"+
"2- for Pineapple\n"+
"3- for Coconut\n"+
"4- for Oranges\n");
 int  n=read.nextInt();
if(n==1)
{System.out.println("Enter number of apples you want");
 int q1=read.nextInt();
bill+=q1*300;}
else if(n==2)
{System.out.println("Enter number of Pineapples you want");
  int q2=read.nextInt();
bill+=q2*500;}
else if(n==3)
{System.out.println("Enter number of  Coconut you want");
int q3=read.nextInt();
bill+=q3*400;}
else if(n==4)
{System.out.println("Enter number of  Oranges you want");
  int q4=read.nextInt();
bill+=q4*100;
}}
System.out.println("Your total bill is:"+(bill));}}
