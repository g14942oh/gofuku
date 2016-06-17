<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.User"%>
<%@page import="com.google.appengine.api.users.*"%>
<%%>

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
	    <h3>注文できました。</h3>
	    <ul>
                <li><div class="btn2"><a href="../main">戻る</a></div></li>
            </ul>
	</div>
        <div id="footer"></div>
    </body>
</html>
