import java.util.Scanner;
public class Lab3_T5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Enter any 10 numbers:");
        int prime = 0;
        int odd = 0;
        int even = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = read.nextInt();

          
            if (num[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            if (num[i] > 1) {
                int divisor = 0;                 
                for (int j = 2; j < num[i]; j++) {
                    if (num[i] % j == 0) {
                        divisor++; }
                }
                if (divisor == 0) {
                    prime++;
                }}  }
        
        System.out.println("Total number of Even numbers: " + even);
        System.out.println("Total number of Odd numbers: " + odd);
        System.out.println("Total number of Prime numbers: " + prime);
  }
}
