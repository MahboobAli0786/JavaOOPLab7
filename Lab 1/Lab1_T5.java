import java.util.Scanner;
 public class Lab1_T5{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int sum=0;
int total=0;
 int average=0;

System.out.println("Enter the number of courses:");
int num=input.nextInt();
for(int i=1;i<=num;i++)
{System.out.println("Enter the subject marks"+i+":");
int marks=input.nextInt(); 
sum=sum+marks;
total=150*i;
 average=sum/i;

}

System.out.println(" Total marks are:"+total+" Average marks are:"+average+" The sum is:"+sum);


}}