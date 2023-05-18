package model;

import java.io.Serializable;

public class Quiz implements Serializable {
	
	private int id;
	private String title;
	private String opening;
	private String intro;
	private String main1;
	private String main2;
	private String main3;
	private String main4;
	private String main5;
	private String quiz;
	private String answer;
	private String treasure;
	


public Quiz() {}
	
public Quiz(int id,String title,String opening,String intro,String main1,String main2,String main3,String main4,String main5,String quiz,String answer,String treasure) {

	
	this.id=id;
	this.title=title;
	this.opening=opening;
	this.intro=intro;
	this.main1=main1;
	this.main2=main2;
	this.main3=main3;	
	this.main4=main4;
	this.main5=main5;
	this.quiz=quiz;
	this.answer=answer;
	this.treasure=treasure;

	
}

public int getId() {return id;}
public String getTitle() {return title;}
public String getOpening() {return  opening;}
public String getIntro() {return  intro;}
public String getMain1() {return  main1;}
public String getMain2() {return  main2;}
public String getMain3() {return  main3;}
public String getMain4() {return  main4;}
public String getMain5() {return  main5;}
public String getQuiz() {return  quiz;}
public String getAnswer() {return  answer;}
public String getTreasure() {return  treasure;}




}