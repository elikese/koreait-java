package _03_Scanner;

import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        // 입력
        // 스캐너 불러오기
        Scanner scanner = new Scanner(System.in);

        // 콘솔창에서 입력한 데이터를 자바로 가져올 수 있다.
        System.out.print("문자를 입력하세요 >>");
        String myInputStr = scanner.nextLine(); // 엔터키를 인식해서 문자열 가져옴
        System.out.println("내가 입력한 문자열: " + myInputStr);

        System.out.print("숫자를 입력하세요 >>");
        int myInputInt = scanner.nextInt(); // 엔터키를 인식해서 숫자 가져옴
        // 엔터(문자)를 가져오지는 못한다.
        System.out.println("내가 입력한 숫자: " + myInputInt);
        scanner.nextLine(); // 남아있는 엔터키 처리용

        System.out.print("두번째 문자열을 입력 >>");
        String myInputStr2 = scanner.nextLine();
        System.out.println("내가 입력한 문자열2: " + myInputStr2);


    }
}
