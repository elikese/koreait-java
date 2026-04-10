package _11_Class;

public class ClassMain {
    public static void main(String[] args) {
        // 클래스: 내가 직접 정의하는 참조자료형

        int[] scores = {80, 90, 70};
        String[] names = {"홍길동", "고길동", "박길동"};
        
        // 자료형단위가 아니라, 내가 편한방식으로 데이터를 구분해서 저장

        // new: 참조자료형이 저장될 heap메모리 공간 확보
        Student st1 = new Student(); // st1은 확보한 heap주소를 저장

        st1.name = "홍길동";
        st1.kor = 90;
        st1.eng = 80;
        st1.math = 70;

        System.out.println(st1.name);
        System.out.println(st1.kor);
        System.out.println(st1.eng);
        System.out.println(st1.math);

        // new연산하여서 실제 heap에 로드된 데이터묶음
        // -> "객체" 혹은 "인스턴스"
        Student st2 = new Student();
        st2.name = "고길동";
        st2.kor = 90;
        st2.eng = 80;
        st2.math = 70;

        Student[] students = {st1, st2};

        // Car 클래스를 정의해주세요
        // 필드: brand(회사명), model(모델명), year(연식)
        // main에서 Car객체를 생성하고 초기화 해 주세요
        Car car1 = new Car();
        car1.brand = "현대";
        car1.model = "소나타";
        car1.year = 2024;

        Student st3 = new Student("박길동", 60, 70, 80);
        // 인스턴스 메서드는 언제나
        // 객체.메서드()로만 호출 가능하다. -> this가 없으면 호출x
        st3.printStudentInfo();
        st2.printStudentInfo();
        st1.printStudentInfo();

        st3.printAvgScore();

        st3.changeName("박박길동");
        System.out.println(st3.name);
        st3.name = "김김길동";

        Student st4 = new Student("손흥민");

    }
}
