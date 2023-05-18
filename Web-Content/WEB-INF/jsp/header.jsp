<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <script
src="https://code.jquery.com/jquery-3.3.1.min.js"
integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
crossorigin="anonymous"></script>
<script>
$(function(){
    $(".btn-gnavi").on("click", function(){
        // ハンバーガーメニューの位置を設定
        var rightVal = 0;
        if($(this).hasClass("open")) {
            // 位置を移動させメニューを開いた状態にする
            rightVal = -300;
            // メニューを開いたら次回クリック時は閉じた状態になるよう設定
            $(this).removeClass("open");
        } else {
            // メニューを開いたら次回クリック時は閉じた状態になるよう設定
            $(this).addClass("open");
        }
 
        $("#global-navi").stop().animate({
            right: rightVal
        }, 200);
    });
});
</script>

<link rel="stylesheet" href="css/header.css">
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=yes">
</head>
  <body>
 
<div id="wrapper">
<div class="content">

</div>
    <p class="btn-gnavi">
        <span></span>
        <span></span>
        <span></span>
    </p>
    <nav id="global-navi">
        <ul class="menu">
            <li><a href="/MenuServlet">MENU</a></li>
            <li><a href="/GameRuleServlet">GAMEをする</a></li>
            <li><a href="/GameClearServlet">プログラミングをする</a></li>
            <li><a href="/LogOutServlet">ログアウト</a></li>
        </ul>
    </nav>
     
</div>

  
  </body>
</html>