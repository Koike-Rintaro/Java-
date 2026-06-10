package java_advance;

import java.util.Scanner;

public class ExAd079B {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("＞");
		
		int intN = scn.nextInt();
		if(1 > intN || intN > 86) {
			System.err.println("入力値の範囲が適切ではありません。1～86の間が適切です。");
			scn.close();
			return;
		}
		
		long L[] = new long[intN + 1];
		L[0] = 2;
		L[1] = 1;
		
		long result = 0;
		
		for(int i = 2; i <= intN; i++) {
			result = L[i - 1] + L[i - 2];
			L[i] = result;
		}
		
		System.out.println(result);
		
		scn.close();
	}

}
