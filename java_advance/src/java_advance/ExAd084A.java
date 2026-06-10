package java_advance;

import java.util.Scanner;

public class ExAd084A {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("＞");
		int M = scn.nextInt();
		
		if( 1 > M || M > 23) {
			System.out.println("入力値の範囲が適切ではありません。");
			scn.close();
			return;
		}
		
		int x = 48 - M;
		
		System.out.println(x);
		
		scn.close();
	}

}
