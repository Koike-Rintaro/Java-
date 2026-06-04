package Ex0112;

import java.util.Scanner;

public class Ex0112 {

	public static void main(String[] args) {
		
		System.out.println("文字列を入力してください");
		
		try (Scanner scn = new Scanner(System.in)) {
			String str = scn.next();
		
			if(isHalfWidth(str)) {
				System.out.println("半角カナが含まれます");
			}else {
				System.out.println("許可する文字列です");
			}
		}
	}

	private static boolean isHalfWidth(String str) {
		
		return str.matches(".*[\\uFF65-\\uFF9F].*");
	}

}
