package Ex0360;


	import java.util.Scanner;

	
	public class Ex0360 {
	    static final int EMPTY = 0;
	    static final int BLACK = 1;
	    static final int WHITE = 2;
	    static int[][] board = new int[8][8];
	    static int turn = BLACK; // 黒からスタート

	    // 8方向のベクトル (上、下、左、右、右上、右下、左上、左下)
	    static final int[] DX = {-1, 1, 0, 0, -1, 1, -1, 1};
	    static final int[] DY = {0, 0, -1, 1, 1, 1, -1, -1};
	    
	    static int blackCount;
	    static int whiteCount;

	    public static void main(String[] args) {
	        initBoard();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            printBoard();
	            
	            // パス後終了判定
	            if (!hasValidMove(turn)) {
	                System.out.println((turn == BLACK ? "黒" : "白") + "は置ける場所がないためパスします。");
	                turn = 3 - turn; // 手番交代
	                if (!hasValidMove(turn)) {
	                    System.out.println("両者置けなくなりました。ゲーム終了です。");
	                    break;
	                }
	                continue;
	            }
	            
	            
	            System.out.print((turn == BLACK ? "黒" : "白") + "の手(行、列) >  ");
	            String input = scanner.nextLine().trim();

	            if  (input.equalsIgnoreCase("9")){
	            	System.out.println((turn == BLACK ? "黒" : "白") + "はパスします。");
	            	turn = 3 - turn; // 手番交代
	            	continue;
	            }
	            

	            // 入力形式チェック (例: f5)
	            if (input.length() != 2) {
	                System.out.println("エラー: 2文字で入力してください (例: f5)");
	                continue;
	            }

	            int col = input.charAt(0) - '1';
	            int row = input.charAt(1) - '1';

	            if (row < 0 || row >= 8 || col < 0 || col >= 8) {
	                System.out.println("エラー: 盤面外の座標です。a〜h、1〜8の範囲で指定してください。");
	                continue;
	            }

	            // 石を置く処理
	            if (move(row, col, turn, true)) {
	                turn = 3 - turn; // 手番交代 (1->2, 2->1)
	            } else {
	                System.out.println("エラー: そこには置けません。相手の石を挟める場所を選んでください。");
	            }
	        }
	        
	        printResult();
	        scanner.close();
	    }

	    // 盤面の初期化
	    static void initBoard() {
	        board[3][3] = WHITE;
	        board[3][4] = BLACK;
	        board[4][3] = BLACK;
	        board[4][4] = WHITE;
	    }

	    // 盤面の描画
	    static void printBoard() {
	        System.out.println("\n 1 2 3 4 5 6 7 8");
	        for (int i = 0; i < 8; i++) {
	            System.out.print(i + 1);
	            for (int j = 0; j < 8; j++) {
	                if (board[i][j] == BLACK) System.out.print("○");
	                else if (board[i][j] == WHITE) System.out.print("●");
	                else System.out.print("□");
	            }
	            System.out.println();
	            
	        }
	        
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	                if (board[i][j] == BLACK) blackCount++;
	                if (board[i][j] == WHITE) whiteCount++;
	            }
	        }
	        System.out.println("○：" + blackCount + "\t●" + whiteCount);
	        
	        blackCount = 0;
	        whiteCount = 0;


	    }

	    // 石を置く、または置けるかどうかのチェックを行う関数
	    static boolean move(int row, int col, int color, boolean doFlip) {
	        if (board[row][col] != EMPTY) return false;

	        boolean playable = false;
	        int opponent = 3 - color;

	        // 8方向を探索
	        for (int i = 0; i < 8; i++) {
	            int r = row + DX[i];
	            int c = col + DY[i];
	            int count = 0;

	            // 相手の石が続く限り進む
	            while (r >= 0 && r < 8 && c >= 0 && c < 8 && board[r][c] == opponent) {
	                r += DX[i];
	                c += DY[i];
	                count++;
	            }

	            // 最後に自分の石があれば挟めている
	            if (count > 0 && r >= 0 && r < 8 && c >= 0 && c < 8 && board[r][c] == color) {
	                playable = true;
	                if (doFlip) {
	                    // 実際に裏返す処理
	                    if (board[row][col] == EMPTY) {
	                        board[row][col] = color;
	                    }
	                    int flipR = row + DX[i];
	                    int flipC = col + DY[i];
	                    while (flipR != r || flipC != c) {
	                        board[flipR][flipC] = color;
	                        flipR += DX[i];
	                        flipC += DY[i];
	                    }
	                }
	            }
	        }
	        return playable;
	    }

	    // パス判定用：置ける場所が1つでもあるかチェック
	    static boolean hasValidMove(int color) {
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	                if (move(i, j, color, false)) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }

	    // 結果の集計と表示
	    static void printResult() {
	        int blackCount = 0;
	        int whiteCount = 0;
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	                if (board[i][j] == BLACK) blackCount++;
	                if (board[i][j] == WHITE) whiteCount++;
	            }
	        }
	        System.out.println("\n【試合結果】");
	        System.out.println("黒(〇): " + blackCount + "個");
	        System.out.println("白(●): " + whiteCount + "個");
	        if (blackCount > whiteCount) System.out.println("黒の勝ちです！");
	        else if (whiteCount > blackCount) System.out.println("白の勝ちです！");
	        else System.out.println("引き分けです！");
	    }
	}
	


