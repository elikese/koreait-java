package _12_Access;

public class WaterBottle {
    private int currentWater; // 현재 물컵에 있는 양

    public WaterBottle() {
        this.currentWater = 100; // 초기값 100ml
    }

    public int getCurrentWater() {
        System.out.println("현재 물의양: " + this.currentWater);
        return this.currentWater;
    }

    // 물을 채우는 메서드 - currentWater += amount
    // 메서드명: fill, 매개변수: int amount
    // amount가 음수면x, 총량:1000을 넘으면x,
    // "물을 채웠습니다." 출력
    public void fill(int amount) {
        if(amount < 0) {
            System.out.println("물은 음수일수 없습니다.");
            return;
        }
        if(this.currentWater + amount > 1000) {
            System.out.println("총량보다 더 담을수 없습니다.");
            return;
        }

        this.currentWater += amount;
        System.out.println("물을 채웠습니다.");
    }

    // 물을 마시는 메서드 - currentWater -= amount
    // 메서드명: drink, 매개변수: int amount
    // amount가 음수면x, 현재물의 양보다 더 많이 마실수 x
    // "물을 마셨습니다." 출력
    public void drink(int amount) {
        if(amount < 0) {
            System.out.println("물의양은 음수일수 없습니다.");
            return;
        }
        if(this.currentWater < amount) {
            System.out.println("현재 가진 물의양보다 더 마실 수 없습니다.");
            return;
        }

        this.currentWater -= amount;
        System.out.println("물을 마셨습니다.");
    }

}
