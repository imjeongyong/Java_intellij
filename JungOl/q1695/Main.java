package q1695;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println();

        int[][] house = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                house[i][j] = sc.nextInt();
                System.out.print(house[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
