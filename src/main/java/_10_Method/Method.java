package _10_Method;

public class Method {
    // 메서드 정의
    // public(접근제한자): 다른 클래스에서도 호출 가능(나중에)
    // static: 객체 생성없이 호출 가능(나중에)
    // void: 리턴이 없다.
    public static void hello() {
        System.out.println("안녕하세요!");
        System.out.println("안녕하세요22");
    }

    // 매개변수: 코드를 재사용할 때, 외부로부터(호출할 때) 받아오는 변수
    // 메서드이름(String name, int age...)
    // 매개변수는 메서드 안에서만 유효하다.
    public static void helloName(String name) {
        // String name = "박지성"; -> 대입연산이 일어난다!
        // String name = name(main의)
        // -> main의 name이 저장하고있는 데이터를 읽어오고 대입
        System.out.println("안녕하세요 " + name + "님");
    }

    // 실습) 정수 2가지를 매개변수로 전달받아서
    // 합을 구하여 출력하는 메서드, 메서드명: printAddNum
    public static void printAddNum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        // 변수: 데이터를 재사용하기 위함
        // 메서드: 코드덩어리를 재사용하기 위함
        System.out.println("메서드 호출 전");
        hello(); // 메서드호출: 메서드이름();
        System.out.println("메서드 호출 후");

        helloName("손흥민");
        helloName("박지성");

        String name = "김민재";
        // main의 name변수와 helloName의 name변수는 서로같은가?
        // -> 아니오! 서로 다르고, 독립적임.
        helloName(name);

        int num1 = 10;
        int num2 = 20;
        printAddNum(num2, num1);
        System.out.println("호출 종료");
        /*
            stack메모리는 메서드호출로 생성된다.
            메서드호출별로 분리되어 있다.
            - stack -
            stack(main) ---
            num1 : 10
            num2 : 20
            ---

            stack(printAddNum) ---
            num1 : 20(main의 num2를 대입받음)
            num2 : 10(main의 num1을 대입받음)
            sum : 30
            ---
        */
    }
}
