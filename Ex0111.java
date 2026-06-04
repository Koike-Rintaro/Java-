package Ex0111;

import java.util.Scanner;

public class Ex0111 {

    public static void main(String[] args) {

        System.out.println("文字列を入力してください");

        try (Scanner scn = new Scanner(System.in)) {

            String str = scn.next();

            char[] array = str.toCharArray();

            char[] ngChars = {'①', '③', '⑤', '⑦', '⑨'};

            boolean hasNgChar = false;

            // 入力文字列を1文字ずつ確認
            for (int i = 0; i < array.length; i++) {

                // 禁止文字一覧を確認
                for (int j = 0; j < ngChars.length; j++) {

                    if (array[i] == ngChars[j]) {

                        hasNgChar = true;

                        System.out.println(
                            "許可しない文字(文字：" +
                            array[i] +
                            " " +
                            (i + 1) +
                            "桁目)が含まれます"
                        );

                        break;
                    }
                }
            }

            // 禁止文字が1つもなかった場合のみ表示
            if (!hasNgChar) {
                System.out.println("許可する文字列です。");
            }
        }
    }
}





/*自分で作ったやつ
 * public static void main(String[] args) {

		System.out.println("文字列を入力してください");
		
		try (Scanner scn = new Scanner(System.in)) {
			String str = scn.next();
			
			char[] array = str.toCharArray();
			
			char[] strArray  = {'①', '③', '⑤', '⑦', '⑨'};
			
			//この中でarray、文字列をひとつずつ回す
			for(int i = 0; i < array.length; i++) {
				
				//この中でstrArrayを回す
				for(int j = 0; j < strArray.length; j++) {
					if(array[i] == strArray[j]) {
						char XX = strArray[j];
						int YY = i + 1;
						System.out.println ("許可しない文字(文字：" + XX + " " + YY + "桁目)が含まれます");
						return;	
					}
				}				
			}
			System.out.println("許可する文字列です。");
		}
	}
 */





/*試しに作って躓いたやつ
*	String msg = null ;
			
			String[] msgArray = null;
			
			//この中でarray、文字列をひとつずつ回す
			for(int i = 0; i < array.length; i++) {
				msgArray = new String[i] ;
				
				//この中でstrArrayを回す
				for(int j = 0; j < strArray.length; j++) {
					if(array[i] != strArray[j]) {
						msg = "許可する文字列です。";
						
					}else if(array[i] == strArray[j]) {
						char XX = strArray[j];
						int YY = i + 1;
						msgArray[i] = ("許可しない文字(文字：" + XX + " " + YY + "桁目)が含まれます");
						return;
					}
				}				
			}
			for (String result : msgArray) {
				System.out.println(result);				
			}
*/