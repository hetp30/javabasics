public class ConsecutivePrimeSum {
    public static void main(String[] args) {

        boolean[] isPrime = new boolean[100];

        for (int i = 2; i < 100; i++) {
            isPrime[i] = true;
        }

        // Find prime numbers
        for (int i = 2; i * i < 100; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < 100; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int[] primes = new int[100];
        int primeCount = 0;

        for (int i = 2; i < 100; i++) {
            if (isPrime[i]) {
                primes[primeCount] = i;
                primeCount++;
            }
        }

        int maxLength = 0;
        int bestPrime = 0;

        // Check consecutive prime sums
        for (int i = 0; i < primeCount; i++) {
            int sum = 0;

            for (int j = i; j < primeCount; j++) {
                sum += primes[j];

                if (sum >= 100) {
                    break;
                }

                int length = j - i + 1;

                if (isPrime[sum] && length > maxLength) {
                    maxLength = length;
                    bestPrime = sum;
                }
            }
        }

        System.out.println("Prime: " + bestPrime);
        System.out.println("Sequence length: " + maxLength);
    }
}