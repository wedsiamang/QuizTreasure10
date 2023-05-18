//package game;
//
//import model.Game;
//
//public class CodeBreaker {
//
//	// プレイヤーの入力値
//			int answerLength = 3;
//			// 入力値チェックOK時の目印
//			String VAL_CHECK_OK = "OK";
//			int blow = 0;
//			int hit = 0;
//			int count = 0;
//			// int
//			// id = Integer.parseInt(request.getParameter("id"));
//
//			// ランダム変数の生成
////			Random r = new Random();
////			int[] numsA = { 1, 2, 3, 4, 5, 6 };
////			int numA = numsA[r.nextInt(6)];
////			int[] numsB = { 1, 2, 3, 4, 5, 6 };
////			int numB = numsB[r.nextInt(6)];
////			int[] numsC = { 1, 2, 3, 4, 5, 6 };
////			int numC = numsC[r.nextInt(6)];
//	//
////			int[] numAns = { numA, numB, numC };
////			System.out.println("numans:" + numAns);
//			int numberOfAnswers = 3;
//
//			int widthOfRandom = 6;
//
//			int[] answer = new int[numberOfAnswers];
//			int[] inpu = new int[numberOfAnswers];
//			// makeAnswers();
//
//			for(int i= 0; i< answer.length;i++) {
//				boolean flag=false;
//				answer[i]=(int)(Math.random() * widthOfRandom + 1);
//				do {
//					flag=false;
//					for(int j = i - 1; j >= 0; j--) {
//						if(answer[i] == answer[j]) {
//							flag=true;
//							answer[i]=(int)(Math.random()*widthOfRandom + 1);
//						}
//					}
//				}while(flag ==true);
//			}
//
//			int one = Integer.parseInt(request.getParameter("one"));
//			int two = Integer.parseInt(request.getParameter("two"));
//			int three = Integer.parseInt(request.getParameter("three"));
//			int[] input = { one, two, three }; // 入力した数字が入る
//			do {
//				// 正解の桁数
//
//				// 入力値をプロパティに設定
//				Game game = new Game();
//				game.setOne(one);
//				game.setTwo(two);
//				game.setThree(three);
//				
//				int numA=answer[0];
//				int numB=answer[1];
//				int numC=answer[2];
//				
//
//			//	for(int ans : answer) {
////					if (answer[0] == one) {
////						hit++;
////						blow++;
////					} else if (answer[1] == two) {
////						hit++;
////						blow++;
////					} else if (answer[2] == three) {
////						hit++;
////						blow++;
////					} else if (answer[1] == one) {
////						blow++;
////					} else if (answer[2] == one) {
////						blow++;
////					} else if (answer[0] == two) {
////						blow++;
////					} else if (answer[2] == two) {
////						blow++;
////					} else if (answer[0] == three) {
////						blow++;
////					} else if (answer[1] == three) {
////						blow++;
////					}
////					count++;
//			//	}
//				// コンピュータの答えと入力値の一致を判定
//				System.out.println("ans:" + answer[0] + answer[1] + answer[2]);
//				System.out.println("inp:" + input[0] + input[1] + input[2]);
//
//				// コンピュータと入力値の完全一致
//				if (numA == one) {
//					hit++;
//					blow++;
//				} if (numB == two) {
//					hit++;
//					blow++;
//				} if (numC == three) {
//					hit++;
//					blow++;
//				} if (numB == one) {
//					blow++;
//				} if (numC == one) {
//					blow++;
//				} if (numA == two) {
//					blow++;
//				} if (numC == two) {
//					blow++;
//				} if (numA == three) {
//					blow++;
//				} if (numB == three) {
//					blow++;
//				}
//				count++;
//				
//	
//}
