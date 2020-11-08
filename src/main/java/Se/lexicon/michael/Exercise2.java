package Se.lexicon.michael;

public class Exercise2 {

    public static int findNumber (int[] indexOf, int K){
        if (indexOf == null) return -1;
        int number = indexOf.length;
        int i = 0;
        while (i < number) {
            if (indexOf[i]==K) return i;
            else i=i+1;
        }
        return -1 ;

    }


    public static void main(String[] args) {
        int[] indexOf = {9, 7, 5, 6, 3, 2, 1, 4, 0, 8};
        System.out.println("index of 5 = " + findNumber(indexOf,5));


    }
}
