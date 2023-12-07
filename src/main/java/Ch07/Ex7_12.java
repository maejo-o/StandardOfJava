package Ch07;

public class Ex7_12 {
    class InstanceInner {
        int iv = 100;
        static int cv = 100;
        final static int CONST = 100;
    }
    static class StaticInner {
        int iv = 200;
        static int cv = 200; // static class 만 static member 정의 가능
    }
    void myMethod() {
        class LocalInner {
            int iv = 200;
            // static int cv = 300; // error!! static var 선언 불가
            final static int CONST = 300; // final static 은 상수이므로 허용
        }
    }
    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
