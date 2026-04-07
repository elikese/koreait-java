package _10_Method;

public class Practice {
    // 1. 정수를 하나 전달받아 
    // 짝수인지 판단하는 메서드를 작성해 주세요
    // 짝수면 true 리턴, 아니면 false 리턴
    public static boolean isEven(int num) {
        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // 2. 정수 배열을 하나 전달받아: int[]
    // 배열 내에 짝수의 갯수가 몇개인지 리턴하는 메서드
    // 리턴타입: int
    public static int countEven(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // 3. 정수배열과 정수를 각각 하나씩 전달받아
    // 전달받은 정수배열에 전달받은 정수를 포함하는지 검사하는 메서드
    // 있으면 true, 없으면 false
    public static boolean isContain(int[] nums, int target) {
        boolean isFind = false; // flag 사용
        // for문 돌면서 조건에 부합하면 isFind를 true업데이트
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num == target) {
                isFind = true;
                break;
            }
        }
        return isFind;
    }

    // 아이디, 패스워드를 매개변수로 전달받아서
    // 아이디가 "admin", 패스워드가 "1q2w3e4r"
    // 둘다 동일할때 true리턴, 아니면 false리턴
    public static boolean login(String id, String pw) {
        boolean isSameId = id.equals("admin");
        boolean isSamePw = pw.equals("1q2w3e4r");
        return isSameId && isSamePw;
    }

    public static void main(String[] args) {
        int number = 16;
        System.out.println(isEven(number));
        int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 12};
        System.out.println(countEven(numArr));
        int[] numArr2 = {1, 100, 200};
        System.out.println(countEven(numArr2));
        System.out.println(isContain(numArr, 5));



    }
}
