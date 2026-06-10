package java_advance;

import java.util.Scanner;

public class ExAd079C {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("＞");
		
		String strN = scn.nextLine();
		String[] ArrstrN = strN.split("");
		
		if(ArrstrN.length != 4) {
			System.out.println("入力値が適切ではありません。");
		}
		
		int A = Integer.parseInt(ArrstrN[0]);
		int B = Integer.parseInt(ArrstrN[1]);
		int C = Integer.parseInt(ArrstrN[2]);
		int D = Integer.parseInt(ArrstrN[3]);
		
		
		if(A + B + C + D == 7) {
			System.out.println(A + "+" + B + "+" + C + "+" + D + "= 7");
		}else if(A - B + C + D == 7) {
			System.out.println(A + "-" + B + "+" + C + "+" + D + "= 7");
		}else if(A - B - C + D == 7) {
			System.out.println(A + "-" + B + "-" + C + "+" + D + "= 7");
		}else if(A - B - C - D == 7) {
			System.out.println(A + "-" + B + "-" + C + "-" + D + "= 7");
		}else if(A - B + C - D == 7) {
			System.out.println(A + "-" + B + "+" + C + "-" + D + "= 7");
		}else if(A + B - C - D == 7) {
			System.out.println(A + "+" + B + "-" + C + "-" + D + "= 7");
		}else if(A + B + C - D == 7) {
			System.out.println(A + "+" + B + "+" + C + "-" + D + "= 7");
		}else {
			System.out.println("Error");
		}
		
		scn.close();
	}

}
