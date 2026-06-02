package Ex0160;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0160 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;

		
		try (Scanner NUM1 = new Scanner(System.in);
			 Scanner NUM2 = new Scanner(System.in);	
			) {
			
			try {
				System.out.println("１つ目の数字(0～5)：");
				num1 = NUM1.nextInt();
				System.out.println("２つ目の数字(0～5)：");
				num2 = NUM2.nextInt();
				
				//入力値の範囲チェック
				if((num1 <= 0 || num1 >= 5) || (num2 <= 0 || num2 >= 5)) {
					System.out.println("入力値が0～5以外の値が含まれています");
					return;
				}
				
			//入力値の数値チェック
			}catch(InputMismatchException e){
				System.out.println("入力値が数値ではないか、整数ではありません");
				return;
			}
			
			String[][] ura = {
					{"吉", "吉", "凶", "凶", "凶", "吉"},
					{"吉", "吉", "凶", "吉", "凶", "吉"},
					{"凶", "凶", "吉", "吉", "吉", "吉"},
					{"凶", "吉", "吉", "吉", "凶", "凶"},
					{"凶", "凶", "凶", "吉", "吉", "凶"},
					{"凶", "吉", "吉", "凶", "凶", "凶"}
			};
			
			String result = ura[num1][num2 ]; 
			
			System.out.println("占い結果は" + result + "です");
			
			
		}
	}
}
