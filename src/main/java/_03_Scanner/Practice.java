package _03_Scanner;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 이름(String), 나이(int), 주소(String)
        // 를 입력받고 출력해 주세요!
        System.out.print("이름 입력 >>");
        String name = scanner.nextLine();

        System.out.print("나이 입력 >>");
        int age = scanner.nextInt();
        scanner.nextLine(); // 엔터처리

        System.out.print("주소 입력 >>");
        String address = scanner.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("주소: " + address);

        // 다음시간 풀이!
        // 1. int postCount를 입력받기
        System.out.print("게시글이 얼마나 존재하나요 >>");
        int postCount = scanner.nextInt();
        int viewCount = 20;
        // 2. pageCount를 계산하여 출력
        int pageCount;
        // viewCount만큼 나누었을때 나머지가 있으면 + 1
        pageCount = postCount % viewCount == 0
                ? postCount / viewCount
                : postCount / viewCount + 1;

        System.out.println("총 페이지 :" + pageCount);


    }
}
