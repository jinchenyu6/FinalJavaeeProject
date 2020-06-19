
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/3/10
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Teacher</title>
</head>
<body>

<h1 align="center">添加学生</h1>
<form action="/addStudent" method="post">
    <table align="center" width="800" border="1"  cellpadding="1" cellspacing="1">
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>学生学号</td>
            <td><input type="text" name="studentId"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>学生名字</td>
            <td><input type="text" name="studentName"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>操作</td>
            <td><input type="submit" value="提交"><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>
<h1 align="center">已添加学生</h1>
<table align="center" width="800" border="1"  cellpadding="1" cellspacing="1">
    <tr align="center" height="50" bgcolor="#faebd7">
        <td>学生学号</td>
        <td>学生名字</td>
        <td>添加时间</td>
    </tr>
<c:forEach items="${student}" var="s">
    <tr align="center">
        <td >${s.id}</td>
        <td>${s.name}</td>
        <td>${s.create_time}</td>
    </tr>
    </c:forEach>

</table>
<h1 align="center">更新学生</h1>
<form action="/updateStudent" method="post">
    <table align="center" width="800" border="1"  cellpadding="1" cellspacing="1">
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>学生学号</td>
            <td><input type="text" name="studentId"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>学生名字</td>
            <td><input type="text" name="studentName"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>操作</td>
            <td><input type="submit" value="提交"><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>
<h1 align="center">删除学生</h1>
<form action="/deleteStudent" method="post">
    <p>删除学生id</p><input type="text" name="studentId">
</form>


<h1 align="center">布置作业</h1>
<form action="/addHomework" method="post">
    <table align="center" width="800" border="1"  cellpadding="1" cellspacing="1">
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>作业序号</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>作业名称</td>
            <td><input type="text" name="title"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>作业内容</td>
            <td><input type="text" name="content"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>操作</td>
            <td><input type="submit" value="提交"><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>

<h1 align="center">更新作业</h1>
<form action="/updateHomework" method="post">
    <table align="center" width="800" border="1"  cellpadding="1" cellspacing="1">
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>作业序号</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>作业名称</td>
            <td><input type="text" name="title"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>作业内容</td>
            <td><input type="text" name="content"></td>
        </tr>
        <tr align="center" height="50" bgcolor="#faebd7">
            <td>操作</td>
            <td><input type="submit" value="提交"><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>

<h1 align="center">删除作业</h1>
<form action="/deleteHomework" method="post">
    <p>删除作业id</p><input type="text" name="homeworkId">
</form>



<h1 align="center">检查作业</h1>
<table align="center" width="800" border="1"  cellpadding="1" cellspacing="1">
    <tr align="center" height="50" bgcolor="#faebd7">
        <td>作业ID</td>
        <td>学生学号</td>
        <td>作业编号</td>
        <td>作业标题</td>
        <td>作业内容</td>
        <td>创建时间</td>

    </tr>
<c:forEach items="${studentHomework}" var="SH">
    <tr align="center">
        <td>${SH.id}</td>
        <td>${SH.studentId}</td>
        <td>${SH.homeworkId}</td>
        <td>${SH.homeworkTitle}</td>
        <td>${SH.homeworkContent}</td>
        <td>${SH.createTime}</td>
    </tr>
</c:forEach>
</table>
<h1 align="center">删除作业</h1>
<form action="/deleteStudentHomework" method="post">
    <p>删除作业id</p><input type="text" name="studentHomeworkId">
</form>


</body>
</html>
