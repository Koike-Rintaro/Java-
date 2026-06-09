package java_advance;

import java.util.Scanner;

public class ExAd097A {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("＞");
			String[] input = scn.nextLine().split(" ");
			
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			int d = Integer.parseInt(input[3]);
			
			
			//入力値の個数判定
			if(input.length != 4) {
				System.err.println("入力値の数が適切ではありません");
			return;
			}
			
			//入力値判定（1つ目）
			if(1 > a || a > 100) {
				System.err.println("1つ目の入力値の範囲が適切ではありません");
			return;
			}
			
			//入力値判定（2つ目）
			if(1 > b || b > 100) {
				System.err.println("2つ目の入力値の範囲が適切ではありません");
			return;
			}
			
			//入力値判定（3つ目）
			if(1 > c || c > 100) {
				System.err.println("3つ目の入力値の範囲が適切ではありません");
			return;
			}
			
			//入力値判定（4つ目）
			if(1 > d || d > 100) {
				System.err.println("4つ目の入力値の範囲が適切ではありません");
			return;
			}
			
			
			int abDis = a - b;
			int abDisAbs = Math.abs(abDis);
			
			int bcDis = b - c;
			int bcDisAbs = Math.abs(bcDis);
			
			if(abDisAbs <= d && bcDisAbs <= d) {
				//isConversation = true;
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
			
		}
		catch(NumberFormatException e) {
			System.out.println("入力値が整数値ではないか、数値ではありません");
		}
	}

}
