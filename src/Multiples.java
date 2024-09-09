public class Multiples {
    public static void main(String[] args) {
        // Prints how many multiples of 3 or 5 there are below 1000

        int counter = 0;

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
