package _02_Operator;

public class Operator1 {
    public static void main(String[] args) {
        // 연산자: 계산을 수행하는 기호 ex) +, -
        // 3 + 4 -> "+": 연산자, 3,4: 피연산자
        // a + b -> 변수(a, b)들도 피연산자 가능

        // 1. 산술연산자
        int num1 = 3;
        int num2 = 2;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);

        // int끼리의 연산결과: int -> 소숫점 버림발생
        System.out.println(num1 / num2); // 몫: 1
        System.out.println(num1 % num2); // 나머지연산: 1

        // 2. 비교연산자 - 결과가 boolean 타입 데이터
        System.out.println(num1 == num2); // 같은가?
        System.out.println(num1 != num2); // 다른가?
        boolean isSameNumber = num1 == num2;


        System.out.println(num1 > 0); // 0 초과?
        System.out.println(num1 < 0); // 0 미만?
        System.out.println(num1 >= 0); // 0 이상?
        System.out.println(num1 <= 0); // 0 이하?

        // 짝수판단
        System.out.println(num2 % 2 == 0);

        // 22시에서 50시간을 더한 시각?
        int now = 22;
        // () 우선순위 1등
        int after50h = (now + 50) % 24;
        System.out.println("결과: " + after50h);

        // 게시글 162개 존재
        // 한페이지당 20개의 게시글이 보여짐
        // 총 페이지?
        int postCount = 162;
        int viewCount = 20;
        int pageCount = postCount / viewCount + 1;
        System.out.println("총 페이지 갯수: " + pageCount);

        // 단항연산자
        int a = 1;
        // 후위증감
        int b = a++; // 대입(사용) 후에 1증가 시켜라
        System.out.println(b);

        a = 1;
        // 전위증감: 대입(사용)전에 1증가시켜라
        b = ++a;
        System.out.println(b);

        a = 1;
        // 후위감소
        b = a--; // 대입 이후에 1감소
        System.out.println(b); // 1

        a = 1;
        // 전위감소
        b = --a; // 대입 이전에 1감소
        System.out.println(b); // 0

        // 단독으로 사용시 전위/후위 결과 동일
        a++; ++a; // 1 증가

        // 대입연산자 - 우선순위 꼴찌
        a = 4 + 1;
        a = a + 3; // 우변먼저 연산 후 최종대입
        System.out.println(a); // 8

        a += 3; // a의 값을 3 증가
        a -= 3; // a의 값을 3 감소
        a *= 3; // a의 값을 3 곱하라
        a /= 3; // a의 값을 3 나눠라
        a %= 3; // a의 값을 3으로 나눈 나머지 값 대입



    }
}
