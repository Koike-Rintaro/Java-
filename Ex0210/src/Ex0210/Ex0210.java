package Ex0210;

public class Ex0210 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				int kuku = i * j;
				String result = String.format("%02d", kuku);
				System.out.print(result + "\t");
			}
			System.out.println("\r\n");
		}
		
	}

}
