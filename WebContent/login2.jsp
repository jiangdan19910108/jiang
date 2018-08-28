<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function emailcheck(){
	var flag=0;
	if (!document.form1.email.value.match(/.+@.+\..+/)){
		flag=1;
	}
	if(flag){
		window.alert('メールアドレスが正しくありません');
		return flase;
	}
	else{
		return true;
	}
}
</script>
</head>
<body>
<form method="POST" action="all" name="form1" onSubmit="return emailcheck()">

<p>E-Mail:<input type="text" name="email" size="30"></p>
<p><input type="submit" value="送信"></p>
</form>
<center><img src="./images/color-logo.gif" /><img src="./images/header.jpg" /></center>
<h1 align="center"><a href="all" rel="external nofollow" rel="external nofollow" >进入学員管理主页</a></h1>
</body>
</html>