package task3;

/*
 * Task 3
 * Find the sum of the digits in the number 100! (i.e. 100 factorial) 
 * {Correct answer: 648}
 */

import java.math.BigInteger;

public class App {
    public static void main(String[] args) {

        // Value to find factorial number
        BigInteger startValueFactorial = BigInteger.valueOf(1);
        BigInteger numberOfMultiple = BigInteger.valueOf(1);

        // The number whose factorial will be calculated
        BigInteger inputFactorialValue = BigInteger.valueOf(100);

        //calculation of the sum of all numbers of the factorial 100
        while (inputFactorialValue != BigInteger.ZERO) {
            inputFactorialValue = inputFactorialValue.subtract(BigInteger.ONE);
            startValueFactorial = startValueFactorial.multiply(numberOfMultiple);
            numberOfMultiple = numberOfMultiple.add(BigInteger.ONE);
        }

        System.out.println("Factorial 100! = " + startValueFactorial);

        // Casting a factorial value to a string type
        String factorialToString = startValueFactorial.toString();

        //Initializing an array equal to the length of the string
        int[] factorialToInt = new int[factorialToString.length()];

        // Filling an array with numbers from a string
        for (int i = 0; i < factorialToString.length(); i++) {
            factorialToInt[i] = Character.getNumericValue(factorialToString.charAt(i));
        }

        // Calculate the sum of all numbers in an array.
        int sumOfDigits = 0;
        for (int fi : factorialToInt) {
            sumOfDigits += fi;
        }
        System.out.println("Sum of digits factorial = " + sumOfDigits);
    }
}
