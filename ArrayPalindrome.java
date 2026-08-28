public class ArrayPalindrome {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1};

        int left = 0;
        int right = arr.length - 1;

        boolean isPalindrome = true;

        while (left < right) {

            // If numbers are different, not a palindrome
            if (arr[left] != arr[right]) {

                isPalindrome = false;
                break;
            }

            // Move towards the middle
            left++;
            right--;
        }

        // Print result
        if (isPalindrome) {

            System.out.println("Palindrome");

        } else {

            System.out.println("Not a Palindrome");
        }
    }
}