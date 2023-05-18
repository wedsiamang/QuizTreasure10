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
					<p><%=q.getMain2()%>
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
				<%=v.getAns4()%>
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
					<p><%=q.getMain3()%>
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
				<%=v.getAns5()%>
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
					<p><%=res%><%=q.getMain4()%>
						<a href="">#</a>
					</p>
				</div>
			</div>
		</div>


		<div class="mycomment">
			<form action="/TalkMain4Servlet?maskMap=maskMap"
				method="post">
				<p>
					<select name="ans" class="form-control">
						<option value="">選択して</option>
						<option value="すごい">すごい</option>
						<option value="気にならない">気にならない</option>
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
					<p><%=q.getMain2()%>
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
				<%=v.getAns4()%>
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
					<p><%=q.getMain3()%>
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
				<%=v.getAns5()%>
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
					<p><%=res%><%=q.getMain4()%>
						<a href="">#</a>
					</p>
				</div>
			</div>
		</div>


		<div class="mycomment">
			<form action="/TalkMain4Servlet?snowden=snowden"
				method="post">
				<p>
					<select name="ans" class="form-control">
						<option value="">選択して</option>
						<option value="政治的な理由から他の国に隠れていること">政治的な理由から他の国に隠れていること</option>
						<option value="気にならない">気にならない</option>
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
					<p><%=q.getMain2()%>
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
				<%=v.getAns4()%>
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
					<p><%=q.getMain3()%>
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
				<%=v.getAns5()%>
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
					<p><%=res%><%=q.getMain4()%>
						<a href="">#</a>
					</p>
				</div>
			</div>
		</div>



		<div class="mycomment">
			<form action="/TalkMain4Servlet?starLink=starLink"
				method="post">
				<p>
					<select name="ans" class="form-control">
						<option value="">選択して</option>
						<option value="GPSを使ってねらった場所に正確にミサイルを落とす">GPSを使ってねらった場所に正確にミサイルを落とす</option>
						<option value="ドローンを遠くまで操縦する">ドローンを遠くまで操縦する</option>
						
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