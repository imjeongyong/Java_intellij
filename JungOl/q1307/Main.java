package q1307;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[][] ar = new int[n][n];
        int alp = 65;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                ar[i][j] = alp;
                if (alp == 90) {
                    alp = 64;
                }
                alp++;
//                System.out.print(ar[i][j] + " ");
            }
//            System.out.println();
        }
//        System.out.println("-------------------------");

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.printf("%c ", ar[j][i]);
            }
            System.out.println();
        }
    }
}
