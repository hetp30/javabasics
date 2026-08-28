public class TriangularWordAnalyzer {

    public static void main(String[] args) {

        String[] words = {"SKY", "HELLO", "ABC", "JAVA", "WORLD"};

        int count = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int sum = 0;


            for (int j = 0; j < word.length(); j++) {
                char letter = word.charAt(j);
                int value = letter - 'A' + 1;
                sum += value;
            }
            
            int n = 1;
            boolean isTriangular = false;

            while (true) {

                int triangularNumber = n * (n + 1) / 2;

                if (triangularNumber == sum) {

                    isTriangular = true;
                    break;
                }

                if (triangularNumber > sum) {

                    break;
                }

                n++;
            }

            // Print triangular word
            if (isTriangular) {

                System.out.println(word + " = " + sum);

                count++;
            }
        }

        System.out.println("Total triangular words: " + count);
    }
}