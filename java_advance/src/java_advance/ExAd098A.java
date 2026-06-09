package java_advance;

import java.util.Scanner;

public class ExAd098A {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("＞");
			String[] input = scn.nextLine().split(" ");
			
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			
			//入力値の個数判定
			if(input.length != 2) {
				System.err.println("入力値の数が適切ではありません");
			return;
			}
			
			//入力値判定（1つ目）
			if(-1000 > A || A > 1000) {
				System.err.println("一つ目の入力値の範囲が適切ではありません");
			return;
			}
			
			//入力値判定（2つ目）
			if(-1000 > B || B > 1000) {
				System.err.println("二つ目の入力値の範囲が適切ではありません");
			return;
			}
			
			int tasu = A + B;
			int hiku = A - B;
			int kake = A * B;
			
			int max = tasu;
			
			if(hiku > max) {
				max = hiku;
			}
			if(kake > max) {
				max = kake;
			}
			
			System.out.println(max);
			
			
		}catch(NumberFormatException e) {
			System.out.println("入力値が整数値ではないか、数値ではありません");
		}

	}

}
