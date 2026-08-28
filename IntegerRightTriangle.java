public class IntegerRightTriangle {
    public static void main(String[] args) {

        int[] solutions = new int[501];

        // Find all possible right triangles
        for (int a = 1; a <= 250; a++) {
            for (int b = a + 1; b <= 250; b++) {

                double cValue = Math.sqrt(a * a + b * b);
                int c = (int) cValue;

                if (cValue == c) {
                    int perimeter = a + b + c;

                    if (perimeter <= 500) {
                        solutions[perimeter]++;
                    }
                }
            }
        }

        int maxSolutions = 0;
        int bestPerimeter = 0;

        // Find perimeter with maximum solutions
        for (int p = 1; p <= 500; p++) {
            if (solutions[p] > maxSolutions) {
                maxSolutions = solutions[p];
                bestPerimeter = p;
            }
        }

        System.out.println("Best perimeter: " + bestPerimeter);
        System.out.println("Number of solutions: " + maxSolutions);
    }
}