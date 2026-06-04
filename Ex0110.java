package EX0110;

import java.util.Scanner;

public class Ex0110 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("キーボードから2つの文字列を入力してください");
		
		try (Scanner scan1 = new Scanner(System.in);
			 Scanner scan2 = new Scanner(System.in);){
			
			String str1 = scan1.next();
			String str2 = scan2.next();
			
			System.out.println("文字列１：");
			System.out.println(str1);
			
			System.out.println("文字列２：");
			System.out.println(str2);
			
			if(str1.compareTo(str2) < 0) {
				System.out.println(str1 + "  " + str2);
			}else if(str2.compareTo(str1) < 0){
				System.out.println(str2 + "  " + str1);
			}else {
				System.out.println("2つの文字列は同じです　->" + str1);
			}
		}
		
	}

}
