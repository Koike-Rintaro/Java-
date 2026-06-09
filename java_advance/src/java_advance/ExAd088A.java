package java_advance;

import java.util.Scanner;

public class ExAd088A {

	public static void main(String[] args) {
		
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("＞");
			String[] input = scn.nextLine().split(" ");
			
			int N = Integer.parseInt(input[0]);
			int A = Integer.parseInt(input[1]);
			
			boolean isShiharai = false;
			
			//入力値の個数判定
			if(input.length != 2) {
				System.err.println("入力値の数が適切ではありません");
			return;
			}
			
			//入力値判定（1つ目）
			if(1 > N || N > 10000) {
				System.err.println("一つ目の入力値の範囲が適切ではありません");
			return;
			}
			
			//入力値判定（2つ目）
			if(0 > A || A > 1000) {
				System.err.println("二つ目の入力値の範囲が適切ではありません");
			return;
			}
			
				if(N > 500) {
					N = N % 500;
				}
				if(N < A) {
					isShiharai = true;
				}
			
			if(isShiharai) {
				System.out.println("Yes");
			}
			if(!isShiharai) {
				System.out.println("No");
			}
			
		}catch(NumberFormatException e) {
			System.out.println("入力値が整数値ではないか、数値ではありません");
		}
	}

}
