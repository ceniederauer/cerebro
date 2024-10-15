import FizzBuzz.FizzBuzz;
import Texts.Welcome;
import TwoSum.TwoSum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Welcome welcome = new Welcome();
        FizzBuzz fizzBuzz = new FizzBuzz(); // Only create one instance
        TwoSum twoSum = new TwoSum();
        boolean exit = false;

        while (!exit) {
            System.out.println(welcome.textAndOptions());

            try {
                int option = sc.nextInt(); // Handle non-integer inputs
                switch (option) {
                    case 2:
                        twoSum.solve();
                        break;

                    case 1:
                        fizzBuzz.solve();
                        break;

                    case 0:
                        exit = true;
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid option, please choose again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer.");
                sc.next();
            }
        }
    }
}
