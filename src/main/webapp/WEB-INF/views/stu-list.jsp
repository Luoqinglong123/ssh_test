<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function del() {
		if (confirm("你确定要删除该记录吗？")) {
			return true;
		}
		return false;
	}
</script>
</head>
<body>
	<h1> <font color="red">学生列表页面</font></h1>
	<s:if test="#request.students ==null || #request.students.size()==0">
				没有任何学生信息
	</s:if>
	<s:else>
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<td>id</td>
				<td>姓名</td>
				<td>性别</td>
				<td>班级</td>
				<td>删除</td>
				<td>更新</td>

			</tr>
			<s:iterator value="#request.students" id="stu">
				<tr>
					<td>${id }</td>
					<td>${name }</td>
					<td>${sex}</td>
					<td>${clazz.clazzName }</td>
					<td><s:a href="stu-delete?student.id=%{#stu.id}"
							onclick="return del()">删除</s:a></td>
					<td><s:a href="stu-updateP?student.id=%{#stu.id}">更新</s:a></td>
				</tr>
			</s:iterator>
		</table>

	</s:else>
</body>
</html>