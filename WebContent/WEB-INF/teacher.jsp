<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>teacher管理</title>
<link rel="stylesheet" type="text/css" href="./css/all.css"/>
<style type="text/css">
<style type="text/css">
/* 偶数 */
tr:nth-child(odd) {
	background: white;
}
/* 奇数 */
		tr:nth-child(even) {
	background: #ddd;
}
</style>
<script type="text/javascript" >
	function addCheckForm() {
		var form = document.getElementById('addForm');
	    var input_name= document.getElementById('addname').value;
	    var input_age= document.getElementById('addage').value;
	    var input_sex= document.getElementById('addsex').value;
	    if (input_name == "" || input_name == null) {
	    	alert("请入力姓名！！！");
	    	return false;
	    }

	    if (input_age == "" || input_age == null) {
	    	alert("请输入学員出生年月！！！");
	    	return false;
	    }

	    if (input_sex == "" || input_sex == null) {
	    	alert("性別を入力してください！！！");
	    	return false;
	    }

		form.submit();
		return true;
	}

	function delCheckForm() {
		var form = document.getElementById('delForm');

	    var input_id= document.getElementById("delid").value;
	    if (input_id == "" || input_id == null) {
	    	alert("请输入削除教師id！！！");
	    	return false;
	    }

		form.submit();
		return true;
	}

	function editCheckForm() {
		var form = document.getElementById('editForm');

	    var input_id= document.getElementById('editid');
	    var input_name= document.getElementById('editname');
	    var input_age= document.getElementById('editage');
	    var input_sex= document.getElementById('editsex');
	    if (input_id == "" || input_id == null) {
	    	alert("请输入教師id！！！");
	    	return false;
	    }

	    if (input_name == "" || input_name == null) {
	    	alert("请输入教師姓名！！！");
	    	return false;
	    }

	    if (input_age == "" || input_age == null) {
	    	alert("请输入教師年齢！！！");
	    	return false;
	    }

	    if (input_sex == "" || input_sex == null) {
	    	alert("请输入教師性別！！！");
	    	return false;
	    }

	    if (input_score == "" || input_score == null) {
	    	alert("请输入学員成绩！！！");
	    	return false;
	    }


		form.submit();
		return true;
	}
</script>
</head>
<body>
<img src="./images/color-logo.gif" />
${msg}
<h1 align="center">教師管理</h1>

<div id="all_comm" class="all"  >
  <h2 align="center">teacher資料</h2>
  <table id="items" >
	<tr>
		<td>id</td>
		<td>姓名</td>
		<td>年龄</td>
		<td>性別</td>

	</tr>

    <c:forEach items="${teachers}" var="teacher" >
	    <tr>
			<td id="id${teacher.id }">${teacher.id}</td>
			<td id="name${teacher.id }">${teacher.name}</td>
			<td id="age${teacher.id }">${teacher.age}</td>
			<td id="sex${teacher.id}">${teacher.sex}</td>
		 </tr>
	 </c:forEach>
  </table>
</div>

	<div id="add_comm" class="all" align="left">
	  <h2>查找教師</h2>
	  <form action="queryByName" method="post" >
		<input type="text" placeholder="姓名" name="name" >
		<input type="submit" value="查找教師" >
	  </form>

	  <h2 id="edit_title">添加教師</h2>
		<form  id="addForm" action="add" method="post" >
		<h3>姓名</h3>
	<input id="addbirthday" type="text" placeholder="出生年月" name="birthday" />
		<input id="addage" type="text" placeholder="年龄" name="age" />
		<input id="addsex" type="text" placeholder="性別" name="sex" />
		<input type="button" value="添加" onClick="addCheckForm()"/>
	  </form>
	</div>

	<div id="edit_comm" class="all">
	  <h2>删除教師</h2>
	  <form id="delForm" action="deleteById" method="post" >
		<input id="delid" type="text" placeholder="要删除的id" name="id" />
		<input type="button" value="删除学员" onclick="delCheckForm()"/>
	  </form>

	  <h2 id="edit_title">编辑教師</h2>
	  <form id = "editForm"action="update" method="post">
		<input id="editid" type="text" placeholder="要修改的id" id="edit_id" name="id" value="要修改的id为"/><br>
		<input id="editname" type="text" placeholder="姓名" name="name" />
		<input id="editage" type="text" placeholder="年龄" name="age" />
		<input id="editses" type="text" placeholder="性別" name="sex" />
		<input type="button" value="确定修改" onclick="editCheckForm()"/>
	  </form>
	</div>
</body>
</html>