package Ex0114;

import java.util.Scanner;

public class Ex0114 {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			String str = scn.nextLine();
			
			System.out.println("文字列：");
			System.out.println(str);
			
			String[] StrArray = str.trim().split("\\s+");
			
			System.out.print("結果：");
			
			for(int i = StrArray.length - 1; i >= 0; i--) {
				System.out.print(StrArray[i] + "  ");
			}
			
		}
		
	}

}
