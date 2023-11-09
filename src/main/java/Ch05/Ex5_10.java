package Ch05;

import java.util.Scanner;

public class Ex5_10 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "wood"},
                {"animal", "fur"},
                {"wine", "grape"}
        };
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s's element?%n", i + 1, words[i][0] );

            String tmp = scanner.nextLine();
            if(tmp.equals(words[i][1])) {
                System.out.printf("Good Answer!%n%n");
            } else {
                System.out.printf("Not Answer! The answer is %s%n", words[i][1]);
            }
        }
    }
}
