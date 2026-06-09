package java_advance;

import java.util.Arrays;
import java.util.Scanner;

public class ExAd099C {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("＞");
			int N = scn.nextInt();
			
			//入力値判定（1つ目）
			if(1 > N || N > 100000) {
				System.err.println("入力値の範囲が適切ではありません");
			return;
			}
			
			//N個の箱を持った配列。N円を引き出すための最小枚数。
			int[] dp = new int[N + 1];
			
			//最初は答えがわからないので、配列の中身をすべて∞にする。
			Arrays.fill(dp, Integer.MAX_VALUE);
			
			//0円を引き出すのに0枚必要。初期化
			dp[0] = 0;

			//すべての配列に、N円引き出すための必要最小枚数を計算、答えを作って代入。
			for(int i = 1; i <= N; i++) {
				
				//1円硬貨を使う場合
			    dp[i] = Math.min(dp[i], dp[i - 1] + 1);

			    //6のべき乗を使う場合。pは6,36,216,1296と増えていく
			    for(int p = 6; p <= i; p *= 6) {
			        dp[i] = Math.min(dp[i], dp[i - p] + 1);
			    }

			    //9のべき乗を使う場合。pは9,81,729,6561と増えていく
			    for(int p = 9; p <= i; p *= 9) {
			        dp[i] = Math.min(dp[i], dp[i - p] + 1);
			    }
			}

			System.out.println(dp[N]);
			
			
			
		}catch(NumberFormatException e) {
			System.out.println("入力値が整数値ではないか、数値ではありません");
		}
	}

}
