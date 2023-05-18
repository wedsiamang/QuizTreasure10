<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List,model.Game"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Code Breaker</title>

<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/game.css">
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=yes">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<%
List<Game> gameList = (List<Game>) request.getAttribute("gameList");

%>
</head>
<body>
	<div class="line-bc">
		<jsp:include page="/WEB-INF/jsp/header.jsp" />
		<div class="mx-auto text-center" style="width: 90%;">
			<h2 class="text-center mb-3">+++CodeBreaker+++</h2>
			<table>
				<tr>
					<td><img src="pneko.png" width="80" height="120"></td>
					<td><h4>ルールの説明</h4> <br>
						<p>
							コンピュータが考えたABCの３つの数を当てるゲームだよ。<br> 数の中身は１～３の間。<br>
							入力した数と、答えの場所と数が一致していたらHIT。<br>
							場所は違うけどその数が答えの中にあればBLOWとカウントされるよ。<br>
							HITとBLOWをヒントに数を推理してみよう。全部当てたら次へ進める！<br>
						</p></td>
				</tr>
				<tr>
					<td></td>
					<td>例えば：下のように１２３と入力すると、、
				</tr>
			</table>
			<div class="list-group">
				<div class="list-group-item">
					<table class="table table-striped">
						<thead>
							<tr>
								<th scope="col">A</th>
								<th scope="col">B</th>
								<th scope="col">C</th>
								<th scope="col">HIT！<br>場所も数も正解!
								</th>
								<th scope="col">BLOW！<br>その数で正解！でも場所が違うよ
								</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td>2<!-- getThird() input--></td>
								<td>3<!-- getHit() keisansiki--></td>
								<td>1<!-- getBlow() keisansiki--></td>
								<td>2</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<h4>
				例えば:コンピュータの答えが３２１だったら<br>HITは１、BLOWは2になるよ。
			</h4>
		</div>
		<form action="?" method="post">
			<div class="row">
				<div class="col">
					<button type="submit"
						formaction="/GameStartServlet?ran2num6">2けた１〜6で遊ぶ</button>
				</div>
				<div class="col">
					<button type="submit"
						formaction="/GameStartServlet?ran3num3">3けた１〜3で遊ぶ</button>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<button type="submit"
						formaction="/GameStartServlet?ran3num6">3けた１〜6で遊ぶ</button>
				</div>
				<div class="col">
					<button type="submit"
						formaction="/GameStartServlet?ran3num9">3けた１〜10で遊ぶ</button>
				</div>
			</div>
		</form>
	</div>

</body>
</html>