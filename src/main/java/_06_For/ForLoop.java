package _06_For;

public class ForLoop {
    public static void main(String[] args) {
        /*
            for(변수선언-초기식; 조건식; 증감식) {
                반복될 코드
            }
            for문에서 코드 진행 순서
            초기식 -> (조건식 -> 코드실행 -> 증감식) x n
            -> 조건식 연산이 false면 for문 중괄호 탈출
        */

        // "안녕하세요" 5번 출력
        for(int i = 0; i < 5; i++) {
            // 변수 i는 for문 중괄호 안에서만 생존가능
            System.out.println("안녕하세요");
        }
        // System.out.println(i);
        

        // 초기식은 생략가능 - 시험문제
        int a = 0;
        for (;a <= 5; a++) {
            System.out.println("안녕하세요");
        }
        System.out.println(a); // ?
        for(; a < 10; a++) {
            System.out.println("안녕하세요22");
        }
        System.out.println(a); // ?


        // 1 ~ 10 출력
        for(int i = 1; i <= 10; i++) {
            System.out.println("현재숫자: " + i);
        }

        // 1. 20 ~ 100 출력
        for(int i = 20; i <= 100; i++) {
            System.out.println(i);
        }
        // 2. 1 ~ 10 짝수만 출력
        for(int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("짝수: " + i);
            }
        }

        // 3. 1~100 총합 구하여 출력
        int sum = 0; // 누적합변수는 밖에!
        for(int i = 1; i <= 100; i++) {
            // sum = sum + i;
            sum += i;
        }
        System.out.println("총합: " + sum);

        // 4. 1~100 홀수합 구하여 출력
        int oddSum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 1) {
                oddSum += i;
            }
        }
        System.out.println("홀수합: " + oddSum);
    }
}
