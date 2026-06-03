package Ex0242;

import java.util.Scanner;

public class Ex0242 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("input number : ");
            int inputNum = scn.nextInt();
            String result = "";
            
            // 最下段の星の数は「入力値 * 2 - 1」個になる
            int width = inputNum * 2 - 1;
            
            for (int i = 1; i <= inputNum; i++) {
                int starCount = i * 2 - 1;
                
                for (int j = 0; j < starCount; j++) {
                    result += "*";
                }
                
                int spaceCount = (width - starCount) / 2;
                int totalWidth = spaceCount + starCount;
                
                System.out.printf("%" + totalWidth + "s%n", result);
            }
        }
    }
}

