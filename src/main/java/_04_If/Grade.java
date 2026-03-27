package _04_If;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요(1~100) >>");
        int score = scanner.nextInt();

        String grade;
        // if~else if~else 사용하여서
        // grade를 초기화 하여 최종 출력해주세요!
        // 90이상 "A", 80~89 "B", 70~79 "C", 70미만 "D"
        if(score >= 90) {
            grade = "A";
        } else if(score >= 80) { // && score < 90
            grade = "B";
        } else if(score >= 70) { // && score < 80
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println("학점: " + grade);


    }
}
