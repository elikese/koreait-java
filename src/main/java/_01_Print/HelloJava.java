package _01_Print;

// 주석: 인간이 읽으라고 적는 것(컴퓨터는 무시)
// 자바는 객체지향언어 -> 모든 문법이 class 위주
// 자바는 컴파일과정을 거친다.
// .java 파일 -> .class 파일 -> 실행
// {} : 코드구역
public class HelloJava { // HelloJava 시작
    public static void main(String[] args) { // 메인시작
        // 자바는 언제나 main을 기점으로 동작한다.
        System.out.println("Hello World!"); // 세미콜론: 코드 끝
        // 아래의 문자열을 출력해주세요!
        // 이름: 박화목
        // 나이: 34
        // 주소: 부산광역시
        System.out.println("이름: 박화목");
        System.out.println("나이: 34");
        System.out.println("주소: 부산광역시");

        String myName = "박화목"; // 문자열
        // 문자열 덧셈 시 이어붙음!

        // 데이터를 적절한 변수에 담은 후
        String myAge = "34";
        String myAddress = "부산광역시";
        // 아래의 코드를 완성해 주세요
        System.out.println("이름: " + myName);
        System.out.println("나이: " + myAge);
        System.out.println("주소: " + myAddress);

    } // 메인 끝
} // HelloJava 끝
