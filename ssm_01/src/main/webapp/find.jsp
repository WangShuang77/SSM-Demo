<%--
  Created by IntelliJ IDEA.
  User: wangshuang
  Date: 2019/3/4
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    ${msg}
    <c:forEach items="${list}" var="m" >
        1
    </c:forEach>


    <c:forEach items="${list}" var="my" >
        <tr>
            <td>${my.sid}</td>
            <td>${my.sname}</td>
            <td><fmt:formatDate value="${my.sage}" pattern="yyyy年MM月dd日HH点mm分ss秒" /></td>
            <td>${my.ssex}</td>
            <c:forEach items="${my.sc}" var="sc">
                <td>${sc.cid}</td>
                <td>${sc.course.cname}</td>
                <td>${sc.score}</td>
            </c:forEach>
        </tr>
    </c:forEach>
    ${sessionScope.aa}
    2
</table>
</body>
</html>
