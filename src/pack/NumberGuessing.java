//package pack;
//
//public class NumberGuessing {
//
//	// コンピュータの正解
//	private String randomAnswer = "";
//	// 正解の桁数
//	private final int ANSWER_LENGTH = 3;
//	
//	private int[] input = { }; // 入力した数字が入る
//	// 入力数カウンタ
//	private int inputCounter;
//	// 入力値チェックOK時の目印
//	public static final String VAL_CHECK_OK = "OK";
//
//	// インスタンス生成時に、当てる数を決定しanswerフィールドに格納
//	public  NumberGuessing() {
//		for (int i = 0; i < this.ANSWER_LENGTH; i++) {
//			this.randomAnswer += new java.util.Random().nextInt(9) + 1;
//		}
//	}
//
//	public void input(int first, int second, int third) {
//
//		int[] input = { first, second, third }; // 入力した数字が入る
//	}
//
//	public boolean judge() {
//		int blow = 0;
//		int hit = 0;
//		int count = 0;
//		
//			for (int i = 0; i < this.ANSWER_LENGTH; i++) {
//				int ans = this.randomAnswer.charAt(i);
//				for (int j = 0; j < input.length; j++) {
//					int value = input[i];
//					// コンピュータと入力値の完全一致
//					if (ans == value) {
//						hit++;
//						// 値が一致しているので部分正解を＋１とする
//					
//				}
//			}
//		return true;
//	}
//	}
//}
//
//
//
//
