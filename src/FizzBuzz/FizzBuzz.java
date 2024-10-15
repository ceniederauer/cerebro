package FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {

    public void solve () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para o FizzBuzz");
        int n_fizzBuzz =  sc.nextInt();
        for(int i= 1; i <= n_fizzBuzz; i++) {
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("Fizz Buzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
            }else if(i%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
