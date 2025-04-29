/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package counting_vowel_string;

/**
 *
 * @author Mahboob
 */
import java.util.Scanner;
public class Counting_Vowel_String {

    int num_of_consonants;
    int num_of_vowel;
   void countVowelandConsonant( String str){
       
       for( int i=0;i<str.length();i++){
           
         char ch= Character.toLowerCase(str.charAt(i));
         if(Character.isLetter(ch))
         {
             
             
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    num_of_vowel++;
                } else {
                    num_of_consonants++;
                }
            }
        }
        System.out.println("Vowels: " + num_of_vowel + ", Consonants: " + num_of_consonants);
    }

   
     
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

Scanner read = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = read.nextLine();

        Counting_Vowel_String obj = new Counting_Vowel_String();
        obj.countVowelandConsonant(input);
    }
    
}
