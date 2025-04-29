package stringtask;

import java.util.Scanner;

public class Stringtask {

    public static String reverseString(String input) {
        String reversed = "";
        for(int i = input.length()-1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String word = read.nextLine();
        
        String reversed = reverseString(word);
        System.out.println("Reversed String is: " + reversed);
        
       
    }
}