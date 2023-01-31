package q1840;

import java.util.Scanner;

public class Main {

    int[][] piece;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println();

        int counter = 0;
        Main main = new Main();
        main.piece = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                main.piece[i][j] = sc.nextInt();
                System.out.print(main.piece[i][j] + " ");
            }
            System.out.println();
        }
    }

    
}