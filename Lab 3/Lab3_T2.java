import java.util.Scanner;
public class Lab3_T2{
public static void main(String args[])
{
Scanner read=new Scanner(System.in);
char symbols[]=new char[5];
for(int i=0;i<symbols.length;i++)
{
System.out.println("Enter the symbols");
symbols[i]=read.next().charAt(0);
}

for(int i=0;i<5;i++)
{
System.out.println("ASCII code of symbols are:"+((int)symbols[i]));

}

}}



