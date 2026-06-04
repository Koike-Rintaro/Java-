package Ex0257;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex0257 {

	public static void main(String[] args) {
		try (Scanner scn1 = new Scanner(System.in);
			 Scanner scn2 = new Scanner(System.in);
			) {
			
			System.out.println("input date1：");
			String date1 = scn1.nextLine();
			
			System.out.println("input date2：");
			String date2 = scn1.nextLine();
			
			DateTimeFormatter result = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			

			
			try {
				LocalDate Adate = LocalDate.parse(date1, result);
				LocalDate Bdate = LocalDate.parse(date2, result);
				
				long diffDays = ChronoUnit.DAYS.between(Adate, Bdate);
				
				diffDays = Math.abs(diffDays);
				
				if(diffDays == 0) {
					System.out.println("日数の差は0日です");
				}else {
					long diffSeconds = diffDays * 24 * 60 * 60; 
					System.out.println("日数の差は" +diffDays + "日で" + diffSeconds + "秒です");
				}
			
				
			} catch (DateTimeParseException e) {
				System.err.println("指定した形式ではありません");
			}
		}
	}

}
