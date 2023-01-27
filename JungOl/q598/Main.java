package q598;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while (true) {
//            char c = sc.next().charAt(0);
//            if (Character.isAlphabetic(c)) {
//                System.out.println(c);
//            } else if (Character.isDigit(c)) {
//                System.out.println((int) c);
//            } else {
//                break;
//            }
//        }

        while (true) {
            char c = sc.next().charAt(0);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                System.out.println(c);
            } else if (c >= '0' && c <= '9') {
                System.out.println((int) c);
            } else {
                break;
            }
        }
        sc.close();
    }
}