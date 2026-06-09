package java_advance;

import java.util.Scanner;

public class ExAd090B {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("＞");
			String[] input = scn.nextLine().split(" ");
			
			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);
			
			//回文数の回数カウント変数
			int cnt = 0;
			
			//入力値の個数判定
			if(input.length != 2) {
				System.err.println("入力値の数が適切ではありません");
			return;
			}
			
			//入力制約の判定
			if(A > B) {
				System.err.println("入力値の大小を逆にしてください");
			return;
			}
			
			//入力値判定（1つ目）
			if(10000 > A || A > 99999) {
				System.err.println("一つ目の入力値の範囲が適切ではありません");
			return;
			}
			
			//入力値判定（2つ目）
			if(10000 > B || B > 99999) {
				System.err.println("二つ目の入力値の範囲が適切ではありません");
			return;
			}
			
			
			for(int i = A; i <= B; i++) {
				String num = String.valueOf(i);
				String reversed = new StringBuilder(num).reverse().toString();
				
				if(num.equals(reversed)) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
			
		}catch(NumberFormatException e) {
			System.out.println("入力値が整数値ではないか、数値ではありません");
		}

	}

}
