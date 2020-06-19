<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/3/10
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
<h1 align="center">已留作业</h1>
<table align="center" width="800" border="1"  cellpadding="1" cellspacing="1">
    <tr align="center" height="50" bgcolor="#faebd7">
        <td>作业编号</td>
        <td>作业标题</td>
        <td>作业内容</td>
        <td>创建时间</td>
    </tr>
<c:forEach items="${homework}" var="h" >
    <tr align="center">
        <td>${h.id}</td>
        <td>${h.title}</td>
        <td>${h.content}</td>
        <td>${h.create_time}</td>
    </tr>
</c:forEach>
</table>
<h1 align="center">学生名单</h1>
<table align="center" width="800" border="1"  cellpadding="1" cellspacing="1">
    <tr align="center" height="50" bgcolor="#faebd7">
        <td>学生学号</td>
        <td>学生名字</td>
        <td>添加时间</td>
    </tr>
<c:forEach items="${student}" var="s">
    <tr align="center">
        <td>${s.id}</td>
        <td>${s.name}</td>
        <td>${s.create_time}</td>
    </tr>
</c:forEach>
</table>
<h1 align="center">提交作业</h1>
<form action="/addStudentHomework" method="post">
    <table align="center" width="800" border="1"  cellpadding="1" cellspacing="1">
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>学生学号</td>
            <td><input type="text" name="studentId"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>作业编号</td>
            <td><input type="text" name="homeworkId"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>作业标题</td>
            <td><input type="text" name="homeworkTitle"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>作业内容</td>
            <td><input type="text" name="homeworkContent"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>操作</td>
            <td><input type="submit" value="提交"><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>

<h1 align="center">更新作业</h1>
<form action="/updateStudentHomework" method="post">
    <table align="center" width="800" border="1"  cellpadding="1" cellspacing="1">
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>学生学号</td>
            <td><input type="text" name="studentId"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>作业编号</td>
            <td><input type="text" name="homeworkId"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>作业标题</td>
            <td><input type="text" name="homeworkTitle"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>作业内容</td>
            <td><input type="text" name="homeworkContent"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>操作</td>
            <td><input type="submit" value="提交"><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>



</body>
</html>
