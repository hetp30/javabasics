public class DistinctPowers {

    public static void main(String[] args) {

        int[] powers = new int[16];

        int count = 0;


        for (int a = 2; a <= 5; a++) {
            for (int b = 2; b <= 5; b++) {
                int result = (int) Math.pow(a, b);
                boolean alreadyExists = false;

                for (int i = 0; i < count; i++) {
                    if (powers[i] == result) {
                        alreadyExists = true;
                        break;
                    }
                }

                if (alreadyExists == false) {
                    powers[count] = result;
                    count++;
                }
            }
        }

        // Print all unique values
        System.out.println("Unique powers:");

        for (int i = 0; i < count; i++) {

            System.out.println(powers[i]);
        }
        System.out.println("Total unique values: " + count);
    }
}