package _10_Method;

public class Overloading {
    /*
        - 메서드는 클래스 내에서 정의 할 수 있다.
        -> 서로 다른 클래스에서는 같은이름의 메서드 정의가 가능?(o)
        메서드 오버로딩 != 메서드 오버라이딩
        -> 동일 클래스 내에서 같은 이름의 메서드를 여러개 정의하는 것
        매개변수의 자료형, 순서, 갯수가 다르면 같은 이름 사용 가능
    */

    // why? 메서드 시그니쳐: 메서드를 자바(컴파일러)가 구분하는 방법
    // 이름 + 매개변수 "타입"목록

    // printInfo 메서드, 1:String
    public static void printInfo(String name) {
        System.out.println("이름: " + name);
    }

    // printInfo 메서드, 1:String, 2:int
    public static void printInfo(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

    // printInfo 메서드, 1:int, 2:String
    public static void printInfo(int age, String name) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }

    public static void printInfo(String name, int age, String email) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("이메일: " + email);
    }

    public static void main(String[] args) {
        // 호출하는 쪽에서 전달하는 매개변수에 따라 구분하여 호출해준다.
        printInfo("홍길동");
        printInfo("홍길동", 20);
        printInfo(20, "홍길동");

        // 실습) 이름, 나이, 이메일을 전달받아 호출하는 printInfo 메서드
        // 정의해주세요
        printInfo("홍길동", 20, "sample@java.com");

    }
}
