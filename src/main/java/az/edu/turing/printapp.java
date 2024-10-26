package az.edu.turing;
public class printapp {
    public static void main (String[] args) {
        byte bytValue = 19 ;
        short shotValue = 9877;
        int intValue = 88889900;
        long longValue = 7899999L;
        float floatValue = 89.88f ;
        double doubleValue = 99.55 ;
        boolean boolValue = false ;
        char charValue = 'F' ;

        System.out.print(bytValue);
        System.out.print(" "+shotValue);
        System.out.println(" " + intValue);
        System.out.print(longValue);
        System.out.printf("float  %s" , floatValue);
        System.out.printf("double  %s" , doubleValue);
        System.out.print("  " + boolValue);
        System.out.print(" " + charValue);
        System.out.print(" " + shotValue + intValue);

        int number1=15;
        int number2=7;
        int sum = number2 + number1;
        System.out.print(" " + sum);
        int cixmaq =number1 - number2;
        System.out.print(" " + cixmaq);
        int c = number1 / number2 ;
        System.out.print(" " + c);
        int d = number1 % number2;
        System.out.print(" " + d);
        int f = number1 * number2 ;
        System.out.print(" " + f);
        // system.out.print(number1 // number2)
    }
}