package Ex0245;

import java.util.Scanner;

public class Ex0245 {

	public static void main(String[] args) {
		try (Scanner scn1 = new Scanner(System.in);
			 Scanner scn2 = new Scanner(System.in);	
			) {
			
			System.out.println("input number1：");
			int num1 = scn1.nextInt();

			System.out.println("input number2：");
			int num2 = scn2.nextInt();

			 while (num2 != 0) {
	                int temp = num2;
	                num2 = num1 % num2;
	                num1 = temp;
	            }

	            System.out.println("最大公約数：" + num1);
			
			
			
		}

	}

}



/*
*int result = 0;
			
			
			if(num1 < num2 ) {
				for(int i = 1; num2 != 0; i++) {
					result = num2;
					num1 = num2 % num1;
					num2 = result;
				}
			}else if(num1 > num2){
				for(int i = 1; num1 != 0; i++) {
					result = num1;
					num2 = num1 % num2;
					num1 = result;
				}				
			}else {
				result = num1;
			}
			System.out.println(result);
*/