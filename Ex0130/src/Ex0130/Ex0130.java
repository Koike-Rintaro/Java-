package Ex0130;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0130 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		int max = 0;
		int mid = 0;
		double avg;
		
		try (Scanner NUM1 = new Scanner(System.in);
			 Scanner NUM2 = new Scanner(System.in);	
			 Scanner NUM3 = new Scanner(System.in);	

				) {
			
			try {
				System.out.println("input number1：");
				num1 = NUM1.nextInt();
				
				System.out.println("input number2：");
				num2 = NUM2.nextInt();
				
				System.out.println("input number3：");
				num3 = NUM3.nextInt();
				
			}catch(InputMismatchException e){
				System.out.println("入力値が数値ではありません");
				return;
			}
			
			//最大値の判定
				max = num1;
			if(num2 > max) {
				max = num2;
			}
			if(num3 > max) {
				max = num3;
			}
			
			//中央値の判定
				mid = num1;
			if( (num3 > num2 && num2 > mid) || (mid > num2 && num2 > num3) ) {
				mid = num2;
			}
			if( (num2 > num3 && num3 > num1) || (num1 > num3 && num3 > num2) ){
				mid = num3;
			}
			
			//平均値の計算
			avg = (num1 + num2 + num3) / 3.0;

			//小数点第3位を四捨五入
			DecimalFormat df = new DecimalFormat("#.##");
			
			System.out.println("最大値 = " + max + "\t" + "中央値 = " + mid + "\t" + "平均値 = " + df.format(avg));
		}
	}

}
