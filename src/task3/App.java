package task3;

/*
 * Task 3
 * Find the sum of the digits in the number 100! (i.e. 100 factorial) 
 * {Correct answer: 648}
 */

import java.math.BigInteger;

public class App {
    public static void main(String[] args) {

        //Value to find factorial number
        BigInteger startValueFactorial = new BigInteger("1");

        //The number whose factorial will be calculated
        BigInteger inputFactorialValue = new BigInteger("100");

        for (BigInteger i = new BigInteger("1"); i.compareTo(inputFactorialValue) <= 0; i = i.add(BigInteger.ONE)) {
            startValueFactorial = startValueFactorial.multiply((i));
        }

        System.out.println("Factorial 100! = " + startValueFactorial);

        //Casting a factorial value to a string type
        String factorialToString = startValueFactorial.toString();

        //Calculating the length of a string to create an array of Integer
        System.out.println("String length = " + factorialToString.length());
        int[] factorialToInt = new int[158];

        //Filling an array with numbers from a string
        for (int i = 0; i < factorialToString.length(); i++) {
            factorialToInt[i] = Character.getNumericValue(factorialToString.charAt(i));
        }

        //Calculate the sum of all numbers in an array.
        int sumOfDigits = 0;
        for (int fi : factorialToInt) {
            sumOfDigits += fi;
        }
        System.out.println("Sum of digits factorial = " + sumOfDigits);
    }
}
