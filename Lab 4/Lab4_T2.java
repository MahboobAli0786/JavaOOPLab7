import java.util.Scanner;
public class Lab4_T2{
public static void main(String args[])
{ Scanner read=new Scanner (System.in);
char  arr[][]=new char [2][3];
System.out.println("Enter the symbols");
for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
arr[i][j]=read.next().charAt(0);

}

}
System.out.println("ASCII code of symbols are:");
for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
{
System.out.println((int) arr[i][j]);

}

}





}}


