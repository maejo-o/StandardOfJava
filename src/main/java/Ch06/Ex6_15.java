package Ch06;

class Ex6_15 {
    static int[] arr = new int[0];

    static {
        for(int i = 0; i < arr.length; i++) {
            // 1과 10 사이의 임의의 값을 배열 arr 에 저장한다
            arr[i] = (int)(Math.random() * 10) + 1;
        }
    }
    public static void main(String[] args) {
        for(int i = 0; i < arr.length; i++)
            System.out.println("arr[" + i + "] : " + arr[i]);
    }
}
