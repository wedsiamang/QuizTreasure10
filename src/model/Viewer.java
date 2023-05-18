package model;

import java.io.Serializable;

public class Viewer implements Serializable {
	
	private int id;
	private String title;
	private String ans1;
	private String ans2;
	private String ans3;
	private String ans4;
	private String ans5;
	private String ans6;
	private String ans7;
	private String ans8;
	private String ans9;
	private String name;



public Viewer() {}
public Viewer(String name) {}
	
public Viewer(int id,String title,String ans1,String ans2,String ans3,String ans4,String ans5,String ans6,String ans7,String ans8,String ans9,String name) {

	
	this.id=id;
	this.title=title;
	this.ans1=ans1;
	this.ans2=ans2;
	this.ans3=ans3;
	this.ans4=ans4;
	this.ans5=ans5;
	this.ans6=ans6;
	this.ans7=ans7;
	this.ans8=ans8;
	this.ans9=ans9;
	this.name=name;
	
}

public int getId() {return id;}
public String getTitle() {return title;}
public String getAns1() {return ans1;}
public String getAns2() {return ans2;}
public String getAns3() {return ans3;}
public String getAns4() {return ans4;}
public String getAns5() {return ans5;}
public String getAns6() {return ans6;}
public String getAns7() {return ans7;}
public String getAns8() {return ans8;}
public String getAns9() {return ans9;}
public String getName() {return name;}






}