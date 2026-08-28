public class EvenFibonacciSum {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        // 2 is already even
        int sum = 2;

        while (true) {
            int next = a + b;
            if (next > 4000000) {
                break;
            }

            if (next % 2 == 0) {
                sum += next;
            }
            a = b;
            b = next;
        }

        System.out.println("Sum of even fibonacci numbers: " + sum);
    }
}