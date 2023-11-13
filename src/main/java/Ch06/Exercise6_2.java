package Ch06;

public class Exercise6_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
        String str = s.info();
        System.out.println(str);
    }
}

class Student {
    String sname;
    int nn1, nn2, nn3, nn4, nn5;

    Student(String name, int n1, int n2, int n3, int n4, int n5) {
        super();
        this.sname = name;
        this.nn1 = n1;
        this.nn2 = n2;
        this.nn3 = n3;
        this.nn4 = n4;
        this.nn5 = n5;
    }
    int getTotal() {
        return nn3 + nn4 + nn5;
    }
    double getAverage() {
        double result = (double)getTotal()/3;
        return result;
    }
    String info()  {
        return sname + ", " + nn1 + ", " + nn2 + ", " + nn3 + ", " + nn4 + ", " + nn5 + ", " + getTotal() + ", " + getAverage();
    }
}
