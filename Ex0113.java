import java.util.Scanner;

public class Ex0113 {

	public static void main(String[] args) {
		
		try (Scanner scn = new Scanner(System.in)) {
		
			String str = scn.nextLine();
					
			if(isZenkakuNumber(str)){
				str = java.text.Normalizer.normalize(str, java.text.Normalizer.Form.NFKC);
				System.out.println("結果：" + str);
			}else {
				System.out.println("結果：" + str);
			}
		}
	}

	private static boolean isZenkakuNumber(String str) {
	
		return str.matches(".*[０-９].*");
	}
}
