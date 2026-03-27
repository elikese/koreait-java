package _02_Operator;

public class Operator2 {
    public static void main(String[] args) {
        // 논리연산자 - boolean 타입끼리 연산
        // 연산결과도 boolean

        boolean hasLicense = true;
        int age = 25;
        // and연산자(&&): 둘다 true일때 true
        boolean canDrive = hasLicense && age > 19;

        boolean isWeekend = false;
        boolean isHoliday = true;
        // or연산자(||): 둘중 하나라도 true면 true
        boolean isRest = isHoliday || isWeekend;

        // not 연산자(!): boolean값 반전
        boolean isOnline = true;
        boolean isOffLine = !isOnline;

        int a = 5;
        // 0 < a < 10
        boolean sample = a > 0 && a < 10;

        
        // 삼항연산자
        // boolean데이터 ? true일때의 값 : false일때의 값
        int x = 5;
        int y = 3;

        // 둘 중 큰 값
        int max = x > y ? x : y;
        System.out.println("둘중 더 큰 값:" + max);

        // ? 이후의 데이터 타입이 동일 해야한다.
        // ? 이후 작성하는 데이터타입에 따라 연산결과타입이 다름
        boolean isSame = x == y ? true : false;
        String sameStr = x == y ? "같습니다" : "다릅니다";

        // 실습) height가 150이상이면 "탑승가능", 아니라면 "탑승불가능"
        // 을 출력해주세요
        int height = 120;
        String result = height >= 150 ? "탑승가능" : "탑승불가능";
        System.out.println(result);

        // 실습2) 50000 이상이면 10퍼 할인한 가격, 아니라면 원래가격을 출력
        int price = 60000;

        double finalPrice = price >= 50000 ? price - price * 0.1 : price;
        System.out.println("최종가격: " + finalPrice);


        // 중첩가능 - 연산자(결과가 값)
        age = 17;
        String ticketName = age >= 20 ? "성인요금" // 조건? true일때
                : age >= 14 ? "청소년요금" // 조건? true일때
                : "어린이요금"; // 모든 조건 false일 때

        /*
            시험용! 연산자 우선순위
            우선순위 동일할 경우 왼쪽부터 오른쪽으로
            () > 대입
            // !!시험용!!
            () > 단항(!도 포함) > 산술 > 비교 > 논리 > 삼항 > 대입
        */

    }
}
