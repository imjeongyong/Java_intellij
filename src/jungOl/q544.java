package jungOl;

import java.util.Scanner;

public class q544 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        for (int i = n; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}