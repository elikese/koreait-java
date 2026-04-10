package _12_Access;

public class Access {
    /*
        접근제어자 - (클래스), 메서드, 필드 모두 동일하게 적용
        why? 데이터 보호목적: 주소로 직접참조(.)하는걸 막기 위함

        종류
        1. public - 어디서든 참조(.) 가능
        2. protected - 같은패키지&&상속관계 일때만 참조(.) 가능
        3. default - 같은패키지만 참조(.) 가능
        4. private - 해당 클래스 내부에서만 참조(.) 가능
    */

    private int a;
    private int b;

    public Access(int n1, int n2) {
        if(n1 > 0) {
            this.a = n1;
        }
        if(n2 % 2 == 0) {
            this.b = n2;
        }
        // 비즈니스로직에 어긋나면,
        // 객체가 생성되지 않게 해줘야 한다
        // -> 예외를 던져서 객체 생성을 막아줘야한다.
    }

    // getter 인스턴스 메서드
    // -> public으로 외부에서 접근할 수 있게
    // -> 필드값을 읽을 수 있게끔
    public int getA() {
        // access.a와 -> a의 주소를 노출
        // access.getA() -> a의 주소를 감추고, 데이터만 노출
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    // setter
    public void setA(int n) {
        // a필드는 항상 양수여야 한다.
        // -> 객체가 저장하는 데이터는 언제나 검증된 데이터이고 싶다
        if(n <= 0) {
            System.out.println("a필드값은 양수여야 합니다");
            return; // 메서드 즉시종료
        }
        this.a = n;
    }

    public void setB(int n) {
        // b필드는 항상 짝수여야 한다.
        if(n % 2 != 0) {
            System.out.println("b필드는 짝수여야 합니다");
            return;
        }
        this.b = n;
    }


}
