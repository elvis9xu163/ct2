<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="icon" href="<c:url value='/img/favicon.jpg'/>">
    <title>学校编辑</title>
    <link href="<c:url value='/css/bootstrap.min.css'/>" rel="stylesheet">
</head>
<body>
<%@include file="common.jsp" %>

<div class="container">
    <div class="page-header">
        <h3>学校编辑</h3>
    </div>
    <div class="row" id="divShow">
        <div class="col-md-5">
            <div class="form-group">
                <label>名&nbsp;称</label>
                <input type="text" class="form-control" name="name"/>
            </div>
            <div class="form-group">
                <label>电话</label>
                <input type="text" class="form-control" name="phone"/>
            </div>
            <div class="form-group">
                <label>地址</label>
                <input type="text" class="form-control" name="address"/>
            </div>
            <div class="form-group">
                <label>经度</label>
                <input type="text" class="form-control" name="lon"/>
            </div>
            <div class="form-group">
                <label>纬度</label>
                <input type="text" class="form-control" name="lat"/>
            </div>
            <div class="form-group">
                <label>区域</label>
                <input type="text" class="form-control" name="region"/>
            </div>
            <div class="form-group">
                <label>性质</label>
                <select class="form-control" name="nature">
                    <option value="0">未知</option>
                    <option value="1">公立</option>
                    <option value="2">私立</option>
                </select>
            </div>
            <div class="form-group">
                <label>学级</label>
                <select class="form-control" name="grade">
                    <option value="0">未知</option>
                    <option value="1">幼儿园</option>
                    <option value="2">小学</option>
                    <option value="3">初中</option>
                    <option value="4">高中</option>
                </select>
            </div>
            <div class="form-group">
                <label>简介</label>
                <textarea class="form-control" name="intro"></textarea>
            </div>
            <div class="form-group">
                <label>师资</label>
                <textarea class="form-control" name="teacher"></textarea>
            </div>
            <div class="form-group">
                <label>费用</label>
                <textarea class="form-control" name="cost"></textarea>
            </div>
            <div class="form-group">
                <label>课程</label>
                <textarea class="form-control" name="course"></textarea>
            </div>
        </div>
        <div class="col-md-7">
            <div class="form-group">
                <label>入学条件</label>
                <textarea class="form-control" name="requistion"></textarea>
            </div>
            <div class="form-group">
                <label>入学流程</label>
                <textarea class="form-control" name="flow"></textarea>
            </div>
            <div class="form-group">
                <form target="frame" enctype="multipart/form-data" method="post" action='<c:url value="/admin/resource/uploadArticleImg"/> '>
                    <label>列表图片</label>
                    <input for="listPic" type="file" name="file"/>
                    <img src="#" class="img-rounded img-responsive hide" style="max-width: 100px; max-height: 100px;"/>
                </form>
            </div>
            <div class="form-group">
                <form target="frame" enctype="multipart/form-data" method="post" action='<c:url value="/admin/resource/uploadArticleImg"/> '>
                    <label>详情图片1</label>
                    <input for="pic1" type="file" name="file"/>
                    <img src="#" class="img-rounded img-responsive hide" style="max-width: 100px; max-height: 100px;"/>
                </form>
            </div>
            <div class="form-group">
                <form target="frame" enctype="multipart/form-data" method="post" action='<c:url value="/admin/resource/uploadArticleImg"/> '>
                    <label>详情图片2</label>
                    <input for="pic2" type="file" name="file"/>
                    <img src="#" class="img-rounded img-responsive hide" style="max-width: 100px; max-height: 100px;"/>
                </form>
            </div>
            <div class="form-group">
                <form target="frame" enctype="multipart/form-data" method="post" action='<c:url value="/admin/resource/uploadArticleImg"/> '>
                    <label>详情图片3</label>
                    <input for="pic3" type="file" name="file"/>
                    <img src="#" class="img-rounded img-responsive hide" style="max-width: 100px; max-height: 100px;"/>
                </form>
            </div>
            <div class="form-group">
                <form target="frame" enctype="multipart/form-data" method="post" action='<c:url value="/admin/resource/uploadArticleImg"/> '>
                    <label>详情图片4</label>
                    <input for="pic4" type="file" name="file"/>
                    <img src="#" class="img-rounded img-responsive hide" style="max-width: 100px; max-height: 100px;"/>
                </form>
            </div>
            <div class="form-group">
                <form target="frame" enctype="multipart/form-data" method="post" action='<c:url value="/admin/resource/uploadArticleImg"/> '>
                    <label>详情图片5</label>
                    <input for="pic5" type="file" name="file"/>
                    <img src="#" class="img-rounded img-responsive hide" style="max-width: 100px; max-height: 100px;"/>
                </form>
            </div>
            <div class="form-group">
                <label>审核状态</label>
                <select class="form-control" name="audit">
                    <option value="0">已审核</option>
                    <option value="1">未审核</option>
                    <option value="2">审核中</option>
                    <option value="3">审核失败</option>
                </select>
            </div>
        </div>
    </div>
    <button id="btnSubmit" type="button" class="btn btn-default btn-lg">提&nbsp;交</button>
</div>

<form id="articleForm" action="<c:url value='/admin/school/edit'/>" method="post">
    <input type="hidden" name="id" value="${school.objectId}">
    <input type="hidden" name="name" value="${school.schoolName}">
    <input type="hidden" name="phone" value="${school.schoolPhone}">
    <input type="hidden" name="address" value="${school.schoolAddress}">
    <input type="hidden" name="lon" value="${school.schoolLon}">
    <input type="hidden" name="lat" value="${school.schoolLat}">
    <input type="hidden" name="region" value="${school.schoolRegion}">
    <input type="hidden" name="nature" value="${school.schoolNature}">
    <input type="hidden" name="grade" value="${school.schoolGrade}">
    <input type="hidden" name="intro" value="${school.schoolIntro}">
    <input type="hidden" name="teacher" value="${school.schoolTeacher}">
    <input type="hidden" name="cost" value="${school.schoolCost}">
    <input type="hidden" name="course" value="${school.schoolCourse}">
    <input type="hidden" name="requistion" value="${school.schoolRequisition}">
    <input type="hidden" name="flow" value="${school.schoolFlow}">
    <input type="hidden" name="audit" value="${school.auditStatus}">
    <input type="hidden" name="listPic" value="">
    <input type="hidden" name="pic1" value="">
    <input type="hidden" name="pic2" value="">
    <input type="hidden" name="pic3" value="">
    <input type="hidden" name="pic4" value="">
    <input type="hidden" name="pic5" value="">
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

    $("#nav_school").addClass("active");
    $("#nav_school").children("a").attr("href", "javascript:void(0)");

    $("#articleForm input").each(function () {
        i = $("#divShow input[name='" + $(this).attr("name") + "']");
        if (i.length > 0) {
            i.val($(this).val());
            return true;
        }
        i = $("#divShow textarea[name='" + $(this).attr("name") + "']");
        if (i.length > 0) {
            i.val($(this).val());
            return true;
        }
        i = $("#divShow select[name='" + $(this).attr("name") + "']");
        if (i.length > 0) {
            i.find("option[value='" + $(this).val() + "']").attr("selected", true);
            return true;
        }
    });

    var picInput = null;
    var picImg = null;
    $("input:file").change(function () {
        picImg = $(this).next();
        picInput = $("#articleForm").find("input[name='" + $(this).attr("for") + "']");
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
        $(this).parent().submit();
    });

    function setImage(resId, url) {
        picInput.val(resId);
        picImg.attr("src", url).removeClass("hide");
    }

    $("#btnSubmit").click(function () {
        $("#divShow").find("input, select, textarea").each(function () {
            $hid = $("#articleForm").find("input[name='" + $(this).attr("name") + "']");
            if ($hid) {
                $hid.val($(this).val());
            }
        });
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
