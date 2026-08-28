public class ArrayPeakElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 15, 2, 23, 90, 67};


        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                if (arr[i] >= arr[i + 1]) {
                    System.out.println("Peak: " + arr[i]);
                }
            }

            // Last element
            else if (i == arr.length - 1) {
                if (arr[i] >= arr[i - 1]) {
                    System.out.println("Peak: " + arr[i]);
                }
            }

            // Middle elements
            else {
                if (arr[i] >= arr[i - 1] &&
                    arr[i] >= arr[i + 1]) {
                    System.out.println("Peak: " + arr[i]);
                }
            }
        }
    }
}