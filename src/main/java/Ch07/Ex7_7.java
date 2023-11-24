package Ch07;
class Car {
    String color;
    int door;
    void drive() {
        System.out.println("Drive ~~ Brrr~~" );
    }
    void stop() {
        System.out.println("Stop!");
    }
}
class FireEngine extends Car {
    void water() {
        System.out.println("water!");
    }
}
public class Ex7_7 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = new FireEngine();
        car = fe; // (Car) 생략가능 왜? 조상 <- 자손 이니까!
        // car.water // 불가능
        fe2 = (FireEngine)car; // 자손 <- 조상 이라서 생략 불가능하다
        fe2.water();
    }
}
