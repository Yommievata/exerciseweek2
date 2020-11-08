package Se.lexicon.michael;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int [] firstArray = {1, 15, 20};
        int [] secondArray = new int[3];

        System.out.println("First Array = " + Arrays.toString(firstArray));

        for (int i= 0; i < firstArray.length; i++) {
            secondArray [i] = firstArray [i];
        }
        System.out.println("Second Array: " + Arrays.toString(secondArray));
    }
}
