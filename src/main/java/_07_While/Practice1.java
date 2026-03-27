package _07_While;

import java.util.Random;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // 스캐너 객체 생성 및 변수 대입
        Scanner scanner = new Scanner(System.in);

        // 랜덤 객체 생성 및 변수 대입
        Random random = new Random();

        // 1이상 11미만 숫자 중 랜덤 정수 하나 뽑아서 변수 대입
        int randomNumber = random.nextInt(1, 11);

        System.out.println(randomNumber);
        
        // 스캐너로 매번 입력을 받고, 랜덤숫자를 맞출때 탈출
        // boolean isIncorrect = true;
        while(true) { // isIncorrect가 false가 되면 탈출
            System.out.print("숫자 입력 >>");
            int myGuess = scanner.nextInt();
            // 맞추면, "정답입니다: {정답숫자}" 출력 -> 탈출
            // 틀리면, "다시 입력하세요!" 출력
            if (myGuess == randomNumber) {
                System.out.println("정답입니다: " + myGuess);
                // isIncorrect = false; // 조건변화 코드
                break; // 반복중 break 읽으면, 가까운 while 중괄호 1번 탈출
            } else {
                System.out.println("다시 입력하세요!");
                continue; // 반복중 continue 읽으면, 코드진행 멈추고, 다음반복으로 스킵
            }

        }

        // 업다운 게임
        // 1~100 사이 랜덤정수
        int randomInt = random.nextInt(1, 101);
        // 입력값보다 랜덤값이 크면 "up" 출력
        // 입력값보다 랜덤값이 작으면 "down" 출력
        // 같으면, "정답입니다" 출력 후 탈출
        while(true) {
            // 입력받기
            System.out.print("1~100 사이 정수 입력 >>");
            int myNum = scanner.nextInt();

            // 입력값 검증
            // - 추가: 1~100 값이 아닌 입력을 받으면,
            // "1~100을 입력하세요" 출력 후 다음 반복으로 스킵
            // 1 <= myNum <= 100
            // -> myNum >= 1 && myNum <= 100
            // not 연산시 -> myNum < 1 || myNum > 100
            if (myNum < 1 || myNum > 100) {
                System.out.println("1~100 값을 입력하세요!");
                continue;
            }

            // 업다운게임 로직
            if(myNum == randomInt) {
                System.out.println("정답입니다");
                break;
            } else if (myNum > randomInt) {
                System.out.println("down!");
            } else if (myNum < randomInt) {
                System.out.println("up!");
            }
        }

    }
}
