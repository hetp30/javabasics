public class OperationSwitcher {
    public static void main(String[] args) {

        double[] numbers = {10, 5, 2, 4};
        char[] operators = {'+', '*', '-'};

        double result = numbers[0];

        // Perform operations one by one
        for (int i = 0; i < operators.length; i++) {
            double nextNumber = numbers[i + 1];

            switch (operators[i]) {
                case '+':
                    result += nextNumber;
                    break;

                case '-':
                    result -= nextNumber;
                    break;

                case '*':
                    result *= nextNumber;
                    break;

                case '/':
                    if (nextNumber != 0) {
                        result /= nextNumber;
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;

                default:
                    System.out.println("Invalid operator");
            }
        }

        System.out.println("Final result: " + result);
    }
}