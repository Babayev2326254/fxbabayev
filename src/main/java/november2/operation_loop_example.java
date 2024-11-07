package november2;

import java.util.Scanner;

public class operation_loop_example {
    public static void main(String[] args) {
        //example-1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = scanner.nextInt();
        int number2 = number1 % 2;

        if (number1 != 0 && number1 > 0 && number2 == 0) {
            System.out.println("Positive Number");
            System.out.println("Even Number");
        } else if (number1 != 0 && number1 > 0 && number2 != 0) {
            System.out.println("Positive Number");
            System.out.println("Odd Number");
        } else if (number1 != 0 && number1 < 0 && number2 == 0) {
            System.out.println("Negative Number");
            System.out.println("Even Number");
        } else if (number1 != 0 && number1 < 0 && number2 != 0) {
            System.out.println("Negative Number");
            System.out.println("Odd Number");
        } else {
            System.out.println("Equal 0 and nothing Even and Odd numbers");
        }

        // example -2
        System.out.println("Enter number 2: ");
        int month = scanner.nextInt();
        String monthname = "";

        switch (month) {
            case 1:
                monthname = "January - winter season";
                break;
            case 2:
                monthname = "February - winter season";
                break;
            case 3:
                monthname = "March - spring season";
                break;
            case 4:
                monthname = "April - spring season";
                break;
            case 5:
                monthname = "May - spring season";
                break;
            case 6:
                monthname = "June - summer season";
                break;
            case 7:
                monthname = "July - summer season";
                break;
            case 8:
                monthname = "August - summer season";
                break;
            case 9:
                monthname = "September - autumn season";
                break;
            case 10:
                monthname = "October - autumn season";
                break;
            case 11:
                monthname = "November - autumn season";
                break;
            case 12:
                monthname = "December - winter season";
                break;
            default:
                monthname = "invalid month number";
                System.out.println(monthname);
                return;

        }
        System.out.println(monthname);

        //example -3
        String[] azerbaijanAlphabet = {"A", "B", "C", "Ç", "D", "E", "Ə", "F", "G", "Ğ", "H", "X", "I", "İ", "J", "K", "Q", "L", "M", "N", "O", "Ö", "P", "R", "S", "Ş", "T", "U", "Ü", "V", "Y", "Z", "a", "b", "c", "ç", "d", "e", "ə", "f", "g", "ğ", "h", "x", "ı", "i", "j", "k", "q", "l", "m", "n", "o", "ö", "p", "r", "s", "ş", "t", "u", "ü", "v", "y", "z"};
        for (String i : azerbaijanAlphabet) {
            System.out.println("Azerbaijan Alphabet " + i);
        }


    }
}

