package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public void solve () {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Vamos criar o array!\n" +
                "Digite o tamanho que você quer!");
        int arrayLength = sc.nextInt();
        int[] numbers = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++) {
            System.out.println("Digite o inteiro que ficara na posição: " + i);
            numbers[i] = sc.nextInt();
        }
        System.out.println("Aqui está o array formado: " + Arrays.toString(numbers)
            + "\n Agora insira o valor alvo da soma!");
        int target = sc.nextInt();

        Map<Integer, Integer>  visitedNumbers = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            int delta = target - numbers[i];
            if(visitedNumbers.containsKey(delta)) {
                int[] retrn = new int[]{i, visitedNumbers.get(delta)};
                System.out.println("A combinação certa está nas posições: " + Arrays.toString(retrn));
            }
            visitedNumbers.put(numbers[i], i);
        }
    }
}
