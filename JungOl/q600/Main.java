package q600;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        sc.close();

//        String[] strAr = inp.split(" ");
//        System.out.println(strAr.length);

        StringTokenizer st = new StringTokenizer(inp, " ");
        System.out.println(st.countTokens());
    }
}