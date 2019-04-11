<%--
  Created by IntelliJ IDEA.
  User: 17678
  Date: 2019/3/6
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <%
        pageContext.setAttribute("path", request.getContextPath());
    %>

    <script src="${path}/static/js/jquery-2.1.0.min.js"></script>
    <link href="${path}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${path}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <title>Title</title>

</head>
<body>

<div class="container">
    <%--标题--%>
    <div class="row">
        <div class="col-md-12">
            <h1>SSR-CRUD</h1>
        </div>
    </div>
    <%--按钮--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button type="button" class="btn btn-primary">新增</button>
            <button class="btn btn-danger">删除</button>
        </div>
    </div>
    <%--表格--%>
    <div class="row">
        <div class="row">
            <div class="col-md-12">
                <table class="table table-hover">
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Gender</th>
                        <th>Email</th>
                        <th>deptName</th>
                        <th>操作</th>
                    </tr>
                    <c:forEach items="${pageinfo.list}" var="emp">
                        <tr>
                            <th>${emp.empId}</th>
                            <th>${emp.empName}</th>
                            <th>${emp.empGender}</th>
                            <th>${emp.email}</th>
                            <th>${emp.tbleDept.deptName}</th>

                            <th>
                                <button type="button" class="btn btn-primary btn btn-primary btn-sm">
                                    <span class="glyphicon glyphicon-pencil " aria-hidden="true"></span>
                                    编辑
                                </button>
                                <button class="btn btn-danger btn btn-primary btn-sm" >
                                    <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                                    删除
                                </button>
                            </th>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
    <%--分页信息--%>
    <div class="row">
        <div class="col-md-6">
            当前页码${pageinfo.getPageNum()} 总页数${pageinfo.getPages()}
        </div>
        <div class="col-md-6">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <c:if test="${pageinfo.getPageNum() != 1}">
                        <li><a href="/emps/emps.do?page=1">首页</a></li>
                        <li>
                            <a href="#" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                    </c:if>
                    </li>
                    <c:forEach items="${pageinfo.getNavigatepageNums()}" var="page">
                        <c:if test="${page == pageinfo.getPageNum()}">
                            <li class="active"><a href="/emps/emps.do?page=${page}">${page}</a></li>
                        </c:if>
                        <c:if test="${page != pageinfo.getPageNum()}">
                            <li><a href="/emps/emps.do?page=${page}">${page}</a></li>
                        </c:if>
                    </c:forEach>
                    <c:if test="${pageinfo.getPages() != pageinfo.getPageNum()}">
                        <li > <a href="/emps/emps.do?page=${pageinfo.getPages()}">尾页</a>
                        </li>
                        <li >
                            <a href="/emps/emps.do?page=${pageinfo.getPageNum()+1}" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </c:if>

                </ul>
            </nav>
        </div>
    </div>
</div>

</body>
</html>
