package Se.lexicon.michael;

public class Exercise6 {
    public static void main(String[] args) {
        double [] numbers = new double[] {43, 5, 23, 17, 2, 14};

        double sum = 0.0;
        for (int i=0; i< numbers.length; i++)
        sum = sum + numbers [i];

        double average = sum / numbers.length;
        System.out.println("Average value = " + average);
    }
}
