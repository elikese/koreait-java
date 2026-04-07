package _09_MultiArray;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // 상품들
        String[] products = {"마우스", "키보드", "웹캡", "헤드셋"};

        // 각 상품들의 정보
        // {id, 재고, 가격}
        int[][] inventory = {
                {0, 50, 29000}, // 마우스
                {1, 30, 35000}, // 키보드
                {2, 25, 45000}, // 웹캠
                {3, 40, 49000} // 헤드셋
        };
        // 키보드의 재고 및 가격을 출력
        String target = "키보드";

        // 1. target이 몇번째 index에 있는가?
        int targetId = -1;
        for (int i = 0; i < products.length; i++) {
            String productName = products[i];
            if (target.equals(productName)) { // 타겟과 같은 이름이면
                targetId = i; // 해당 인덱스를 저장
                break;
            }
        }

        // 2. inventory에서 해당 id를 가진 배열을 찾는다
        for (int[] item : inventory) {
            int id = item[0]; // id를 꺼내옴
            if (id == targetId) { // 타겟 id와 같다면 -> 찾은 것
                int stock = item[1]; // 해당 타겟의 재고
                int price = item[2]; // 해당 타겟의 가격
                System.out.println("상품: " + target);
                System.out.println("재고: " + stock);
                System.out.println("가격: " + price);
                break;
            }
        }

        // 실습) 재고가 35개 미만인 상품의 이름들을 출력하세요!
        // 1. inventory를 loop하면서 재고가 35미만인 상품들의 id 출력
        // 2. 이름에서 해당 id가 index인 것을 출력!
        for (int[] item : inventory) {
            int id = item[0];
            int stock = item[1];
            if (stock < 35) {
                System.out.println("재고 35미만 상품의 id: " + id);
                // products의 index와 inventory의 id가 동기화되어있음
                String productName = products[id];
                System.out.println("재고 35미만 상품명: " + productName);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("상품의 총 재고가치 구하기");
        System.out.print("찾고자 하는 상품 이름 >>");
        target = scanner.nextLine();

        // 총 재고가치 = 재고 * 가격
        // 입력한 상품의 총 재고가치를 출력하는 코드작성
        targetId = -1;
        for (int i = 0; i < products.length; i++) {
            String productName = products[i];
            if (target.equals(productName)) {
                targetId = i;
                break;
            }
        }
        
        // 제대로 입력하지 않았다면
        if (targetId == -1) {
            System.out.println(target + "은 존재하지 않는 상품입니다.");
            // 아래의 코드를 실행하지 마라
            return;
            // return : 메서드 즉시종료 -> main 메서드가 종료 됨
        } // 얼리리턴패턴

        for (int[] item : inventory) {
            int id = item[0];
            int stock = item[1];
            int price = item[2];
            if (id == targetId) {
                int totalPrice = stock * price;
                System.out.println("총 재고합: " + totalPrice);
                break;
            }
        }

        System.out.println("target 찾음");

    }
}
