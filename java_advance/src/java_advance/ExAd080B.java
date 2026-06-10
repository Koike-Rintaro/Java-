package java_advance;

import java.util.Scanner;

public class ExAd080B {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("＞");
		int intN = scn.nextInt();
		
		String strN = String.valueOf(intN);
		
		String[] ArrstrN = strN.split("");
		
		if( 1 > intN || intN > 100000000) {
			System.out.println("入力値の範囲が適切ではありません。");
			scn.close();
			return;
		}
		
		String f = String.join("", ArrstrN);
		
		int intf = Integer.parseInt(f);
		
		if(intN % intf == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		scn.close();
	}

}
