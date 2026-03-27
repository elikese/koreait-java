package _07_While;

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

    }
}
