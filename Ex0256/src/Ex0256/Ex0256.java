package Ex0256;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Ex0256 {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("input date：");
			
			String date = scn.nextLine();
			
			DateTimeFormatter result = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			
			try {
				LocalDate.parse(date, result);
				
				System.out.println("指定した形式です");
				
			} catch (DateTimeParseException e) {
				System.err.println("指定した形式ではありません");
			}
			
		}

	}

}
/*
if(date.equals(result)) {
	System.out.println("指定した形式です");
}else {
	System.err.println("指定した形式ではありません");
}
*/