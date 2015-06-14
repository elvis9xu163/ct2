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
    <link rel="icon" href="<c:url value='/img/favicon.jpg'/>">
    <title>启动图设置</title>
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

<div class="container">
    <div class="page-header">
        <h3>设置启动图</h3>
    </div>
    <div class="row">
        <div class="col-md-5">
            <div class="form-group">
                <form id="imgForm" target="frame" enctype="multipart/form-data" method="post"
                      action='<c:url value="/admin/resource/uploadArticleImg"/> '>
                    <label for="inputImg">图&nbsp;片</label>
                    <input type="file" name="file" id="inputImg"/>
                    <img id="imgView" src="#" class="img-rounded img-responsive hide"
                         style="max-width: 100px; max-height: 100px;"/>

                    <p class="help-block">该图片将用在文章列表中展现.</p>
                </form>
            </div>
        </div>
    </div>
    <button id="btnSubmit" type="button" class="btn btn-default btn-lg">提&nbsp;交</button>
</div>

<form id="articleForm" action="<c:url value='/admin/launchpic/edit'/>" method="post">
    <input type="hidden" name="img">
</form>

<iframe id="frame" name="frame" class="hide">
</iframe>

<!-- JS -->
<script type="text/javascript" charset="utf-8" src="<c:url value='/js/jquery.min.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/js/bootstrap.min.js'/>"></script>
<script type="text/javascript">
    $("#nav").children("li").each(function () {
        $(this).removeClass("active");
    });

    $("#nav_launchpic").addClass("active");
    $("#nav_launchpic").children("a").attr("href", "javascript:void(0)");

    $("#inputImg").change(function () {
        var f = $(this).val();
        var i = f.indexOf('.');
        if (i == -1) {
            alert("请选择图片文件!");
            return false;
        }
        var suffix = f.substring(i + 1);
        if (suffix == null || "gif|bmp|jpg|jpeg|png|ico|GIF|BMP|JPG|JPEG|PNG|ICO".indexOf(suffix) == -1) {
            alert("请选择图片文件!");
            return false;
        }
        $("#imgForm").submit();
    });

    function setImage(resId, url) {
        $("#articleForm").find("input[name='img']").val(resId);
        $("#imgView").attr("src", url).removeClass("hide");
    }

    $("#btnSubmit").click(function () {
        $("#articleForm").submit();
    });

    var errCode = '${param["errCode"]}';
    var errMsg = '${param["errMsg"]}';
    if (errCode) {
        alert(errCode + ": " + decodeURI(errMsg));
    }
</script>
</body>
</html>
