package Ch06;
class MyPoint {
    int x;
    int y;
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    double getDistance(int x, int y) {
        int dis1 = (x - this.x) * (x - this.x);
        int dis2 = (y - this.y) * (y - this.y);
        return Math.sqrt((double)(dis1 + dis2));
    }
}
public class Exercise6_6 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);
        // p 와 (2, 2) 의 거리 구하기
        System.out.println(p.getDistance(2, 2));
    }
}


