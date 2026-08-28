public class CollatzSequence {

    public static void main(String[] args) {

        int maxLength = 0;
        int bestNumber = 0;

        // Check every number below 1000
        for (int i = 1; i < 1000; i++) {

            long currentNumber = i;
            int length = 0;

            // Continue until the number becomes 1
            while (currentNumber != 1) {

                // Check if number is even or odd
                switch ((int) (currentNumber % 2)) {

                    case 0:
                        // Even number
                        currentNumber = currentNumber / 2;
                        break;

                    case 1:
                        // Odd number
                        currentNumber = 3 * currentNumber + 1;
                        break;
                }

                // Count each step
                length++;
            }

            // Check if this chain is longer
            if (length > maxLength) {

                maxLength = length;
                bestNumber = i;
            }
        }

        System.out.println("Starting number: " + bestNumber);
        System.out.println("Longest chain length: " + maxLength);
    }
}