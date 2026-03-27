package _01_Print;

public class Variable {
    public static void main(String[] args) {
        // 변수를 사용하는 이유: 값 재사용
        // 변수에 데이터를 담는 것 -> ram에 데이터를 저장하는 행위

        // 변수 선언(빈 박스를 만듬)
        // 자료형 변수명
        String greeting;

        // 변수 초기화(최초 대입)
        // "="은 같다는 의미가 아니다!
        // 우변의 데이터를 좌변의 변수에 저장하겠다
        greeting = "hello";

        // 변수 선언 및 초기화
        String academy = "Korea IT";

        System.out.println(greeting);
        // 변수 재할당(이전에 담겨있던 hello를 덮어씀)
        greeting = "hi";
        System.out.println(greeting);

        String myName1 = "박화목";
        String myName2 = "박수목";
        // 변수사용 -> 데이터를 읽어와라!
        System.out.println(myName1);
        // = 이 있을때, 우변먼저 실행
        myName1 = myName2;
        System.out.println(myName1);

        /*
            자바 명명법
            1. 필수규칙(문법)
                String 1name // 숫자로 시작할 수 없음
                String my name // 공백을 포함할 수 없음
                String class
                String if // 자바 예약어(문법) 사용할 수 없음
            2. 관례-국룰
                파스칼표기법 - MyName, PascalCase - 클래스명, 파일명
                카멜표기법 - myName, camelCase - 변수명, 메서드(함수)명
        */

    }
}
