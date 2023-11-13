package Ch06;

public class Exercise6_4 {
    static double getDistance(int x, int y, int x1, int y1) {
        int dis1 = x1 - x;
        int dis2 = y1 - y;
        double result = Math.sqrt((double)(dis1*dis1) + (dis2*dis2));
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}

