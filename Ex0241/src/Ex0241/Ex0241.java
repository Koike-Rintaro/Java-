package Ex0241;

import java.util.Scanner;

public class Ex0241 {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("input number：");
			
			int inputNum = scn.nextInt();
			
			String result = "";
			
			for(int i = 1; i <= inputNum; i++) {
				result = "*" + result;
				System.out.println(result);
			}
			
		}

	}

}
