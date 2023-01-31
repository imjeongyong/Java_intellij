package q9092;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[6];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        Main m = new Main();
        m.PrintAr(ar);
    }

    void PrintAr(int[] ar) {
        Arrays.sort(ar);
        for (int i : ar) {
            System.out.print(i + " ");
        }
    }
}