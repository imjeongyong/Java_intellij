package q174;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] stuAr = new Student[3];

        for (int i = 0; i < 3; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();

            stuAr[i] = new Student(n1, n2, n3);
            stuAr[i].printScore();
        }
        new PrintSum(stuAr);
    }
}

class Student {
    int score1;
    int score2;
    int score3;

    Student(int score1, int score2, int score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public void printScore() {
        System.out.println(score1 + " " + score2 + " " + score3 + " " + (score1 + score2 + score3));
    }
}

class PrintSum {
    PrintSum(Student[] stuAr) {
        int sum1 = stuAr[0].score1 + stuAr[1].score1 + stuAr[2].score1;
        int sum2 = stuAr[0].score2 + stuAr[1].score2 + stuAr[2].score2;
        int sum3 = stuAr[0].score3 + stuAr[1].score3 + stuAr[2].score3;
        int sumAll = sum1 + sum2 + sum3;
        System.out.println(sum1 + " " + sum2 + " " + sum3 + " " + sumAll);
    }
}