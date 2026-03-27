package _06_For;

public class Nested {
    public static void main(String[] args) {
        // 중첩 for문 - 2중 for문

        // 일주일 - 7일
        for (int day = 1; day <= 7; day++) {
            System.out.println("\t" + day + "일 살았습니다.");
        }

        // 한달 - 4주
        // 바깥반복 1회당 안쪽반복 전체반복
        for (int week = 1; week <= 4; week++) {
            System.out.println(week + "주 시작!");
            for (int day = 1; day <= 7; day++) {
                System.out.println("\t" + day + "일 살았습니다.");
            }
            System.out.println(week + "주 끝!");
        }

        // 구구단
        /*
            2x1=2
            2x2=4
            ...
            2x9=18
        */
        for (int dan = 1; dan <= 9; dan++) {
            System.out.println(dan + "단 시작");
            for (int i = 1; i <= 9; i++) {
                System.out.println("\t" + dan + "x" + i + "=" + (dan * i));
            }
            System.out.println(dan + "단 끝");
        }

        // 별찍기
        /*
                *****
                *****
                *****
                *****
                *****
        */

        for(int j = 0; j < 5; j++) {
            for(int i = 0; i < 5; i++) {
                System.out.print("*");
            } // ***** 로 치환해서 생각
            System.out.println();
        }

        /*
            *
            **
            ***
            ****
            *****
            바깥 for문에서 선언된 변수는
            안쪽에서도 사용가능하다!
        */

        for(int j = 0; j < 5; j++) {
            for (int i = 0; i < j + 1; i++) {
                System.out.print("*");
            }
            System.out.println(); // 엔터 키
        }

        /*
            콘솔에 아래와 같이 출력해주세요!
            *****
            ****
            ***
            **
            *
        */

        for (int j = 1; j <= 5; j++) {
            // j가 1씩커지면 *이 줄어들어야 함
            for(int i = 5; i >= j; i--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
