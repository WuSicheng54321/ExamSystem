<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="shiro" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
  <title>登录界面</title>
</head>
<body>

<h2>Login Information</h2>
<form method="POST" action="/ExamSystem/login">
  <table>
    <tr>
      <td>账号：</td>
      <td><input name="teacherName" /></td>
    </tr>
    <tr>
      <td>密码：</td>
      <td><input name="teacherPassword" /></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="提交"/>
      </td>
    </tr>
  </table>
</form>
</body>
</html>