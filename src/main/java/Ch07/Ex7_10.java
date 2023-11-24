package Ch07;

public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group = { new Marine(), new Tank(), new Dropship()};
        for(int i = 0; i < group.length; i++)
            group[i].move(100, 200);
    }
}
abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void staop() { /* 현재 위치애 정지 */ }
}
class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x = " + x + ", y = " + y + "]");
    }
    void steampack() { /* Using the steampack */ }
}
class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank[x = " + x + ", y = " + y + "]");
    }
    void changeMode() { /* change the attacking mode */}
}
class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship[x = " + x + ", y = " + y + "]");
    }
    void load() { /* 선택된 대상을 태운다 */ }
    void unload() { /* 선택된 대상을 내린다 */ }
}