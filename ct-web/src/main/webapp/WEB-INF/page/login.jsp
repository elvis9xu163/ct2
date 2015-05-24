<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>登录</title>

    <link href="<c:url value='/css/bootstrap.min.css'/>" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body style="padding-top: 70px">

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button class="navbar-toggle" data-toggle="collapse" data-target="#navbar">
                <span class="sr-only">Toggle Navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<c:url value='/' />">爱犊后台管理工具</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="<c:url value='/login_input' />">登录</a></li>
            </ul>
        </div>
    </div>
</nav>


<div class="container">
    <div class="row">
        <div class="well col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2 col-sm-8 col-sm-offset-2 col-xs-10 col-xs-offset-1">
            <h1 class="text-center" style="margin-bottom: 20px;">登&nbsp;&nbsp;&nbsp;录</h1>
            <h5 id="errorMsg" class="text-center text-danger sr-only"></h5>

            <form role="form" id="login-form" class="form-horizontal" action="<c:url value='/admin/login'/> " method="post">
                <div class="form-group form-group-lg">
                    <label class="control-label col-sm-2 col-sm-offset-1" for="username">账&nbsp;&nbsp;&nbsp;号</label>

                    <div class="col-sm-8">
                        <input id="username" type="text" name="username" class="form-control input-lg"
                               placeholder="请输入用户名"/>
                    </div>
                </div>
                <div class="form-group form-group-lg">
                    <label class="control-label col-sm-2 col-sm-offset-1" for="password">密&nbsp;&nbsp;&nbsp;码</label>

                    <div class="col-sm-8">
                        <input id="password" type="password" name="password" class="form-control" placeholder="请输入密码"/>
                    </div>
                </div>
                <div class="form-group form-group-lg">
                    <div class="col-sm-offset-3 col-sm-8">
                        <div class="checkbox">
                            <label><input id="rememberme" type="checkbox" name="rememberme">记住我</label>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-6 col-sm-offset-3">
                        <button type="submit" class="btn btn-primary btn-block btn-lg">登&nbsp;&nbsp;&nbsp;录</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<script src="<c:url value='/js/jquery.min.js' />"></script>
<script src="<c:url value='/js/bootstrap.min.js' />"></script>
<script type="text/javascript">
    var errorMsg = "${errorMsg}";
    if (errorMsg) {
        $("#errorMsg").html(errorMsg);
        $("#errorMsg").removeClass("sr-only");
    }

    var username = "${param.username}"
    var rememberme = "${param.rememberme}";
    if (username) {
        $("#username").val(username);
    }
    if (rememberme) {
        $("#rememberme").attr("checked", "checked");
    }

    function clearError() {
        if (!$("#errorMsg").hasClass("sr-only")) {
            $("#errorMsg").addClass("sr-only");
        }
    }
    $("#username").bind("change", clearError);
    $("#password").bind("change", clearError);
</script>
</body>
</html>