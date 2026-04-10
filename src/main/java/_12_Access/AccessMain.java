package _12_Access;

public class AccessMain {
    public static void main(String[] args) {
        Access access = new Access(10, 20);

        // private 필드는 직접참조(.) 불가능
//        System.out.println(access.a);
//        System.out.println(access.b);
//        access.a = 100;
//        access.b = 200;

        // getter를 이용한 조회 - 간접적으로 접근해서 조회
        System.out.println(access.getA());
        System.out.println(access.getB());

        // setter를 이용한 변경 - 간접적으로 접근해서 변경
        access.setA(-100);
        System.out.println(access.getA());
        access.setB(25);
        System.out.println(access.getB());



    }
}
