import java.util.Arrays;
import java.util.Scanner;
public class Lab3_T3{
public static void main(String args[])
{
Scanner read=new Scanner (System.in);
char symbols[]=new char[5];
char arr2[]=new char[5];
for(int i=0;i<symbols.length;i++)
{
System.out.println("Enter the symbols");
symbols[i]=read.next().charAt(0);}

for(int i=0;i<symbols.length;i++)
{arr2[i]=symbols[i];
}
Arrays.sort(arr2);

for(int i=0;i<5;i++)
{System.out.println("Sorted arry:"+(arr2[i]));
}

}}