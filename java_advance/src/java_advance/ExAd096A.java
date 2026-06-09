package java_advance;

import java.util.Scanner;

public class ExAd096A {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("＞");
			String[] input = scn.nextLine().split(" ");
			
			int num1 = Integer.parseInt(input[0]);
			int num2 = Integer.parseInt(input[1]);
			
			//「高橋」の回数カウント変数
			int cnt = 0;
			
			//出力結果が一件のときfalse、複数件の時trueになる変
			boolean isResultCnts = false;
			
			//入力値の個数判定
			if(input.length != 2) {
				System.err.println("入力値の数が適切ではありません");
			return;
			}
			
			//入力値判定（1つ目）
			if(1 > num1 || num1 > 12) {
				System.err.println("一つ目の入力値の範囲が適切ではありません");
			return;
			}
			
			//入力値判定（2つ目）
			if(1 > num2 || num2 > 31) {
				System.err.println("二つ目の入力値の範囲が適切ではありません");
			return;
			}
			
			for(int i = 1; i <= num1; i++) {
				for(int j = 1; j <= num2; j++) {
					if(i == j) {
						
						//cntが一件で、二件目に入る前に"、"を挿入
						if(cnt == 1) {
							System.out.print("、");
						}
						
						System.out.print(i + "月" + j + "日");
						cnt++;
						
						if(cnt != 1) {
							isResultCnts = true;
						}
						
						//複数件の時かつラスト月（iがnum1）の時は"。"を挿入。ラスト月以外の時は"、"を挿入
						if(isResultCnts && i != num1) {
							System.out.print("、");
						}else if(isResultCnts && i != num1) {
							System.out.println("。");
						}
						
					}
				}
			}
			
			//ループ処理を抜けた後
			
			//複数件(isResultCnts が true)の時の表示
			if(isResultCnts) {
				System.out.print("。合計" + cnt + "日が「高橋」です。");
			}
			
			//一件(isResultCnts が false)の時の表示
			if(!isResultCnts) {
				System.out.print("のみが「高橋」です。");
			}
			
			
		}catch(NumberFormatException e) {
			System.out.println("入力値が整数値ではないか、数値ではありません");
		}
		
		
	}

}
