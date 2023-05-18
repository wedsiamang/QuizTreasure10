<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List,model.UserName"%>
<%
UserName n = (UserName) request.getAttribute("selectName");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=yes">
<link rel="stylesheet" href="css/maskmap.css">
</head>
<body>
	<jsp:include page="/WEB-INF/jsp/header.jsp" />
	<div class="line-bc">
		<div style="text-align: center;">
			<h1>Treasure10</h1>
			<br>
			<br> <img src="Robot.png" width="150px" height="200px"><br>

			<h6>
				<%=n.getName()%>くん、<%=n.getIntroduction()%><br>今回のお宝は全部で4つ。<br>
				メニューからコースを選んで謎を解こう。<br>クイズとゲームにそれぞれ正解すると宝の場所とロックコードが現れる。<br>クイズは最近の世界のニュース記事から出題するよ。<br>わからないことは文字のリンクをクリックして調べてみよう。<br>

				それでは検討を祈る！
			</h6>
			<br>
			<br> <a href="/MenuServlet"><h4>宝探しを始める</h4></a>

		</div>
	</div>
</body>
</html>
