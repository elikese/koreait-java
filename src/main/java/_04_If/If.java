package _04_If;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        /*
            if(boolean 데이터) {
                // true일때 실행될 코드
            }
        */

        int height = 120;
        int age = 9;
        boolean isValid = height >= 150 && age >= 12;

        if(isValid) {
            System.out.println("탑승 가능합니다!");
        }

        // if ~ else if ~ else
        // if는 필수, 나머지는 옵션
        if (isValid) {
            // () 결과가 true일때 실행
            System.out.println("바이킹 탑승!");
        } else {
            // 위의 결과들이 모두 false일 때
            System.out.println("바이킹 탑승금지!");
        }

        boolean isLogin = true;
        // isLogin이 true면 "어서오세요" 출력!
        // false면 "로그인이 필요합니다" 출력!
        // -> if, else만으로 코드 작성!
        if(isLogin) {
            System.out.println("어서오세요");
        } else {
            // isLogin == false
            System.out.println("로그인이 필요합니다");
        }

        age = 15;

        // 1. 코드는 위에서 아래로 읽는다.
        // 2. 조건들 중 true인것이 발견되면, 해당 중괄호 코드를 실행하고
        // if ~ elseif ~ else 를 탈출
        // 3. 오름차순 // 내림차순으로 작성해야 한다.
        if (age <= 7) {
            System.out.println("유치원 가세요!");
        } else if (age <= 13) { // 실행된다는건 위의 조건들이 모두 false
            System.out.println("초등학교 가세요!");
        } else if (age <= 16) {
            System.out.println("중학교 가세요!");
        } else if (age <= 19) {
            System.out.println("고등학교 가세요!");
        } else {
            System.out.println("성인입니다!");
        }

        isLogin = false; // 로그인 x
        boolean isBanned = true; // 밴 계정

        // 로그인검사, 밴계정검사
        if (!isLogin) {
            System.out.println("로그인 해주세요!");
        } else if (isBanned) {
            // isLogin == true
            // 로그인 된 이후에 실행되는 코드
            System.out.println("정지된 계정입니다!");
        } else {
            // isLogin == true
            // isBanned == false
            System.out.println("어서오세요!");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("구매한 상품의 가격 >");
        int price = scanner.nextInt();

        // 100000원 이상이면 10퍼 할인가격 출력
        // 아니라면 원래가격 그대로 출력
        double finalPrice;
        if (price >= 100000) {
            // 변수의 생존범위(스코프)
            // 선언된 중괄호 안쪽에서만 생존
            // double discountPrice = price * 0.9;
            // System.out.println("최종가: " + discountPrice);
            finalPrice = price * 0.9; // 정수와 실수 연산시 실수로 변환
        } else {
            // System.out.println("최종가: " + price);
            finalPrice = price; // 정수와 실수 연산시 실수로 변환
        }
        System.out.println("최종가: " + finalPrice);


        // 실습1) 절댓값을 출력
        int num1 = -12; // 12 대입시 12출력, -12 대입시에도 12출력

        if(num1 > 0) {
            System.out.println(num1);
        } else {
            System.out.println(num1 * -1);
        }

        // 실습2) num2, num3 중 큰 값을 출력
        int num2 = 10;
        int num3 = 5; // 20으로 바뀌면 20출력
        if (num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }


    }
}
