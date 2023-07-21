<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
><% if(msg != null){ %>
<p><%=msg %></p>
<%} %>
<form action="Main" method="post">
製品名:<input type="text" name="name"><br>
価格:<input type="number" name="plice"><br>
<input type="submit" value="登録">
</form>
<%if(list.size()>0){ %>
<table border="1">
<tr><th>製品名</th><th>価格</th><th>登録日</th></tr>
<%for (Product p :list){ %>
<tr>
<td><%=p.getName() %></td>
<td><%=p.getPrice() %>円</td>
<td><%=p.getDateTime() %></td>
</tr>
<%} %>
</table>
<%} %>

</body>
</html>