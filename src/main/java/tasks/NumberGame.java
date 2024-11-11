package tasks;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int[] numbers = new int[100];

        System.out.println("Let the game begin!");
        while (true) {
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number < randomNumber) {
                    System.out.println(number + " is too low!");
                } else if (number > randomNumber) {
                    System.out.println(number + " is too high!");
                } else {
                    System.out.println(number + " is a number!");
                    break;
                }
                for (int i = 0; i < numbers.length; i++) {
                    if (number != randomNumber) {
                        numbers[i] = number;
                    } else {
                        break;
                    }
                    break;
                }
            } else {
                System.out.println("Please enter a number");
                sc.next();
            }
        }
        sc.close();
        System.out.println(Arrays.toString(numbers));

    }
}
