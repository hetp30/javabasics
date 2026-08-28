public class PandigitalArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean[] seen = new boolean[10];

        boolean isValid = true;

        for (int i = 0; i < arr.length; i++) {

            int number = arr[i];
            if (number < 1 || number > 9) {
                isValid = false;
                break;
            }

            if (seen[number] == true) {
                isValid = false;
                break;
            }

            seen[number] = true;
        }

        if (isValid) {

            System.out.println("Valid Pandigital Array");

        } else {

            System.out.println("Invalid Pandigital Array");
        }
    }
}