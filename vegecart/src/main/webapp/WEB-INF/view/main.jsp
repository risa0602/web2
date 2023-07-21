<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"import=%>
<!DOCTYPE html>
<html lang="ja">
<head>
<!-- Requied meta tags -->
<meta charset="UTF-8">
<meta name="viewport"content="width=device-width,initial-scale=1,shrink-to-fit=no">
<!-- Bootstrap Css -->
<link rel="stylesheet"href="https://cdn.jsbelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"integritrv="sha384-Gn5384xqQ1aoWXA+058RXPxpg6fy4IWvTNh0E263XmFcJIISAwiGgFAW/dAiS6JXm"corossorigin="anonymous">

<title>VegetableCart</title>
</head>
<body>
<div class="container" style="margin-top:20px;">
<form action="/vegecart/Main"method="post">
<div class="form-group">
<label for="name">商品名:</label>
<input type="text" class="form-control"id="name" placeholder="商品名入力">
</div>
<div class="form-group">
<label for="price">価格:</label>
<input type="number" class="from-control" id="price" placeholder="価格を入力">
</div>
<button type="submit" class="btn btn-primary">カートに追加</button>
</form>
</div><!--  end container -->

<!--  Optional JavaScript -->
<!--  JQuery first, then Popper.js,then Bootstrap JS -->
<script src="http://code.jquery.com/jquery-3.2.1.slim.min.js"integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<sdript src="https://cdn.jsdeivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1qKtv3Rn7W3mgPxhu9K/ScQsAP7hUibx39j7fajFPskvXusvfa0b4Q"crossorigin="anonymous"></sdript>
<script src="https://cdn.jsdelvr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" itegrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfDWpi1MquVdAyjUar5+76PVCmY"  crossorigin="anoymous"></script>
</body>
</html>