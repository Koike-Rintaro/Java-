package Ex0117;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex0117 {

	public static void main(String[] args) {
		
		int e_score = 0;
		int m_score = 0;

		
		try (Scanner scnE = new Scanner(System.in);
				Scanner scnM = new Scanner(System.in);	
			) {
			
			try {
				System.out.println("input english score：");
				e_score = scnE.nextInt();
				System.out.println("input math score：");
				m_score = scnM.nextInt();
				
			}catch(InputMismatchException e){
				System.out.println("入力値が数値ではありません");
				return;
			}
			
			if(e_score >= 80 && m_score >= 80) {
				System.out.println("\r\n進級");
			}else if(e_score < 80 && m_score < 80) {
				System.out.println("\r\n留年");
			}else  {
				System.out.println("\r\n再試験");
			}
		}	

	}

}
