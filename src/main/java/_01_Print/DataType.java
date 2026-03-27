package _01_Print;

public class DataType {
    public static void main(String[] args) {
        // 자바는 데이터를 변수(상자)에 저장할때
        // 어떤 타입을 저장할 건지 미리 결정한다.
        String name = "박화목";

        // 1. 정수타입
        // 1byte == 8bit
        byte byteNum = 127; // 1바이트
        short shortNum = 32000; // 2바이트
        int intNum = 21; // 4바이트 -21억 ~ 21억
        long longNum = 3_000_000_000L; // 8바이트

        // 2. 실수(소숫점) 타입
        float smallBox = 3.14f; // 4바이트 - 소숫점아래 7자리
        double bigBox = 3.14; // 8바이트 - 소숫점아래 15자리

        // 3. 문자 타입 - 글자 1개
        // 저장되어있는 2진수패턴을 어떻게 해석할거야?를 정한게 자료형
        char char1 = 'A'; // 아스키코드표 -> 65
        char char2 = 65 + 1; // 65 + 1 -> 'B'
        System.out.println(char2);

        // 4. 문자열
        String str = "안녕하세요";

        // 5. 논리형 - true 혹은 false만 저장
        // 의문형으로 변수명작성
        boolean isEmpty = true;
        boolean isLogin = false;
        boolean hasMoney = false;

    }
}
