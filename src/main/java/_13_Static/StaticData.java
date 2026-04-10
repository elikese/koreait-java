package _13_Static;

public class StaticData {
    // (인스턴스)필드: 각 객체마다 별도의 저장공간 존재
    private int id;
    public int count = 0;
    
    // 스태틱 필드: 클래스에 저장되는 저장공간
    // -> 해당 클래스로 생성된 모든 객체가 접근 가능하며 공유함
    public static int staticCount = 0;

    public StaticData(int id) {
        this.id = id;
        // 생성자가 호출될때마다
        // count, staticCount 1 증가
        count++;
        staticCount++;
    }
    
    // 인스턴스 메서드 - static없는 메서드
    public void increaseCount() {
        // this라는 매개변수가 존재한다.
        // -> 객체가 생성되기전에는 호출 불가능
        this.count++;
        staticCount++; // 호출될 시점이면, static정보는 메모리에 존재
    }
    
    // 스태틱메서드
    public static void increaseStatic() {
        // 스태틱은 스태틱만 사용가능하다
        staticCount++;
        // this.count++; 필드 참조 x
        // 객체 생성전에도 호출될 수 있는 구조여야 함
    }

    // 위의 인스턴스 메서드와 동일한 스태틱메서드
    public static void increaseCount2(StaticData sd) {
        sd.count++;
    }

    // 실무팁)
    // 스태틱필드 -> final과 함께 상수 정의 시에 사용
    // 스태틱메서드 -> 유틸리티 메서드 정의

}
