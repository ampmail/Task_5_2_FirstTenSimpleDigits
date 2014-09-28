public class SimpleDigits {

    final static int FIRST_SIMPLE_DIGIT = 3; //(3 ???)
    final static int QTY_DIGITS_TO_FIND = 10;

    public static void main(String[] args) {
        int checkingDigit = FIRST_SIMPLE_DIGIT;
        int counterOfFindedDigits = 0;
        do {
            boolean checkingSimpleDigitFail = false;
            for (int currentNumber = 2; currentNumber < checkingDigit; currentNumber++) {
                if (checkingDigit % currentNumber == 0) {
                    checkingSimpleDigitFail = true;
                    break;
                }
            }
            if (!checkingSimpleDigitFail){
                System.out.print(checkingDigit);
                if(++counterOfFindedDigits < QTY_DIGITS_TO_FIND) System.out.print(", ");
            }
            checkingDigit++;
        } while (counterOfFindedDigits < QTY_DIGITS_TO_FIND);
    }
}