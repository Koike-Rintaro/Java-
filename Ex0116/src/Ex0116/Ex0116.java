package Ex0116;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0116 {

	public static void main(String[] args) {
		
		int i1 = 0;
		int i2 = 0;
		
		try (
			Scanner scnA = new Scanner(System.in);
			Scanner scnB = new Scanner(System.in);	
			) {
			//int型変数に格納、数字ではなかったらエラー表示
			try {
				System.out.println("input number1：");
				i1 = scnA.nextInt() ;
				System.out.println("input number1：");
				i2 = scnB.nextInt() ;

			}catch(InputMismatchException e) {
				System.out.println("入力値が数字ではありません");
				return;
			}
			
			if(i1 % 2 == 0 && i2 % 2 == 0) {
				System.out.println("\r\n2つの値ともに偶数です");
			}else if(i1 % 2 == 1 && i2 % 2 == 1){
				System.out.println("\r\n2つの値ともに奇数です");				
			}else if(i1 % 2 == 1 && i2 % 2 == 0) {
				System.out.println("\r\ni1は奇数です。i2は偶数です");								
			}else {
				System.out.println("\r\ni1は偶数です。i2は奇数です");												
			}
			
		}

	}

}
