<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List,model.Quiz"%>

<%
List<Quiz> quizList = (List<Quiz>) request.getAttribute("quizList");
String ans1 = (String) request.getAttribute("ans1");
String ans2 = (String) request.getAttribute("ans2");
String ans3 = (String) request.getAttribute("ans3");
String ans4 = (String) request.getAttribute("ans4");
String maskMap = (String) request.getAttribute("maskMap");
String starLink = (String) request.getAttribute("starLink");
String snowden = (String) request.getAttribute("snowden");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/maskmap.css">
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=yes">
<title>Quiz-chatt from News opening</title>
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp" />

	<%
	if (maskMap != null) {
	%>

	<%
	for (Quiz q : quizList) {
	%>
	<div class="line-bc">
		<h1><%=q.getTitle()%></h1>
		<%
		System.out.println("openingjsp"+q.getTitle());
		%>


		<div class="balloon6">
			<div class="faceicon">
				<img src="Robot.png">
			</div>
			<div class="chatting">
				<div class="says">
					<p>
						<a
							href="https://www.newsweekjapan.jp/stories/technology/2020/07/it3.php"><%=q.getOpening()%></a>
					</p>
				</div>
			</div>
		</div>

		<script>
			window.onload = function() {
				document.getElementById("yes").onclick = yeshandler;
			}
			function yeshandler(e) {
				document.getElementById("status").innerHTML = '<a href="https://static.honichi.com/uploads/editor_upload_image/image/5947/main_cbcc05968fe2a87c12703528bb8efeb6.png?auto=format">こんな地図アプリだよ</a>'
			}
		</script>

		<%
		}
		%>

	</div>
	<div class="box" style="background-color: background-color:#87ceeb;">
		<form action="/TalkOpeningServlet?maskMap=maskMap" method="post">
			<p>
				<select name="ans" class="form-control">
					<option value="">選択して</option>
					<option value="中国語を話す小さな島国">中国語を話す小さな島国</option>
					<option value="BTSの住んでいるおとなりの国">BTSの住んでいるおとなりの国</option>
					<option value="アフリカにあるピラミッドで有名な国">アフリカにあるピラミッドで有名な国</option>
			
				</select> <input type="submit">
			</p>
		</form>
	</div>
	<%
	}
	%>

	<%
	if (snowden != null) {
	%>

	<%
	for (Quiz q : quizList) {
	%>
	<div class="line-bc">
		<h1><%=q.getTitle()%></h1>
		<%
		System.out.println(q.getTitle());
		%>


		<div class="balloon6">
			<div class="faceicon">
				<img src="Robot.png">
			</div>
			<div class="chatting">
				<div class="says">
					<p>
						<a
							href="https://ja.wikipedia.org/wiki/%E4%B8%AD%E5%A4%AE%E6%83%85%E5%A0%B1%E5%B1%80"><%=q.getOpening()%></a>
					</p>
				</div>
			</div>
		</div>

		<script>
			window.onload = function() {
				document.getElementById("yes").onclick = yeshandler;
			}
			function yeshandler(e) {
				document.getElementById("status").innerHTML = '<a href="https://static.honichi.com/uploads/editor_upload_image/image/5947/main_cbcc05968fe2a87c12703528bb8efeb6.png?auto=format">こんな地図アプリだよ</a>'
			}
		</script>

		<%
		}
		%>

	</div>
	<div class="box" style="background-color: background-color:#87ceeb;">
		<form action="/TalkOpeningServlet?snowden=snowden" method="post">
			<p>
				<select name="ans" class="form-control">
					<option value="">選択して</option>
					<option value="イタリアのスパイ組織">イタリアのスパイ組織</option>
					<option value="トルコのスパイ組織">トルコのスパイ組織</option>
					<option value="アメリカのスパイ組織">アメリカのスパイ組織</option>
			
				</select> <input type="submit">
			</p>
		</form>

	</div>
	<%
	}
	%>

	<%
	if (starLink != null) {
	%>

	<%
	for (Quiz q : quizList) {
	%>
	<div class="line-bc">
		<h1><%=q.getTitle()%></h1>



		<div class="balloon6">
			<div class="faceicon">
				<img src="Robot.png">
			</div>
			<div class="chatting">
				<div class="says">
					<p>
						<a
							href="https://www3.nhk.or.jp/news/html/20220606/k10013617031000.html"><%=q.getOpening()%></a>
						<a href="https://kids.gakken.co.jp/jiten/dictionary01300087/">辞書</a>
					</p>
				</div>
			</div>
		</div>

		<script>
			window.onload = function() {
				document.getElementById("yes").onclick = yeshandler;
			}
			function yeshandler(e) {
				document.getElementById("status").innerHTML = '<a href="https://static.honichi.com/uploads/editor_upload_image/image/5947/main_cbcc05968fe2a87c12703528bb8efeb6.png?auto=format">こんな地図アプリだよ</a>'
			}
		</script>

		<%
		}
		%>

	</div>
	<div class="box" style="background-color: background-color:#87ceeb;">
		<form action="/TalkOpeningServlet?starLink=starLink" method="post">
			<p>
				<select name="ans" class="form-control">
					<option value="">選択して</option>
						<option value="ムーミンのいる国">ムーミンのいる国</option>
					<option value="スフィンクスのある国">スフィンクスのある国</option>
					<option value="戦争している国">戦争している国</option>
				</select> <input type="submit">
			</p>
		</form>

	</div>
	<%
	}
	%>
</body>
</html>