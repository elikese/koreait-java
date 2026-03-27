package _04_If;

public class StackHeap {
    public static void main(String[] args) {
        // .java(영어) -> .class(숫자) : 컴파일러
        // .class파일을 실행하는 주체 : JVM
        // JVM의 메모리구조(stack + heap + a...)
        /*
            자료형분류
            1. 첫 글자가 소문자: 기본(원시)자료형
            -> int, double, boolean...
            2. 첫 글자가 대문자: 참조자료형
            -> String, Scanner, ....클래스(나중에)

            1. Stack메모리
                - 기본자료형들의 실제 값이 저장됨
                - 참조자료형들의 주소 값이 저장됨
            2. Heap메모리
                - 참조자료형들의 실제 값이 저장됨
        */
        // 기본자료형
        int num1 = 10;
        int num2 = 10;

        /*
            --현재 stack(main)--
            num1 : 10
            num2 : 10
        */

        // 참조자료형
        String str1 = "홍길동";
        String str2 = new String("홍길동");
        /*
            --현재 stack(main)--
            num1 : 10
            num2 : 10
            str1 : 0x1000
            str2 : 0x2000
            --현재 heap--
            0x1000 : "홍길동"
            0x2000 : "홍길동"
        */

        // == 연산자는 stack값을 비교하는 것
        // 참조자료형끼리 == 비교시 주소값 자체를 비교하게 됨
        // 문자열은 .equals로 실제 값 비교!
    }
}
