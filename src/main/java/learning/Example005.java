package learning;

import java.util.Scanner;

public class Example005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String word = scanner.nextLine();
        int a = word.length();
        String[] keuwords = {"F","B","X"};

        for (int i = 0; i < a; i++) {
            if(word.charAt(i) == keuwords[0].charAt(0) || word.charAt(i) == keuwords[1].charAt(0) || word.charAt(i) == keuwords[2].charAt(0)) {
                word = word.replace(keuwords[i], "?");
            }
        }
        System.out.println(word);

        String name1 = new String("Lale");
        String name2 = name1;
        System.out.println(name2);


    }
}
