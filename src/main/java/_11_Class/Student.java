package _11_Class;

// 내가 직접 자료형(클래스) 정의
public class Student {
    // 필드(값), 멤버(변수), 속성
    String name;
    int kor;
    int eng;
    int math;

    // 생성자 - new할때 호출되는 메서드
    // 엄밀히 따지면 메서드는 아님
    // 리턴명시x, 클래스이름과 동일한 이름
    public Student() {
        // 기본생성자 - 매개변수가 없는 생성자
        System.out.println("Student 기본생성자 호출됨");
    }

    // 생성자도 오버로딩이 가능하다
    public Student(String name, int kor, int eng, int math) {
        // new연산시 호출됨
        // 매개변수로 초기화할 데이터를 전달받을 수 있음
        System.out.println("전체필드 초기화 생성자 호출됨!");

        // this는 객체 자기자신의 heap 주소값
        // 우리가 코드로 확인할 수 없지만,
        // 객체를 참조하여 호출하는 생성자, 메서드들은
        // 자기자신의 heap주소를 this라는 매개변수로 전달한다.
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 이름만 초기화하는 생성자
    public Student(String name) {
        this(name, 0, 0, 0);
        // this != this() 전혀 무관한 문법
        // this() -> 같은 이름의 생성자를 호출
        // 제약사항: 생성자의 가장 첫줄에 적어줘야 한다.
    }

    // 인스턴스 메서드(static이 없는 메서드)
    // this를 매개변수로 전달받는 메서드
    public void printStudentInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("국어: " + this.kor);
        System.out.println("영어: " + this.eng);
        System.out.println("수학: " + this.math);
    }
    
    // 1. getTotalScore라는 인스턴스 메서드
    // 총점을 계산하고 총점을 리턴하는 메서드
    public int getTotalScore() {
        int sum = this.kor + this.eng + this.math;
        return sum;
    }
    // 2. printAvgScore라는 인스턴스 메서드
    // 평균을 계산하고, 출력하는 메서드
    public void printAvgScore() {
        // 인스턴스 메서드 안에서 인스턴스메서드 호출 가능
        // static메서드 또한 호출가능
        int sum = this.getTotalScore();
        double avg = sum / 3.0;

        System.out.println(this.name + "의 평균점수: " + avg);
    }

    // 필드값을 메서드를 통해서 변경할 수 있다.
    // why? this를 전달 받았으니까!
    public void changeName(String name) {
        this.name = name;
    }

}