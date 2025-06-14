import java.util.Scanner;
public class Lab3_T4{

public static void main(String args[])
{
Scanner read=new Scanner(System.in);

int marks[]=new int [5];
float sum=0;
float average=0;
int max_marks=0;
for(int i=0;i<5;i++)
{
System.out.println("Enter the Subjects marks "+(i+1));
marks[i]=read.nextInt();
sum=sum+marks[i];
if(max_marks<marks[i])
max_marks=marks[i];
}

System.out.println("The sum is:"+(sum)+"\nAverage is:  "
+(sum/5)+" \n  Percentage is:  "+((sum/750)*100)+ "\n  the maximum  marks are:"+(max_marks));







}}