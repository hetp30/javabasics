public class SubStringDivisibility {
    public static void main(String[] args) {

        int[] digits = {1, 4, 0, 6, 3, 5, 7, 2, 8, 9};
        int[] primes = {2, 3, 5, 7, 11, 13, 17};

        boolean isValid = true;

        // Check each 3 digit number
        for (int i = 1; i <= 7; i++) {
            int subNumber = digits[i] * 100
                    + digits[i + 1] * 10
                    + digits[i + 2];

            if (subNumber % primes[i - 1] != 0) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            System.out.println("Number satisfies all divisibility rules");
        } else {
            System.out.println("Number does not satisfy the rules");
        }
    }
}