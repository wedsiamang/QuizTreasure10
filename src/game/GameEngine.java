//package game;
//
//public class GameEngine {
//	
//	/*タイトル
//	 * 
//	 */
//	private String title ="+++CodeBreaker+++";
//	private String rule = "隠された３つの数字を当てます。\n"
//			+"１つの数字は１から６の間です。\n"
//			+"３つの答えの中に同じ数字はありません。\n"
//			+"入力した数字の、位置と数字があっていたらヒット\n"
//			+"数字だけあっていたらブローとカウントします。\n"
//			+"全部当てたら終了です\n\n";
//	
//	private int[] answer = new int [3];//答えが入る
//	private int[] input =new int[3]; //入力した数字が入る
//	
//	private int numberOfAnswers = 3;
//	
//	private int widthOfRandom = 6;
//	
//	private int hit = 0;
//	
//	private int blow = 0;
//	
//	public GameEngine() {
//		answer = new int[numberOfAnswers];
//		input = new int[numberOfAnswers];
//		makeAnswers();
//	}
//	
//	public GameEngine(int numberOfAnswers) {
//		this.numberOfAnswers = numberOfAnswers;
//		answer = new int[numberOfAnswers];
//		input = new int [numberOfAnswers];
//		makeAnswers();
//	}
//	
////	public void makeAnswers() {
//	if(answer.length!= numberOfAnswers) {
//		answer=new int[numberOfAnswers];
//		input = new int[numberOfAnswers];
//	}
//	for(int i= 0; i< answer.length;i++) {
//		boolean flag=false;
//		answer[i]=(int)(Math.random() * widthOfRandom + 1);
//		do {
//			flag=false;
//			for(int j = i - 1; j >= 0; j--) {
//				if(answer[i] == answer[j]) {
//					flag=true;
//					answer[i]=(int)(Math.random()*widthOfRandom + 1);
//				}
//			}
//		}while(flag ==true);
//	}
//}
//public void inputAnswer(int index, int answer)throws InputException{
//
//	if(index > -1 && index < numberOfAnswers) {
//		if(answer > 0 && answer <= widthOfRandom) {
//			input[index]= answer;
//		}else {
//			throw new InputException("入力が答えの範囲外です");
//		}
//	}else {
//		throw new InputException("入力する場所が間違っています");
//	}
//}
//public void inputAnswer(int index, String string ) 
//	throws InputException{
//		int answer;
//		try {
//			answer=Integer.parseInt(string);
//		}catch(NumberFormatException e) {
//			throw new InputException("入力の答えが範囲外です");
//		}
//		inputAnswer(index,answer);
//	}
//
//	public boolean judge() {
//		hit = 0;
//		blow= 0;
//		for(int i = 0; i < answer.length; i++) {
//			for(int j = 0; j<answer.length; j++) {
//			if(i == j && input[i] == answer[j]) {
//				hit++;
//			}else if(input[i] == answer[j]) {
//				blow++;
//			}
//			}
//			}
//		return (hit == numberOfAnswers);
//	}
//	
//	public int getNumberOfAnswers() {
//		return numberOfAnswers;
//	}
//	public int getWidthOfRandom() {
//		return widthOfRandom;
//	}
//	public int[]getAnswer(){
//		return answer;
//	}
//	public int getBlow() {
//		return blow;
//	}
//	public int getHit() {
//		return hit;
//		
//	}
//	public int[]getInput(){
//		return input;
//	}
//	public void setInput(int[] input)throws InputException{
//	for(int i = 0; i <input.length; i++) {
//		inputAnswer(i,input[i]);
//	}
//	
//	}
//	public String getRule() {
//		return  rule;
//		
//	}
//	public void setRule(String rule) {
//		this.rule = rule;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title=title;
//	}
//	}
