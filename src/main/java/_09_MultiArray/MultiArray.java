package _09_MultiArray;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        // 다중배열 - 배열안에 배열이 있는 구조

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        // seatA 변수는 stack에 존재, heap주소를 저장하고 있음
        // heap주소: 0x1000

        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        // seatB 변수는 stack에 존재, heap주소를 저장하고 있음
        // heap주소: 0x2000

        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};
        // seatC 변수는 stack에 존재, heap주소를 저장하고 있음
        // heap주소: 0x3000

        // 저장할자료형[]
        String[][] seats = {seatA, seatB, seatC};
        // 저장할자료형: String[]
        // String[][]: String[]을 저장하는 배열
        // seats 변수는 stack에 존재, heap주소를 저장하고있음
        // heap주소: 0x4000 -> [0x1000, 0x2000, 0x3000]

        // seats[0] == seatA
        // 따라서 seats[0][0] == seatA[0]
        System.out.println(seats[0][0]);
        System.out.println(seatA[0]);

        // 배열안에 배열 한번에 선언
        String[][] seats2 = {
                {"A1", "A2", "A3", "A4", "A5"}, // 0
                {"B1", "B2", "B3", "B4", "B5"}, // 1
                {"C1", "C2", "C3", "C4", "C5"} // 2
        };
        // seats2변수를 통해 A4, C5를 접근해서 출력!
        String A4 = seats2[0][3];
        String C5 = seats2[2][4];
        System.out.println(A4);
        System.out.println(C5);


        int[][] numArrs = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        // 다중배열과 loop
        for(int i = 0; i < numArrs.length; i++) {
            // numArrs에서 하나씩 꺼낸것의 자료형: int[]
            int[] numArr = numArrs[i];
            System.out.println(Arrays.toString(numArr));

            // 실제 데이터(int)를 꺼내보자
            for(int j = 0; j < numArr.length; j++) {
                // numArr에서 하나씩 꺼낸것의 자료형: int
                int num = numArr[j];
                System.out.println(num);
            }
        }

        // numArrs 짝수 총합구하기
        int evenSum = 0;
        for(int i = 0; i < numArrs.length; i++) {
            int[] numArr = numArrs[i];
            for(int j = 0; j < numArr.length; j++) {
                int num = numArr[j];
                if(num % 2 == 0) {
                    evenSum += num;
                }
            }
        }

        System.out.println("짝수합: " + evenSum);

        // numArrs에서 3의배수의 갯수를 출력해 주세요!
        int count = 0;
        // 향상된 for문으로
        for (int[] numArr : numArrs) {
            for (int num : numArr) {
                if(num % 3 == 0) {
                    count++;
                }
            }
        }
        System.out.println("3의 배수의 갯수: " + count);

    }
}
