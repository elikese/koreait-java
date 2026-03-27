package _04_If;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // 로그인 - 아이디, 비밀번호 확인
        // 참고) 문자열 비교는 == 연산자 사용하지 x
        String str1 = "javaMan";
        String str2 = new String("javaMan");
        System.out.println("str1 :" + str1);
        System.out.println("str2 :" + str2);
        System.out.println(str1 == str2);
        // 문자열1.equals(문자열2) 사용
        System.out.println(str1.equals(str2));

        String userId = "java";
        String userPassword = "qwer1234";

        Scanner scanner = new Scanner(System.in);
        System.out.print("아이디 >>");
        String inputId = scanner.nextLine();
        System.out.print("패스워드 >>");
        String inputPassword = scanner.nextLine();
        // 입력받은 아이디, 패스워드가 모두 동일하면, 로그인성공 출력!
        // 하나라도 다르면, 로그인실패 출력!

        boolean isSameId = userId.equals(inputId);
        boolean isSamePassword = userPassword.equals(inputPassword);
        boolean isValidLogin = isSameId && isSamePassword;

        if(isValidLogin) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }


    }
}
