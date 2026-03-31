package _08_Array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        // 참조자료형의 특징 - "."으로 참조할 수 있다.
        // 배열또한 참조자료형
        int[] original = {1, 2, 3, 4, 5};

        // 길이
        System.out.println(original.length); // 참조하여 길이 읽어오기

        // 배열 내부까지 출력
        String innerData1 = Arrays.toString(original);
        System.out.println(innerData1);

        // 대입연산 -> stack값 기준으로 동작
        int[] copy1 = original; // 얕은복사
        
        // 깊은복사: heap에 새로운 메모리를 할당해서 실제 값을 복사
        int[] copy2 = Arrays.copyOf(original, original.length);

        original[0] = 999;
        
        // original이 변경되었는데 copy1이 변경됨
        // -> 같은 메모리주소(heap)를 저장하고 있기 때문
        String innerData2 = Arrays.toString(copy1);
        System.out.println(innerData2);

        // 원본과는 다른 heap주소를 가지고 있음
        String innerData3 = Arrays.toString(copy2);
        System.out.println(innerData3);

    }
}
