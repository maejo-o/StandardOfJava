package Ch06;

public class Ex6_3 {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.num = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.num = 4;

        System.out.println("c1: " + c1.kind + ", " + c1.num + ", " + "the size is " + Card.width + "*" + Card.height);
        System.out.println("c2: " + c2.kind + ", " + c2.num + ", " + "the size is " + Card.width + "*" + Card.height);
        System.out.println("change the c1's size");
        // c1 의 with height 의 값을 바꾸었는데도 width, height 가 cv 라서 c2 의 값도 변경된다.
        c1.width = 50;
        c1.height = 125;
        System.out.println("c1: " + c1.kind + ", " + c1.num + ", " + "the size is " + Card.width + "*" + Card.height);
        System.out.println("c2: " + c2.kind + ", " + c2.num + ", " + "the size is " + Card.width + "*" + Card.height);

    }
}
class Card {
    String kind;
    int num;
    static int width = 100; // static + iv 이므로 class variable 이다.
    static int height = 250;
}
