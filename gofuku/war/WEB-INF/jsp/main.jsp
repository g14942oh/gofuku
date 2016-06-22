<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.User"%>
<%@page import="com.google.appengine.api.users.*"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/design.css">
        <title>呉服屋さん</title>
    </head>
    <body>
        <div id="header"></div>
        <div id="main">
            <h1>呉服屋さんメイン</h1>
            <p>ログイン中
                <a href="../logoutServlet"> (ログアウト)</a><br><br>
            </p>
            <p>商品を選択してください</p>
            <p>商品を選択したら注文確定ボタンを押してください</p>
            <p>
            <form action="../main" method="post">
                <img src="wahuku.jpg" width="140" height="140" >
                <input type="checkbox" name="clothes[1]" value="和服">和服(10万円)　　　
                <img src="wahuku2.jpg" width="140" height="140" >
                <input type="checkbox" name="clothes[2]" value="和服2">和服2(8万円)　　　
                <img src="wahuku3.jpg" width="140" height="140" >
                <input type="checkbox" name="clothes[3]" value="和服3">和服3(6万円)　　　
                <img src="wahuku4.jpg" width="140" height="140" >
                <input type="checkbox" name="clothes[4]" value="和服4">和服4(1万円)　　　
                <img src="wahuku5.jpg" width="140" height="140" >
                <input type="checkbox" name="clothes[5]" value="和服5">和服5(10万円)
		<br><br>
                <input type="submit" value="注文確定">
            </form>
	    <table>
        <form method="post" action="../main">
            <tr><th>商品名:</th><td><input type="text" name="title"></td></tr>
            <tr><th>個数:</th><td><input type="text" name="kosuu"></td></tr>
            <tr><th></th><td><input type="submit" value="カゴに追加"></td></tr>
        </form>
        </table>
        </div>
        <div id="footer"></div>
    </body>
</html>
