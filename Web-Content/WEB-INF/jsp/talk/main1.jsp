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

			<div class="balloon6">
				<div class="faceicon">
					<img src="Robot.png">
				</div>
				<div class="chatting">
					<div class="says">
						<p><%=res%><%=q.getMain1()%>
							<a href="">#</a>
						</p>
					</div>
				</div>
			</div>
			<div class="mycomment">
				<form action="/TalkMain1Servlet?maskMap=maskMap"
					method="post">
					<p>
						<select name="ans" class="form-control">
							<option value="">選択して</option>
							<option value="ハリウッドスター">ハリウッドスター</option>
							<option value="天才ハッカー">天才ハッカー</option>
							<option value="大臣">大臣</option>
							<option value="画家">画家</option>
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




			<%
			if (snowden != null) {
			%>

			<%
			for (Quiz q : quizList) {
			%>

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


				<div class="balloon6">
					<div class="faceicon">
						<img src="Robot.png">
					</div>
					<div class="chatting">
						<div class="says">
							<p><%=res%><%=q.getMain1()%>
								<a href="">#</a>
							</p>
						</div>
					</div>
				</div>
				<div class="box" style="background-color: background-color:#87ceeb;">
					<form action="/TalkMain1Servlet?snowden=snowden"
						method="post">
						<p>
							<select name="ans" class="form-control">
								<option value="">選択して</option>
								<option value="自分や家庭の生活を、よその人から干渉を受けない権利">自分や家庭の生活を、よその人から干渉を受けない権利</option>
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
		</div>

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

				<div class="balloon6">
					<div class="faceicon">
						<img src="Robot.png">
					</div>
					<div class="chatting">
						<div class="says">
							<p><%=res%><%=q.getMain1()%>
								<a href="">#</a>
							</p>
						</div>
					</div>
				</div>




				<div class="box" style="background-color: background-color:#87ceeb;">
					<form action="/TalkMain1Servlet?starLink=starLink"
						method="post">
						<p>
							<select name="ans" class="form-control">
								<option value="">選択して</option>
								<option value="ロシアの大統領">ロシアの大統領</option>
								<option value="インターネットを仕事にしているIT社長">インターネットを仕事にしているIT社長</option>
								<option value="宇宙開発をしているIT社長">宇宙開発をしているIT社長</option>
								<option value="火星人">火星人</option>
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
		</div>
	</div>

</body>
</html>