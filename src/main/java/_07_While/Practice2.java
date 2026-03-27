package _07_While;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // for문과 break - 탐색할때 타겟을 찾으면 탈출
        int targetNum = 51;
        for(int i = 1; i <= 100; i++) {
            System.out.println("현재 숫자: " + i);
            if (i == targetNum) {
                System.out.println("찾았습니다: " + i);
                break; // 가장 가까운 반복문 1회 탈출
            }
        }

        // for문과 continue - 카운팅할때, 조건 검사
        int evenCount = 0; // 짝수의 갯수
        for(int i = 1; i <= 10; i++) {
            // A 일때 ~해라
            // A 가 아닐때 ~하지마라
            if(i % 2 == 1) { // 홀수조건
                continue;
            }
            evenCount++;

//            if(i % 2 == 0) {
//                evenCount++;
//            }
        }

        // 1~100까지 누적합을 하다가
        // 누적합이 2000이 넘어갈 시 탈출! - 그때 누적합을 출력!
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;

            if(sum > 2000) {
                System.out.println("탈출! :" + sum);
                break;
            }
        }

        String password = "1234";
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true) {
            System.out.print("비밀번호 입력 >");
            String inputPW = scanner.nextLine();

            // 비밀번호 맞추면, 문을 열었습니다! 출력 후 탈출
            // 틀리면, 다시 입력받게!
            // 추가조건) 5회 틀릴시, 문이 잠겼습니다! 출력 후 탈출
            if(inputPW.equals(password)) { // 맞췄을 때
                System.out.println("문을 열었습니다!");
                break;
            } else { // 틀렸을 때
                System.out.println("틀렸습니다 다시입력!");
                count++; // 틀리면 1 증가
            }

            if(count == 5) {
                System.out.println("5회시도!! 문이 잠겼습니다");
                break;
            }

        }

    }
}
