import java.util.Scanner;
public class Lab1_T2{
public static void main(String args[]){
Scanner read=new Scanner(System.in);
System.out.println("Enter the number between 1 to 100:");
int num=read.nextInt();

while(num>0){
if( num%2==0)
{

}
else{
System.out.println( "  odd numbers are:"+num);
}
num--;
}

}}