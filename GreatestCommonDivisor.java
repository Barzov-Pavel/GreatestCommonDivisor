public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1010, 10));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int number1, int number2) {
        if (number1 < 10 || number2 < 10) {
            return -1;
        }

        int greatestDivisor = 0;
        int divisor;

        if (number1 < number2) {
            for (int i = 1; i <= number1; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    divisor = i;
                    if (divisor > greatestDivisor) {
                        greatestDivisor = divisor;
                    }
                }
            }
        } else if (number2 < number1) {
            for (int i = 1; i <= number2; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    divisor = i;
                    if (divisor > greatestDivisor) {
                        greatestDivisor = divisor;
                    }
                }
            }
        }

        return greatestDivisor;
    }
}
