package java_advance;

import java.util.Scanner;

public class ExAd086B {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("＞");
		String[] input = scn.nextLine().split(" ");
		
		String NUM = input[0] + input[1];
		
		int num = Integer.parseInt(NUM);
		
		boolean hei = false;
		
		for(int i = 0; i < num; i++) {
			if(i * i == num) {
				hei = true;
			}
		}
		
		if(hei) {
			System.out.println("Yes");
		}
		
		if(!hei) {
			System.out.println("No");
		}
		
		scn.close();
	}

}
