package java_advance;

import java.util.Scanner;

public class ExAd071B {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("＞");
		
		String S = scn.nextLine();
		//入力文字列の配列
		String[] ArrS = S.split("");
		
		//文字列の長さ判定
		if(1 > S.length() || S.length() > 100000) {
			System.out.println("入力文字列の長さが範囲外です。");
			scn.close();
			return;
		}
		
		//アルファベット順配列
		String[] alphabet = new String[26];
		for(int i = 0; i < 26; i++) {
		    alphabet[i] = String.valueOf((char)('a' + i));
		}
		
		String ans = "None";
		
		for(int i = 0; i <= alphabet.length - 1; i++) {
			
			//iが増えても毎回falseにする。→入力文字列はひとつづつずれていく。
			boolean isFound = false;
			
			//入力文字列がアルファベット配列にあったら、trueで外ループへ。
			for(int j = 0; j <= ArrS.length - 1; j++) {
				if(alphabet[i].equals(ArrS[j])) {
					isFound = true;
					break;
				}
			}
			
			//入力文字列がアルファベット配列になかったらfalseのままこれが開始。ansにないアルファベットを代入して外ループ終了。
			if(!isFound) {
				ans = alphabet[i];
				break;
			}
			
		}
		
		System.out.println(ans);
		
		scn.close();
	}

}
