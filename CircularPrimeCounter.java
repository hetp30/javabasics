public class CircularPrimeCounter {

    public static void main(String[] args) {

        boolean[] prime = new boolean[100];
        for (int i = 2; i < 100; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i < 100; i++) {

            if (prime[i]) {
                for (int j = i * i; j < 100; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;

        for (int number = 2; number < 100; number++) {

            if (prime[number]) {
                int original = number;
                int rotation = number;
                boolean isCircular = true;
                if (number < 10) {
                    count++;
                    System.out.println(number);
                }

                else {

                    int firstDigit = rotation / 10;
                    int lastDigit = rotation % 10;

                    rotation = lastDigit * 10 + firstDigit;

                    if (prime[rotation]) {
                        count++;
                        System.out.println(original);
                    }
                }
            }
        }

        System.out.println("Total circular primes: " + count);
    }
}