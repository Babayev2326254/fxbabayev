package learning;

public class maxnumber {
    public static void main(String[] args) {
        int[] number = {5, 12, 3, 19, 7};
        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }
        System.out.println(max);
    }
}
