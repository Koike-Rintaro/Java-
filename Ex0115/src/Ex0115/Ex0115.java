package Ex0115;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex0115 {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			String str = scn.nextLine();
			
			System.out.println("文字列：");
			System.out.println(str + "\r\n");
			
			String[] StrArray = str.trim().split("\\s+");
			
			ArrayList<String> newArrayA = new ArrayList<>();
			ArrayList<String> newArrayB = new ArrayList<>();

			
			for(int i = 0; i <= StrArray.length -1; i++) {
				if(i % 2 == 0) {
					newArrayA.add(StrArray[i]);
				}else if(i % 2 == 1) {
					newArrayB.add(StrArray[i]);
				}
				
			
			}
			System.out.println("奇数番号：" + newArrayA.stream().map(String::valueOf).collect(Collectors.joining(" ")) + "  ");
			System.out.println("偶数番号：" + newArrayB.stream().map(String::valueOf).collect(Collectors.joining(" ")) + "  ");					
		}
		
	}

}
