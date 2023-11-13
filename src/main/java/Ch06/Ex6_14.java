package Ch06;

public class Ex6_14 {
    static {
        System.out.println("static { }"); // class initialization block
    }
    {
        System.out.println(" { }"); // instnce initialization block
    }
    public Ex6_14 () {
        System.out.println("base construction");
    }
    public static void main(String[] args) {
        System.out.println("Ex6_14 bt = new Ex6_14();");
        Ex6_14 bt = new Ex6_14();

        System.out.println("Ex6_14 bt2 = new Ex6_14();");
        Ex6_14 bt2 = new Ex6_14();
    }
}
