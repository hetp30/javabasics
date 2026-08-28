public class SpiralMatrix {
    public static void main(String[] args) {

        int n = 5;
        int[][] matrix = new int[n][n];

        int number = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        // Fill matrix in spiral order
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                matrix[top][i] = number++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = number++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = number++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = number++;
                }
                left++;
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            sum += matrix[i][n - 1 - i];
        }

        // Center element is counted twice
        sum -= matrix[n / 2][n / 2];

        System.out.println("Diagonal sum: " + sum);
    }
}