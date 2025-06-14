
import java.util.Scanner;
public class Lab3_T3bb{
public static void main(String args[])
{
Scanner read=new Scanner (System.in);
char symbols[]=new char[5];
char arr2[]=new char[5];
for(int i=0;i<symbols.length;i++)
{
System.out.println("Enter the symbols");
symbols[i]=read.next().charAt(0);}
char temp=0;
for(int i=0;i<=4;i++)
{

for(int j=0;j<=4-1-i;j++)
{
if(symbols[j]>symbols[j+1])
{
temp=symbols[j];
symbols[j]=symbols[j+1];
symbols[j+1]=temp;

}
}
for(int j=0;j<=4-i;j++)
arr2[i]=symbols[i];
}


for(int i=0;i<5;i++)
{System.out.println("Sorted arry:"+(int)(arr2[i]));
}



}}