package Ex0200;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0200 {

	public static void main(String[] args) {
		int n = 0;
		int result = 0;
		
		try (Scanner NUM = new Scanner(System.in);
			) {
			
			try {
				System.out.println("input number：");
				n = NUM.nextInt();
				
			//入力値の数値チェック
			}catch(InputMismatchException e){
				System.out.println("入力値が数値ではないか、整数ではありません");
				return;
			}
			
			for(int i = 1; i <= n ; i++) {
				result = result + i;
			}
			System.out.println("合計値 ＝ " + result);
			
		}
	}

}
