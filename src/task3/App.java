package task3;

public class App {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        
        int sum = factorial.sumOfDigitsFactorial(factorial.findFactorial(20));
        System.out.println(sum);
    }
}
