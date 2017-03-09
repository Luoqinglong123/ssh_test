<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<font color="red">添加班级页面</font>
	</h1>
		<s:form action="clazz-save">
	<table>
		<tr>
			<td>
				<s:hidden name="clazz.id" value="%{clazz.id}"></s:hidden>
			</td>
		</tr>
	
		<tr>
			<td>
				<s:textfield name="clazz.clazzName" value="%{clazz.clazzName}" label="名字"></s:textfield>
			</td>
		</tr>
		
		
		<tr>
			<td>
				<s:submit value="更新"></s:submit>
			</td>
		</tr>
	</table>	
	</s:form>
</body>
</html>