import java.util.Scanner;
public class Lab4_T3{
public static void main(String args[])
{ int sum=0;

Scanner read=new Scanner(System.in);
int arr[][]=new int [4][4];
System.out.println("Enter values in an array");
for (int i=0;i<4;i++)
{
for(int j=0;j<4;j++)
{
arr[i][j]=read.nextInt();
}}

for (int i=0;i<4;i++)
{for(int j=0;j<4;j++)
{System.out.print ("  "+ (arr[i][j]));

}
System.out.println();
}
for (int i=0;i<4;i++)
{ sum+=arr[i][i];
}

System.out.println("Sum of array diagonals is:" +(sum));

}}