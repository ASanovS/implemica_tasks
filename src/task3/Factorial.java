package task3;

public class Factorial {
    
    public long findFactorial(int number) {
        long factorialNumb = 1;

        if (number == 0) {
            return factorialNumb;
        } else if (number > 0) {
            for (int i = 0; i < number; i++) {
                factorialNumb = factorialNumb * (i + 1);
                System.out.println(factorialNumb);
            }
        }
        return factorialNumb;
    }
    
    public int sumOfDigitsFactorial(long factorial) {
        int sumOfDigits = 0;

        while (factorial != 0) {
            sumOfDigits += (factorial % 10);
            factorial /= 10;
        }

        return sumOfDigits;
    }
}
