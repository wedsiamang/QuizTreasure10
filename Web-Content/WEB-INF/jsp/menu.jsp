<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MENU</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=yes">
<link rel="stylesheet" href="css/maskmap.css">
<link rel="stylesheet" href="css/header.css">
</head>
<body>
<div class="line-bc">
<jsp:include page="/WEB-INF/jsp/header.jsp" />
<div style="text-align:center;">
<h1>Treasure 10</h1><br>
<h2>MENU</h2><br>
<img src="ship.png"width="200px"height="250px">
<br><br>
<p>最初のクイズは<br>ITに関する世界のニュース記事の３つのお話だよ。<br>読んでクイズに答えよう。</p>
<h4>
<a href="/TalkOpeningServlet?maskMap=maskMap">#コロナと戦うアプリ「マスク・マップ」</a><br>
<a href="/TalkOpeningServlet?starLink=starLink">#宇宙からウクライナへの贈り物</a><br>
<a href="/TalkOpeningServlet?snowden=snowden">#正義の天才ハッカー</a><br>
<a href="/GameRuleServlet">#ゲームする</a>

</h4></div></div>
</body>
</html>