package task3;

import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        BigInteger fct = new BigInteger("1");
        BigInteger number = new BigInteger("100");

        for (BigInteger i = new BigInteger("1"); i.compareTo(number) <= 0; i = i.add(BigInteger.ONE)) {
            fct = fct.multiply((i));
        }

        String factorialToString = fct.toString();
        int[] factorialToInt = new int[160];

        for (int i = 0; i < factorialToString.length(); i++) {
            factorialToInt[i] = Character.getNumericValue(factorialToString.charAt(i));
        }
        
        int sumOfDigits = 0;

        for (int fi : factorialToInt) {
            sumOfDigits += fi;
        }
        System.out.println("Sum of digits factorial = " + sumOfDigits);
    }
}
