package learning;

import java.util.Scanner;

public class exaample {
    public static void main(String[] args) {
        int[] number = {5, 12, 3, 19, 7};
        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }
        System.out.println(max);





        /*String name1 = "Babayev  ";
        String name2 = "Pasayev";

        String name3 =new  String( "Babayev");

        System.out.println(name1 == name3);
        System.out.println(name1.equals(name3));

        System.out.println(name1.length());
        System.out.println(name1.charAt(5));
        System.out.println(name1.substring(1,3));
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());
        System.out.println(name1.trim());
        System.out.println(name1.replace('b','k'));
        System.out.println(name1.replaceAll("Babayev","NNN"));*/

        //byte h = (byte) 200;
        //System.out.println(h);




        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = 100;
        int b =0;
        int c = 0;
        int number2 = scanner.nextInt();

        while (true){
            for (int i = 1; i <= number1; i++) {
                c = i +2*b;
                for (int j = 0; j <= number1;j++ ) {
                    b = c;
                    if (number2 < c ){
                        System.out.println(i-1);
                        break;
                    }
                }
                scanner.close();
            }
        }*/






    }
}
