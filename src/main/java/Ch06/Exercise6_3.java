package Ch06;

public class Exercise6_3 {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("name: " + s.name);
        System.out.println("total score: " + s.getTotal());
        System.out.println("average score: " + s.getAverage());
    }
}

class Student2 {
    String name;
    int ban, no, kor, eng, math;

    /*Student2(String name, int b, int n, int k, int e, int m) {
        this.name = name;
        this.ban = b;
        this.no = n;
        this.kor = k;
        this.eng = e;
        this.math = m;
    }*/
    int getTotal() {
        return kor + eng + math;
    }
    double getAverage() {
        double result = (double)getTotal()/3;
        return result;
    }
    String info()  {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
    }
}
