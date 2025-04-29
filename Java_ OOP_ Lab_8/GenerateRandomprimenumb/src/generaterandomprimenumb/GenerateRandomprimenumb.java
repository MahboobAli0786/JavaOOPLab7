package generaterandomprimenumb;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Mahboob
 */

class Randomclass {
    int generateRandomPrime(int min, int max) {
        Random rand = new Random();
        int randnum;
        do {
           
            randnum = rand.nextInt((max - min) + 1) + min;
        } while (!ISprime(randnum)); 
        
        return randnum;
    } 
    
    boolean ISprime(int randnum) {
        int divisor = 0;
        if (randnum == 2 || randnum == 3 || randnum == 5 || randnum == 7) return true;
        if (randnum % 2 == 0 || randnum % 3 == 0 || randnum % 5 == 0 || randnum % 7 == 0) return false;
        return true;
    }
}

public class GenerateRandomprimenumb {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the min number");
        int min = read.nextInt();
        System.out.println("Enter the max number");
        int max = read.nextInt();
        
        Randomclass r1 = new Randomclass();
        int prime = r1.generateRandomPrime(min, max);
        System.out.println("Random prime number between " + min + " and " + max + " is: " + prime);
    }
}