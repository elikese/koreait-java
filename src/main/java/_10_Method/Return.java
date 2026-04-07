package _10_Method;

public class Return {
    // 리턴할 데이터가 존재한다면, void대신
    // 해당 데이터의 자료형을 적어준다.
    public static int addNum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // "홍길동" -> "홍길동님"
    public static String addNim(String name) {
        return name + "님";
    }

    public static void main(String[] args) {
        // 메서드에 리턴이 존재하면,
        // 호출결과가 리턴데이터가 된다.
        // -> 값이면 값처럼, 객체면 객체처럼 다룰 수 있다.
        int result1 = addNum(10, 20);
        System.out.println(result1);

        // f(g()) -> g()계산 -> f()계산
        int result2 = addNum(addNum(10, 20), 10);

        String nim1 = addNim("홍길동");
        System.out.println(nim1);
        System.out.println(addNim("홍길동").length());
        if(addNim("홍길동").contains("홍")) {
            System.out.println("홍씨 입니다");
        }
    }
}
