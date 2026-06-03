package Ex0235;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0235 {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("0～255の範囲の10進数");
			
			int inputNum = scn.nextInt();
			
			int num2 = inputNum;
			int num16 = inputNum;

			
			String result2 = "";
			
			String result16 = "";
			
			//入力範囲チェック
			if(0 > num2 || num2 > 255) {
				System.out.println("範囲外の10進数です");
				return;
			}
			
			//2進数
			for(int i = 0; i < 8; i++) {
				result2 = (num2 % 2) + result2;
				//R2[i] = num % 2;
				num2 = num2 / 2;
			}
			System.out.println("2進数の変換結果：" + result2);


			//16進数
			String[] hexChars = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
			
			for(int i = 0; i < 2; i++) {
				int replace16 = (num16 % 16);
				result16 = hexChars[replace16] + result16;
				num16 = num16 / 16;
				
			}
			System.out.println("16進数の変換結果：" + result16);

			
			
			
			
			
		}catch(InputMismatchException e) {
			System.out.println("入力値が数値ではありません");
		}
	}

}