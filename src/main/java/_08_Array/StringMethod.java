package _08_Array;

public class StringMethod {
    public static void main(String[] args) {
        // 문자열
        // String -- char[]

        // 참조가능
        String str1 = new String("hello");
        boolean isSame = str1.equals("hello");

        // 여러 참조기능
        String str2 = "My name is Son";
        // 1. 배열처럼 길이가 존재
        System.out.println(str2.length());
        // 2. 특정 문자열의 포함여부
        System.out.println(str2.contains("Son"));
        // 3. 특정 문자열이 몇번째 index에서 시작하는가
        System.out.println(str2.indexOf("name"));
        // 4. 부분문자열 추출 가능
        System.out.println(str2.substring(3)); // 3번부터 끝까지
        System.out.println(str2.substring(3, 8)); // 3번이상 8미만



    }
}
