//package game;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//	
//public class CodeBreakerFirst{
//	
//	
//	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//		
//		String title ="+++CodeBreaker+++";
//		String rule = "隠された３つの数字を当てます。\n"
//				+"１つの数字は１から６の間です。\n"
//				+"３つの答えの中に同じ数字はありません。\n"
//				+"入力した数字の、位置と数字があっていたらヒット\n"
//				+"数字だけあっていたらブローとカウントします。\n"
//				+"全部当てたら終了です\n\n";
//		
//		int[] answer = new int [3];//答えが入る
//		int[] input =new int[3]; //入力した数字が入る
//				/*
//				 * hitはhitのカウント用、blowもblowのカウント用。
//				 * countは何回目のチャレンジかを数えている。
//				 */
//				
//				int hit = 0, blow = 0, count = 0;
//		
//		//タイトルとルールの表示
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println(title);
//		System.out.println(rule);
//
//		
//		//ランダムな答えを作成。
//		//ただし、仕様通り、同じ数字が無いようにする。
//		for(int i = 0; i < answer.length; i++) {
//			//answer.length=この場合は３桁だから３回
//			//自分より前の要素にかぶるやつがないようにする
//			//あればもう1回random
//			boolean flag = false;
//			answer[i]=(int)(Math.random()*6+1);
//			do {
//				flag = false;
//				for(int j = i-1; j >=0; j--) {
//					if(answer[i] == answer[j]) {
//						flag = true;
//						answer[i] =(int)(Math.random()*6+1);
//					}
//				}
//			}while(flag == true);
//		}
//		while(true) {
//			count++;
//				System.out.println("**"+count+"回目 ***");
//			//インプット
//				for(int i = 0; i < answer.length; i++) {
//					System.out.println((i+1)+"個目：");
//					try {
//						input[i]= Integer.parseInt(br.readLine());
//					}catch(NumberFormatException e) {
//						System.out.println("数値を入力してください");
//						i--;
//					}catch(IOException e) {
//						System.out.println("もう一度入力してください");
//						i--;
//					}
//				}
//				//答えを判断
//				hit = 0;
//				blow=0;
//				for(int i= 0; i<answer.length; i++) {
//					for(int j = 0; j<answer.length;j++) {
//						if(i ==j && input[i]==answer[j]) {
//							blow++;
//						}
//					}
//				}
//			//終了判断　ヒットが３つになったら終了
//				System.out.println("ヒット"+ hit + "ブロー"+ blow);
//				if(hit == 3) {
//					System.out.println("おめでとう");
//					break;
//				}else {
//					System.out.println();
//				}
//		}
//	}
//}
