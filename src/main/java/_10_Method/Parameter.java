package _10_Method;

public class Parameter {
    public static void changeNum(int num) {
        System.out.println("changeNum 호출됨");
        num += 3;
    }

    public static void changeArray(int[] nums) {
        System.out.println("changeArray 호출됨");
        nums[0] = 999;
    }

    public static void main(String[] args) {
        int num = 10;
        // 퀴즈
        changeNum(num);
        System.out.println(num); // 출력값? 10
        // 메서드별로 각기 다른 stack 공간이 존재
        // -> 서로다른 num

        int[] nums = {1, 2, 3};
        System.out.println(nums[0]); // 1
        changeArray(nums);
        System.out.println(nums[0]); // ? 999
        // heap메모리의 특징
        // 참조자료형의 경우 매개변수로 heap주소를 전달
        // -> heap데이터를 조작할 수 있음

    }
}
