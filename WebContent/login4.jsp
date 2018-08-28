<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function check(){

	var flag = 0;


	// 設定開始（チェックする項目を設定してください）

	if(document.selectboxform.select1.options[document.selectboxform.select1.selectedIndex].value == ""){

		flag = 1;

	}

	// 設定終了


	if(flag){

		window.alert('選択されていません'); // 選択されていない場合は警告ダイアログを表示
		return false; // 送信を中止

	}
	else{

		return true; // 送信を実行

	}

}


</script>

</head>
<body>
<form method="POST" action="all" name="selectboxform" onSubmit="return check()">

<p><select name="select1">
<option value="">選択してください
<option value="sample1">選択サンプル1
<option value="sample2">選択サンプル2
<option value="sample3">選択サンプル2
</select></p>

<p><input type="submit" value="送信"></p>

</form>
<center><img src="./color-logo.gif"/></center>
<h1 align="center"><a href="all" rel="external nofollow" rel="external nofollow" >进入学員管理主页</a></h1>
</body>
</html>