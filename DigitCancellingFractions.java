public class DigitCancellingFractions {

    public static void main(String[] args) {

        for (int num = 10; num < 100; num++) {

            for (int den = num + 1; den < 100; den++) {

                int numTens = num / 10;
                int numUnits = num % 10;

                int denTens = den / 10;
                int denUnits = den % 10;

                if (numUnits == 0 && denUnits == 0) {
                    continue;
                }

                if (numUnits == denTens && denUnits != 0) {

                    if (num * denUnits == den * numTens) {
                        System.out.println(num + "/" + den);
                    }
                }

                else if (numTens == denUnits && denTens != 0) {

                    if (num * denTens == den * numUnits) {
                        System.out.println(num + "/" + den);
                    }
                }

                else if (numTens == denTens && denUnits != 0) {

                    if (num * denUnits == den * numUnits) {
                        System.out.println(num + "/" + den);
                    }
                }

                else if (numUnits == denUnits && denTens != 0) {

                    if (num * denTens == den * numTens) {
                        System.out.println(num + "/" + den);
                    }
                }
            }
        }
    }
}