package Ex0370;

import java.util.Scanner;

public class Ex0370 {

	public static void main(String[] args) {
			
		try(Scanner scn = new Scanner(System.in)){
			
			
			boolean isCollect = false;
			
			int kaisuu = 1;
			
			
			
			
			while(!isCollect) {
				
				
				
				System.out.print("(" + kaisuu + "回目)" +"予測数字を入力してください：");
				
				String num = scn.next();
				
				//999ギブアップ判定
				if(num.equals("999")) {
					System.out.println("正解は" + args[0] + "でした。");
					break;
				}
				
				
				if(!(num.length() == 4)) {
					System.out.println("入力値が4桁ではありません。" + "\r\n");
					continue;
				}
				
				
				
				String[] NUM = num.split("");
				
				String[] col = args[0].split("");
				
				
				
				
				int hit = 0;
				int brow = 0;
				
				//ヒットアンドブロー判定
				for(int i = 0; i < 4; i++) {
					
					//ヒット判定
					if(NUM[i].equals(col[i])) {
						hit++;
					}
					
					//ブロー判定
					for(int j = 0; j < 4; j++) {
						if(i != j && NUM[i].equals(col[j])) {
							brow++;
						}
					}
				}
				
				System.out.print("ヒット：" + hit);
				System.out.println("ブロー：" + brow);
				System.out.println("\r\n");
				
				kaisuu ++;
				
				
				//入力値と正解が同じだったらループを抜ける
				if(num.equals(args[0])) {
					isCollect = true;
				}
				
				continue;
			}
			
			scn.close();
			
			
			//ループを抜けた後、正解と表示する
			if(isCollect) {
				System.out.println("正解！！！！！！！");
			}
			
			
		}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("入力値が有効ではありません");
		}
	}
}