<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.User,model.Move,java.util.List"%>
<% User loginUser = (User)session.getAttribute("loginUser");
List<Move>moveList =
(List<Move>)application.getAttribute("moveList");
String errorMsg = (String)request.getAttribute("errorMsg");
    %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>映画紹介</title>
</head>
<body>
	<h1>映画紹介メイン</h1>
	<p><%= loginUser.getName() %>さん、ログイン中 <a href="Logout">ログアウト</a>
	<a href="Logout">ログアウト</a>
	</p>
	<p><a href="Main">更新</a></p>
	<form action="Main" method="post">
	タイトル<input type="text" name="title"><br>
	一言:<textarea name="comment"></textarea><br>
	<input type ="submit" value="紹介">
	</form>
	<%if(errorMsg != null){ %>
	<p><%=errorMsg %></p>
	<%} %>
	<%if(moveList.size()>0){ %>
	<table border ="1">
	<%for(Move move:moveList){%>
	
	<tr>
	<td><%=move.getUserName() %></td>
	<td><%=move.getTitle() %></td>
	<td><%=move.getComment() %></td>
	</tr>
	<%} %>
	</table>
	<%} %>
</body>
</html>