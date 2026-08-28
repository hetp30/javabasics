public class PrimePairEvaluator {
    public static void main(String[] args) {

        int[] primes = {3, 7, 11, 13, 17};

        for (int i = 0; i < primes.length; i++) {
            for (int j = i + 1; j < primes.length; j++) {

                int p1 = primes[i];
                int p2 = primes[j];

                int val1 = Integer.parseInt("" + p1 + p2);
                int val2 = Integer.parseInt("" + p2 + p1);

                if (isPrime(val1) && isPrime(val2)) {
                    System.out.println(p1 + " and " + p2);
                }
            }
        }
    }

    // Check if a number is prime
    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}