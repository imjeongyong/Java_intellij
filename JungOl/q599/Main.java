package q599;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inp = sc.next();
        sc.close();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < inp.length(); i++) {
            if (Character.isAlphabetic(inp.charAt(i))) {
                str.append(inp.charAt(i));
            }
        }
        System.out.println(str.toString().toUpperCase());
    }
}