package Ex0140;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0140 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int com = 0;
		
		try (Scanner NUM1 = new Scanner(System.in);
			 Scanner NUM2 = new Scanner(System.in);	
			 Scanner COM = new Scanner(System.in);
			) {
			
			try {
				System.out.println("input number1：");
				num1 = NUM1.nextInt();
				
				System.out.println("input number2：");
				num2 = NUM2.nextInt();
				
				System.out.println("input command：");
				com = COM.nextInt()
;				
			}catch(InputMismatchException e){
				System.out.println("入力値が数値ではありません");
				return;
			}
			
			switch (com) {
				case 0 : 
					int tasu = num1 + num2;
					System.out.println("\r\n計算結果 = " + tasu);
					break;
				
				case 1 : 
					int hiku = num1 - num2;
					System.out.println("\r\n計算結果 = " + hiku);
					break;
				
				case 2 :
					int kake = num1 * num2;
					System.out.println("\r\n計算結果 = " + kake);
					break;
				
				default:
					int waru = num1 / num2;
					System.out.println("\r\n計算結果 = " + waru);
			} 
			
		}

	}

}
