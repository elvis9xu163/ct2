<%@ page pageEncoding="UTF-8" import="com.xjd.ct.web.util.SessionContextUtil" %>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <button class="navbar-toggle" data-toggle="collapse" data-target="#navbar">
                <span class="sr-only">Toggle Navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<c:url value='/admin' />">爱犊后台管理工具</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav" id="nav">
                <li id="nav_article"><a href="<c:url value='/admin/article/edit/input'/>">文章编辑</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-user"></span><%=SessionContextUtil.getUser().getMobile()%></a></li>
                <li><a href="<c:url value='/admin/logout' />">退出</a></li>
            </ul>
        </div>
    </div>
</nav>