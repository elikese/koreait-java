package _05_Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // switch-case: 값에 따라 분기시키는 문법
        int rank = 2;

        // 코드 진행을 이동시키는 문법
        switch (rank) {
            case 1:
                System.out.println("1등!");
                break; // 가장 가까운 switch 중괄호 탈출
            case 2:
                System.out.println("2등!");
                break;
            case 3:
                System.out.println("3등!");
                break;
        }
        System.out.println("switch문 탈출!");

        String memberLevel = "VIP";
        double discountRate = 0; // 할인율

        // 1. String 자료형은 알아서 equals로 비교해줌
        // 2. case 와 연산자는 같이 쓸 수 없음
        // 3. 같은 분기처리를 해줄때는 break생략해서 처리해줌
        switch (memberLevel) {
            case "VIP":
                discountRate = 0.2;
                break;
            case "GOLD":
                discountRate = 0.1;
                break;
            case "SILVER":
            case "NORMAL":
                discountRate = 0.05;
                break;
        }

        int month = 10;
        // month에 담긴 값에 따라 서로 다른 계절을 출력하는 코드를
        // switch문으로 작성!
        // month가 3,4,5 -> 봄 | 6,7,8 -> 여름 
        // 9,10,11 -> 가을 | 12, 1, 2 -> 겨울
        switch (month) {
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
            default: // case에 매치되는 값이 아닐 때
                System.out.println("month의 값이 올바르지 않습니다.");
        }


        int price = 10000;
        // 1. 스캐너를 생성
        Scanner scanner = new Scanner(System.in);
        // 2. 월~일 요일을 입력받아 주세요
        System.out.print("요일 입력(월~일) >>");
        String day = scanner.nextLine();
        // 3. 월-10%할인, 화수목-5%할인, 금토일-20%할인
        // 4. 이상한 입력값에 대한 처리! - 할인 0%
        double dayDiscountRate;
        switch (day) {
            case "월":
                dayDiscountRate = 0.10;
                break;
            case "화": case "수": case "목":
                dayDiscountRate = 0.05;
                break;
            case "금": case "토": case "일":
                dayDiscountRate = 0.20;
                break;
            default:
                System.out.println("올바른 값을 입력하세요");
                dayDiscountRate = 0.0;
        }
        // 5. 최종 가격 출력!
        double discountPrice = price * dayDiscountRate;
        double finalPrice = price - discountPrice;

        System.out.println("최종금액: " + finalPrice);




    }
}
