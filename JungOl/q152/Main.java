package q152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ar = new int[10];
        int odd = 0;
        int even = 0;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
            if (i % 2 == 0) {
                odd += ar[i];
            } else {
                even += ar[i];
            }
        }
        sc.close();
        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }
}