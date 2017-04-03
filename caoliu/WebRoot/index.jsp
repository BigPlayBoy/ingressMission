<%--
  Created by IntelliJ IDEA.
  User: 11517
  Date: 2017/3/16
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Mission查询</title>
    <link href="public/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="public/bootstrap/css/bootstrap-theme.min.css"></script>
    <script src="public/bootstrap/js/jquery.min.js"></script>
    <script src="public/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <%--nav begin--%>
    <nav class="navbar navbar-default" role="navigation" action="searchMission.action">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse"
                        data-target="#example-navbar-collapse">
                    <span class="sr-only">切换导航</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">菜鸟教程</a>
            </div>
            <div class="collapse navbar-collapse" id="example-navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">iOS</a></li>
                    <li><a href="#">SVN</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            Java <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="#">jmeter</a></li>
                            <li><a href="#">EJB</a></li>
                            <li><a href="#">Jasper Report</a></li>
                            <li class="divider"></li>
                            <li><a href="#">分离的链接</a></li>
                            <li class="divider"></li>
                            <li><a href="#">另一个分离的链接</a></li>
                        </ul>
                    </li>

                </ul>
            </div>

        </div>
    </nav>
    <%--nav end--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-3">
            <form class="navbar-form navbar-left" role="search" action="searchMission.action">
                <div class="form-group">
                    <input type="text" name="missionName" class="form-control" placeholder="输入要查询的任务名称">
                </div>
                <button type="submit" class="btn btn-default">提交</button>
            </form>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8">
            <ol>
                <li><a href="#">北京</a></li>
                <li><a href="#">天津</a></li>
                <li><a href="#">上海</a></li>
                <li><a href="#">广州</a></li>
                <li><a href="#">深圳</a></li>
                <li><a href="#">大连</a></li>
                <li><a href="#">苏州</a></li>
                <li><a href="#">南京</a></li>
                <li><a href="#">西安</a></li>

            </ol>
        </div>
        <div class="col-md-4">
            <h1>HELLOWORLD!</h1>
        </div>
    </div>
</div>


</body>
</html>
