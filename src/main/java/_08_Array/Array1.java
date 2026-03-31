package _08_Array;

import java.util.Random;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        // 배열(Array) : 동일한 자료형의 대량 데이터를 관리하는 저장자료형

        // 배열 -> 참조자료형
        // new -> heap메모리 주소를 할당해 오는 것
        int[] scores = new int[5]; // int 데이터 5개 들어갈 배열 생성
        // 각 배열의 자리는 번호(index)로 지정되어 있음 - 0부터시작
        scores[0] = 90; // scores 0번자리에 90 대입
        scores[1] = 80;
        scores[2] = 70;
        scores[3] = 60;
        scores[4] = 99;

        System.out.println(scores[0]); // scores 0번 데이터 조회
        System.out.println(scores[4]); // scores 4번 데이터 조회

        // 간단하게 배열생성 / 초기화 한번에 - 자주사용
        int[] scores2 = new int[]{90, 80, 40, 60, 99};
        int[] scores3 = {90, 80, 40, 60, 99};

        // 배열은 생성될 때 최대용량이 정해지고, 변경할 수 없음
        // 더 큰 용량 필요시-> 새로운 배열을 만들어서 복사하는 방법

        // 배열은 길이(크기)를 저장하고 있음
        System.out.println(scores3.length); // 5칸

        System.out.println(scores3[0]);
        System.out.println(scores3[1]);
        System.out.println(scores3[2]);
        System.out.println(scores3[3]);
        System.out.println(scores3[4]);

        // 배열과 for문 - loop
        for(int i = 0; i < scores3.length; i++) {
            System.out.println(scores3[i]);
        }

        // 자료형[] -> 자료형을 저장하는 배열
        String[] names = {"박하나", "박둘", "박셋", "박넷", "박다섯"};
        // 1. names 배열로 접근해서 "박하나"와 "박넷" 출력을 해주세요
        String name0 = names[0];
        String name3 = names[3];
        System.out.println(name0);
        System.out.println(name3);

        // 2. "박다섯" -> "박오"로 수정
        names[4] = "박오"; // names[4]칸 데이터에 "박오" 대입

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        // 3. nums를 for문으로 순회하면서 짝수만 출력해 주세요
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i]; // 배열에서 꺼내온 데이터
            if (num % 2 == 0) { // 짝수라면
                System.out.println(num);
            }
            // nums[i] = 10; // nums에 저장된 숫자들이 모두 변경됨
        }
        System.out.println("0번자리 :" + nums[0]);
        System.out.println("7번자리 :" + nums[7]);

        
        // 향상된 for문 - 항상 배열의 길이만큼 순회
        // 인덱스로 데이터에 접근하는 것을 막는다.
        for(int num : nums) {
            if(num % 2 == 0) {
                System.out.println(num);
            }
            num = 10; // nums에 있는 데이터를 건드리지 않음(원본 보존)
        }
        System.out.println("0번자리 :" + nums[0]);
        System.out.println("7번자리 :" + nums[7]);

        // nums가 1부터 8까지 저장 중,
        // index 8번과 9번에 각각 99, 100을 추가하고 싶음

        // 실습) nums를 수정하는 코드
        // 1. 10칸짜리 배열을 생성
        int[] tempArr = new int[10];
        // 2. 기존 nums 배열의 데이터를 복사
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i]; // nums의 i번째 칸 데이터 꺼내오기
            tempArr[i] = num; // tempArr의 i번째 칸에 데이터 저장
        }
        tempArr[8] = 99;
        tempArr[9] = 100;
        // 3. nums에 대입
        nums = tempArr;

        for(int num : nums) {
            System.out.println(num); // 1,2,3,4...8, 99, 100 출력
        }

    }
}
