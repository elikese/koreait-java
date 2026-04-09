package _10_Method;

public class Practice2 {

    // 평균을 전달받아 학점을 리턴
    public static String getGrade(double average) {
        String grade;
        if(average >= 90) {
            grade = "A";
        } else if(average >= 80) { // average < 90
            grade = "B";
        } else if(average >= 70) { // average < 80
            grade = "C";
        } else {
            grade = "D";
        }

        return grade;
    }
    
    public static void printStudentInfo
            (String name, int kor, int eng, int math)
    {
        int totalScore = kor + eng + math;
        double average = totalScore / 3.0;

        // main -> printStudentInfo -> getGrade
        String grade = getGrade(average);

        System.out.println(name + "학생의 성적정보");
        System.out.println("총점: " + totalScore);
        System.out.println("평균: " + average);
        System.out.println("학점: " + grade);
    }

    public static void main(String[] args) {
        // 학생성적, 이름을 입력하면, 총점, 평균, 등급을 출력하는 메서드
        printStudentInfo("홍길동", 80, 90, 70);
    }
}
