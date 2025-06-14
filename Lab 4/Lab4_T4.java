import java.util.Scanner;
public class Lab4_T4{
public static void main(String args[])
{ int odd=0;
int even=0;
int prime=0;
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
{
for(int j=0;j<4;j++)
{
if(arr[i][j]%2==0)
even++;
else
odd++;
if(arr[i][j]==2||arr[i][j]==3||arr[i][j]==5||arr[i][j]==7)
{
prime++;
}else if(arr[i][j]%2==0||arr[i][j]%3==0||arr[i][j]%5==0||arr[i][j]%7==0)
{
}
else{
prime++;}}}
System.out.println("Total even numbers in array:"+even);
System.out.println("Total odd numbers in array:"+odd);
System.out.println("Total prime numbers in array:"+prime);



}}