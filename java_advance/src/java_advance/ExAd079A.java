package java_advance;

import java.util.Scanner;

public class ExAd079A {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("＞");
		
		int intN = scn.nextInt();
		
		if(1000 > intN || intN > 9999) {
			System.out.println("入力値の範囲が適切ではありません。");
			scn.close();
			return;
		}
		
		String strN = String.valueOf(intN);
		String[] ArrstrN = strN.split("");
		
		if((ArrstrN[0].equals(ArrstrN[1]) && ArrstrN[1].equals(ArrstrN[2]))
			||
		   (ArrstrN[1].equals(ArrstrN[2]) && ArrstrN[2].equals(ArrstrN[3]))
		   ){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		scn.close();
	}

}
