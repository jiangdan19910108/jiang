<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function numbercheck(){
	var flag = 0;
	// 設定開始（チェックする項目を設定してください）
	if(!document.form1.post1.value.match(/[^0-9]+/)){
		flag = 1;
	}
	else if(!document.form1.post2.value.match(/[^0-9]+/)){
		flag = 1;
	}
	// 設定終了
	if(flag){
		window.alert('数字以外が入力されています'); // 数字以外が入力された場合は警告ダイアログを表示
		return false; // 送信を中止
	}
	else{
		return true; // 送信を実行
	}
}
</script>
</head>
<body>
<center><img src="./color-logo.gif"/></center>
<h1 align="center"><a href="all" rel="external nofollow" rel="external nofollow" >进入学員管理主页</a></h1>
</body>
</html>