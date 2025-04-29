package randomnum0to20_task6;

import java.util.Random;

public class Randomnum0to20_task6 {

    Random rand = new Random();

    void checkfrequency() {
        
        int[] frequency = new int[21];


        for (int i = 0; i < 100; i++) {
            int randnum = rand.nextInt(21);
            frequency[randnum]++; 
        }

    
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Number " + i + ": " + frequency[i] + " times");
        }
    }

    public static void main(String[] args) {
        Randomnum0to20_task6 t1 = new Randomnum0to20_task6();
        t1.checkfrequency();
    }
}
