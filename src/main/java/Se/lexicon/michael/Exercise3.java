package Se.lexicon.michael;

import java.util.Arrays;
class Exercise3 {

    public static void main(String[] args) {
        String [] cities = {"Paris", "London", "New York", "Stockholm"};
        System.out.println("Unsorted = " + Arrays.toString(cities));
                Arrays.sort(cities);
        System.out.println("Sorted = " + Arrays.toString(cities));
    }
}