package az.edu.turing;

import java.util.Scanner;


public class operation {
    public static void main(String[] args) {
        // values
        int a = 18;
        int b = 12;
        int c = 9;
        int d = 10;
        int g = 8;
        boolean x = true;
        boolean y = false;

        //simole operations
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a & b);
        c++;
        System.out.println(c);
        System.out.println(--b);
        a += 3;
        b -= 4;
        c *= 5;
        d /= 7;
        g %= 9;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(g);
        System.out.println(a == b);
        System.out.println(c != a);
        System.out.println(b > a);
        System.out.println(c < a);
        System.out.println(c <= d);
        System.out.println(d >= g);
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        String base = (a >= 5) ? "yes" : "no";
        System.out.println(base);
        // complex operations
        System.out.println(((a + b) - c) / 6);
        System.out.println((g + b + c) * 10 > 80 ? true : false);

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(((number * 6) / 5) > 90 ? true : false);
        System.out.println(number == 15);
        System.out.println(number += 7);
        System.out.println(number++);
        System.out.println(number);

    }
}
