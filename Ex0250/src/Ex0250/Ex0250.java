package Ex0250;

import java.util.Scanner;

public class Ex0250 {

	public static void main(String[] args) {
		try (Scanner scn1 = new Scanner(System.in);) {
				
				System.out.println("input number1：");
				
				int num = scn1.nextInt();
				
				int[] sosu = {1, 3, 5, 7, 9 ,11, 13, 17, 19 ,23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
				
				int left = 0;
				
				int right = sosu.length -1;
				
				boolean found = false;
				
				while(left <= right) {
					int mid = (left + right) / 2;
					
					if(sosu[mid] == num) {
						found = true;
						System.out.println("素数です");
						break;
					}else if(sosu[mid] < num){
						left = mid + 1;
					}else {
						right = mid - 1;
					}	
				}
				
				if(!found) {
					System.out.println("素数ではありません");
				}
		}


	}

}
