package Ex0240;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0240 {

	public static void main(String[] args) {

		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("input number：");
			
			String inputNum = scn.next();
			
			boolean found = false;
			
			System.out.print("九九の表");

			for(int i = 1; i <= 9; i++) {
				if(found) {
				}
				for(int j = 1; j <= 9; j++) {
					int kuku = i * j;
					String result = String.format("%02d", kuku);
					
					
					
					if(inputNum.equals(result)) {
						System.out.print("(" +j + "*" + i + ")");
						found = true;
					}		
				}
			}
			
			if(found) {
				System.out.print("にあります");
			}
			
			if(!found) {
				System.out.print("にありません");
			}
			
		}catch(InputMismatchException e) {
			System.out.println("入力値が有効ではありません");
		}
	}
}
