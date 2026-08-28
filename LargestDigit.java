public class LargestDigit {

    public static void main(String[] args) {
        int[] numbers = {123, 456, 789, 234, 908};
        int maxDigit = 0;
        for(int i=0;i<numbers.length;i++){
            int number =numbers[i];
            while(number > 0){
                int digit = number % 10;
                if(digit > maxDigit){
                    maxDigit = digit;
                }
                number=number/10;
            }
        }
        System.out.println("Max Dig : " + maxDigit);
    }
}