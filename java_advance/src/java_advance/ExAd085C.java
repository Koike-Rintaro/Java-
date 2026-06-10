package java_advance;

import java.util.Scanner;

public class ExAd085C {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("＞");
		String[] input = scn.nextLine().split(" ");
		
		String numN = input[0];
		String numY = input[1];
		
		int N = Integer.parseInt(numN);
		int Y = Integer.parseInt(numY);
		
		boolean isExist = false;
		
		if(1 > N || N > 2000) {
			System.out.println("1つ目の入力値の範囲が適切ではありません。");
			scn.close();
			return;
		}
		
		if(1000 > Y || Y > 20000000) {
			System.out.println("2つ目の入力値の範囲が適切ではありません。");
			scn.close();
			return;
		}
		
		if(!(Y % 1000 == 0)) {
			System.out.println("2つ目の入力値は1000の倍数で入力してください。");
			scn.close();
			return;
		}
		
		for(int x = 0; x <= N; x++) {
			for(int y = 0; y <= N - x; y++) {
				int z = N - x -y;
				
				int total = 10000 * x + 5000 * y + 1000 * z;
				
				if(total == Y) {
					System.out.println(x + " " + y + " " + z);
					isExist = true;
					break;
				}
			}
			
			if(isExist) {
				break;
			}
		}
		
		if(!isExist) {
			System.out.println("-1 -1 -1");
		}
		
		scn.close();
	}

}
