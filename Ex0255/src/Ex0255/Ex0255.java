package Ex0255;

import java.util.Scanner;

public class Ex0255 {

	public static void main(String[] args) {
		try (Scanner scnDW = new Scanner(System.in);
			 Scanner scnFD = new Scanner(System.in);
			) {
			
			System.out.println("月の始まりの曜日を数字で入力してください");
			int DW = scnDW.nextInt();
			
			System.out.println("月末の日を数字で入力してください");
			int FD = scnFD.nextInt();
						
			System.out.println("日　月　火　水　木　金　土");
			System.out.println("--------------------------");
			
			for(int i = 0; i < DW; i++) {
				System.out.print("　　");
				}
			
			for(int day = 1; day <= FD; day++) {
				System.out.printf("%02d", day);
				System.out.print( "　");
				
				if((DW + day) % 7 == 0) {
					System.out.println();
				}
				
			}
			
		}
		
	}
}