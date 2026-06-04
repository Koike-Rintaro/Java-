package Ex0320;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0320 {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("input number：");
			
			int num = scn.nextInt();
			
			if(num < 0) {
				System.out.println("有効な数字は正の整数です。");
				return;
			}else if(num >= 13) {
				System.err.println("数値が許容範囲を超えている恐れがあります。(約21億を超えている可能性)");
			}
			
			System.out.println(fibo(num));
		}catch(InputMismatchException e) {
			System.out.println("入力値が数字でないか整数ではありません");
		}
	}
	
	static int fibo(int n) {
		
			if(n == 0) {
				return 1;
			}else {
				return n * fibo(n - 1);
		}

	}

}
