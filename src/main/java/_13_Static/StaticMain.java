package _13_Static;

public class StaticMain {
    public static void main(String[] args) {
        StaticData sd1 = new StaticData(1);
        StaticData sd2 = new StaticData(2);
        StaticData sd3 = new StaticData(3);

        // count라는 공간은 각 객체마다 가지고 있는 공간
        System.out.println(sd1.count); // 0 -> 1
        System.out.println(sd2.count); // 0 -> 1
        System.out.println(sd3.count); // 0 -> 1

        System.out.println("스태틱 데이터 조회!");
        System.out.println(sd1.staticCount); // 3
        System.out.println(sd2.staticCount); // 3
        System.out.println(sd3.staticCount); // 3
        // 클래스에 저장되는 정보이기 때문에
        // 클래스로 참조해야 한다(권장)
        System.out.println(StaticData.staticCount);

    }
}
