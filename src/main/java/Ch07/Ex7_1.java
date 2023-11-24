package Ch07;
class Tv {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}
class SmartTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if(caption) System.out.println(text); // caption On 일때만 text 를 보여준다.
    }
}
public class Ex7_1 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10; // 조상으로부터 상속받은 멤버 변수
        stv.channelUp(); // 조상으로부터 상속받은 멤버 함수
        System.out.println(stv.channel);
        stv.displayCaption("Hello, world!");
        stv.caption = true; // caption on
        stv.displayCaption("Hello.World!");
    }
}
