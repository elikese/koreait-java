package _08_Array;

public class Practice1 {
    public static void main(String[] args) {
        int[] scores = {80, 90, 75, 100, 65, 80};
        // scores에 담긴 점수들의 총합 / 평균점수를 구해서 출력!
        // for문, 길이
        int sum = 0;

        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합: " + sum);
        System.out.println("평균: " + sum / scores.length);
        
        String[] foods = {"김치", "두부(상함)", 
                "우유", "사과", "계란(상함)"};
        // foods에서 "(상함)"이 포함된 음식을 제외하고 출력
        // StringMethod 참조기능 활용
        for(int i = 0; i < foods.length; i++) {
            String food = foods[i];
            boolean isContain = food.contains("(상함)");
            // isContain이 true면 출력되면 안됨
            if(isContain) {
                continue;
            } // isContain이 true니까 continue로 스킵됨
            // -> 아래 출력문이 실행되지 않음
            System.out.println("현재 음식: " + food);
        }

    }
}
