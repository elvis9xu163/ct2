<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="icon" href="img/favicon.jpg">
    <title>爱犊后台管理系统</title>
    <link href="<c:url value='/css/bootstrap.min.css'/>" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
</head>
<body>
<%@include file="common.jsp" %>


<!-- JS -->
<script type="text/javascript" charset="utf-8" src="<c:url value='/js/jquery.min.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/js/bootstrap.min.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/other/umeditor/umeditor.config.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/other/umeditor/umeditor.min.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/other/umeditor/lang/zh-cn/zh-cn.js'/>"></script>
<script type="text/javascript">
    $("#nav").children("li").each(function () {
        $(this).removeClass("active");
    });
</script>
</body>
</html>
