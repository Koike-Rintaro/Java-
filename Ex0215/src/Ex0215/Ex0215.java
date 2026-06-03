package Ex0215;

import java.util.Scanner;

public class Ex0215 {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("input number：" );

			String num = scn.nextLine();
			
			System.out.println("\r\n");
			
			String[] NUM = num.split(" ");
			
			int[] intArray = new int[NUM.length];
			
			int resultI;
			int resultJ;
			
			boolean found = false;
			

			for(int i = 0; i < NUM.length; i++) {

				for(int j = i + 1; j < NUM.length; j++) {
					intArray[i] = Integer.parseInt(NUM[i]);
					intArray[j] = Integer.parseInt(NUM[j]);
					
					if(intArray[i] + intArray[j] == 10) {
					
						if(found) {
							System.out.print("、");
						}
						
						resultI = intArray[i];
						resultJ = intArray[j];
						
						System.out.print(resultI + "と" + resultJ);
						
						found = true;
					}
				}
			}
		
			if(found) {
				System.out.println("は足して10になるペアです");	
			}
			
			if(!found) {
				System.out.println("ペアとなる数字はありません");
			}

		
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		

	}

}
