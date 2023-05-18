<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List,model.Quiz,model.Viewer"%>

<%
List<Quiz> quizList = (List<Quiz>) request.getAttribute("quizList");
List<Viewer> viewerList = (List<Viewer>) request.getAttribute("viewerList");
String maskMap = (String) request.getAttribute("maskMap");
String starLink = (String) request.getAttribute("starLink");
String snowden = (String) request.getAttribute("snowden");
String res=(String)request.getAttribute("res");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/maskmap.css">
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=yes">
<title>Quiz-chatt from News intro</title>
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp" />
	<div class="line-bc">
		<%
		if (maskMap != null) {
		%>

		<%
		for (Quiz q : quizList) {
		%>

		<h1><%=q.getTitle()%></h1>
		<%
		System.out.println("introjsp" + q.getTitle());
		%>


		<div class="balloon6">
			<div class="faceicon">
				<img src="Robot.png">
			</div>
			<div class="chatting">
				<div class="says">
					<p><%=q.getOpening()%>
						<a
							href="https://www.newsweekjapan.jp/stories/technology/2020/07/it3.php">#マスクマップ</a>
					</p>
				</div>
			</div>
		</div>


		<div class="mycomment">
			<%
			for (Viewer v : viewerList) {
			%>
			<p>
				<%=v.getAns1()%>
			</p>
			<%
			}
			%>

		</div>
		<div class="balloon6">
			<div class="faceicon">
				<img src="Robot.png">
			</div>
			<div class="chatting">
				<div class="says">
					<p>
						<%=q.getIntro()%><a href="">#台湾</a><a href=""> #IT大臣</a><a href="">
							#ハッカー</a>
					</p>
				</div>
			</div>
		</div>

		<div class="mycomment">
			<%
			for (Viewer v : viewerList) {
			%>
			<p>
				<%=v.getAns2()%>
			</p>
			<%
			}
			%>
		</div>

		<div class="balloon6">
			<div class="faceicon">
				<img src="Robot.png">
			</div>
			<div class="chatting">
				<div class="says">
					<p><%=q.getMain1()%>
						<a href="">#</a>
					</p>
				</div>
			</div>
		</div>
		<div class="mycomment">
			<%
			for (Viewer v : viewerList) {
			%>
			<p>
				<%=v.getAns3()%>
			</p>
			<%
			}
			%>
		</div>
		<div class="balloon6">
			<div class="faceicon">
				<img src="Robot.png">
			</div>
			<div class="chatting">
				<div class="says">
					<p><%=res%><%=q.getMain2()%>
						<a href="">#</a>
					</p>
				</div>
			</div>
		</div>



		<div class="mycomment">
			<form action="/TalkMain2Servlet?maskMap=maskMap"
				method="post">
				<p>
					<select name="ans" class="form-control">
						<option value="">選択して</option>
						<option value="お店が持っている売り物の数のこと">お店が持っている売り物の数のこと</option>
						<option value="お客さんが欲しい品物の数のこと">お客さんが欲しい品物の数のこと</option>
					</select> <input type="submit">
				</p>
			</form>

		</div>
		<%
		}
		%>
		<%
		}
		%>
	</div>




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
							href="https://www.newsweekjapan.jp/stories/technology/2020/07/it3.php"><%=q.getOpening()%></a>
					</p>
				</div>
			</div>
		</div>

		<div class="mycomment">

			<%
			for (Viewer v : viewerList) {
			%>
			<p>
				<%=v.getAns1()%>
			</p>
			<%
			}
			%>


		</div>
		<div class="balloon6">
			<div class="faceicon">
				<img src="Robot.png">
			</div>
			<div class="chatting">
				<div class="says">
					<p>
						<a href=""><%=q.getIntro()%></a>
					</p>
				</div>
			</div>
		</div>

		<div class="mycomment">
			<%
			for (Viewer v : viewerList) {
			%>
			<p>
				<%=v.getAns2()%>
			</p>
			<%
			}
			%>
		</div>


		<div class="balloon6">
			<div class="faceicon">
				<img src="Robot.png">
			</div>
			<div class="chatting">
				<div class="says">
					<p><%=q.getMain1()%>
						<a href="">#</a>
					</p>
				</div>
			</div>
		</div>
		<div class="mycomment">
			<%
			for (Viewer v : viewerList) {
			%>
			<p>
				<%=v.getAns3()%>
			</p>
			<%
			}
			%>
		</div>
		<div class="balloon6">
			<div class="faceicon">
				<img src="Robot.png">
			</div>
			<div class="chatting">
				<div class="says">
					<p><%=res%><%=q.getMain2()%>
						<a href="">#</a>
					</p>
				</div>
			</div>
		</div>



		<div class="mycomment">
			<form action="/TalkMain2Servlet?snowden=snowden"
				method="post">
				<p>
					<select name="ans" class="form-control">
						<option value="">選択して</option>
						<option value="新聞やテレビやSNSで調べた事を自分で考えて記事にして投稿する人">新聞やテレビやSNSで調べた事を自分で考えて記事にして投稿する人</option>
						<option value="知らない">知らない</option>
					</select> <input type="submit">
				</p>
			</form>

		</div>
	</div>
	<%
	}
	%>
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
							href="https://www.newsweekjapan.jp/stories/technology/2020/07/it3.php"><%=q.getOpening()%></a>
					</p>
				</div>
			</div>
		</div>

		<div class="mycomment">

			<%
			for (Viewer v : viewerList) {
			%>
			<p>
				<%=v.getAns1()%>
			</p>
			<%
			}
			%>


		</div>
		<div class="balloon6">
			<div class="faceicon">
				<img src="Robot.png">
			</div>
			<div class="chatting">
				<div class="says">
					<p>
						<a href=""><%=q.getIntro()%></a>
					</p>
				</div>
			</div>
		</div>
		<div class="mycomment">
			<%
			for (Viewer v : viewerList) {
			%>
			<p>
				<%=v.getAns2()%>
			</p>
			<%
			}
			%>
		</div>

		<div class="balloon6">
			<div class="faceicon">
				<img src="Robot.png">
			</div>
			<div class="chatting">
				<div class="says">
					<p><%=q.getMain1()%>
						<a href="">#</a>
					</p>
				</div>
			</div>
		</div>
		<div class="mycomment">
			<%
			for (Viewer v : viewerList) {
			%>
			<p>
				<%=v.getAns3()%>
			</p>
			<%
			}
			%>
		</div>
		<div class="balloon6">
			<div class="faceicon">
				<img src="Robot.png">
			</div>
			<div class="chatting">
				<div class="says">
					<p><%=res%><%=q.getMain2()%>
						<a href="">#</a>
					</p>
				</div>
			</div>
		</div>



		<div class="mycomment">
			<form action="/TalkMain2Servlet?starLink=starLink"
				method="post">
				<p>
					<select name="ans" class="form-control">
						<option value="">選択して</option>
						<option value="宇宙のアンテナでインターネットができる">宇宙のアンテナでインターネットができる</option>
						<option value="海底でつながっている電線ケーブル">海底でつながっている電線ケーブル</option>
						<option value="宇宙人との交信のこと">宇宙人との交信のこと</option>
					</select> <input type="submit">
				</p>
			</form>

		</div>

		<%
		}
		%>
		<%
		}
		%>
	</div>
</body>
</html>