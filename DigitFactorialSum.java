public class DigitFactorialSum {

    public static void main(String[] args) {

        int totalSum = 0;

        // Check numbers from 10 to 50000
        for (int i = 10; i <= 50000; i++) {

            int number = i;
            int factorialSum = 0;

            while (number > 0) {

                int digit = number % 10;

                // factorial addition
                factorialSum += getFactorial(digit);
                number = number / 10;
            }

            if (factorialSum == i) {

                System.out.println(i);

                totalSum += i;
            }
        }

        // Print total sum
        System.out.println("Total sum: " + totalSum);
    }


    // Return factorial based on digit
    public static int getFactorial(int digit) {

        switch (digit) {

            case 0:
                return 1;

            case 1:
                return 1;

            case 2:
                return 2;

            case 3:
                return 6;

            case 4:
                return 24;

            case 5:
                return 120;

            case 6:
                return 720;

            case 7:
                return 5040;

            case 8:
                return 40320;

            case 9:
                return 362880;

            default:
                return 0;
        }
    }
}