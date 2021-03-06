package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int count = 1;
        List<String> current = new ArrayList<>();
        current.add("()");
        
        List<String> newList = new ArrayList<>();
        String temp;

        int countBrackets;
        while (true) {
            System.out.println("Enter pairs of brackets number");
            try (Scanner input = new Scanner(System.in)) {
                if (input.hasNextInt()) {
                    countBrackets = input.nextInt();
                    break;
                }
            }
        }

        //Checking the input value for 0
        if (countBrackets <= 0) {
            System.out.println("Count of brackets should be Integer and more than 0");
        }

        while (count < countBrackets) {
            for (String o : current) {
                for (int i = 0; i < o.length(); i++) {
                    // Add "()" before each "(" or ")" and add in list if it is not contain
                    temp = o.substring(0, i) + "()" + o.substring(i);
                    if (newList.contains(temp))
                        continue;
                    newList.add(temp);
                }
            }
            
            current = newList;
            newList = new ArrayList<>();
            count++;
        }
        
        System.out.println(current.toString());
        System.out.println("Correct brackets expressions = " + current.size());
    }
}