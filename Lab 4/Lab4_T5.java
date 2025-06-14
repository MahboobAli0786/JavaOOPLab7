import java.util.Scanner;
public class Lab4_T5{
public static void main(String args[])
{ 
Scanner read=new Scanner(System.in);
int arr1[][]=new int [3][3];
int arr2[][]=new int [3][3];

System.out.println("Enter values in an array");
for (int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
arr1[i][j]=read.nextInt(); 
arr2[j][i]=arr1[i][j];
}}

System.out.println("Transposted array is");
for (int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print( " " +arr2[i][j]);

}System.out.println( );}




}}