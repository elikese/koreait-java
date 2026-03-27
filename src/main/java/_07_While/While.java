package _07_While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*
            while(조건식-boolean 데이터) {
                // 조건이 true인 동안 반복 실행될 코드
            }
            // 조건이 false가 되면 반복 종료
            
            // for문 - 횟수가 명확할 때
            // while문 - 횟수가 불명확 할 때, 조건이 있을 때
        */

        // 1~100 합계 - for문이 더 적절한 방법
        int sum = 0; // 누적합 변수
        int i = 1;
        while(i <= 100) {
            sum += i; // sum = sum + i;
            i++; // 조건변화를 시켜주는 코드
        }
        System.out.println("총합: " + sum);

        // 반복횟수가 불명확한 예시
        boolean isLogin = true;
        Scanner scanner = new Scanner(System.in);

        while(isLogin) { // isLogin이 false가 될때 까지
            System.out.println("로그인 상태입니다.");
            System.out.print("로그아웃 하시겠습니까?(y/n) >>");

            String command = scanner.nextLine();

            // isLogin = !"y".equals(command);
            if(command.equals("y")) {
                isLogin = false;
            }
        }
        System.out.println("로그아웃 성공");
        
        
    }
}
