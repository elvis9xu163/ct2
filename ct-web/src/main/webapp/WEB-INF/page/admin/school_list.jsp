<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="com.xjd.ct.biz.bo.SchoolObjectBo" %>
<%@ page import="com.xjd.ct.utl.DateUtil" %>
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
    <title>学校列表</title>
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
        <h3>学校列表</h3>
    </div>
    <div class="row">
        <div class="col-sm-12">
            <table class="table table-stripped">
                <thead>
                <th>ID</th>
                <th>名称</th>
                <th>地址</th>
                <th>审核</th>
                <th>添加时间</th>
                <th>操作</th>
                </thead>
                <tbody>
                <%
                    List<SchoolObjectBo> list = (List<SchoolObjectBo>) request.getAttribute("objectList");
                    if (list != null) {
                        for (SchoolObjectBo school : list) {
                %>
                <tr>
                    <td><%=school.getObjectId()%></td>
                    <td><%=school.getSchool().getSchoolName()%></td>
                    <td><%=school.getSchool().getSchoolAddress()%></td>
                    <td><%=school.getSchool().getAuditStatus() == (byte)0 ? "已审核" : "未审核" %></td>
                    <td><%=DateUtil.format(new Date(school.getAddTime()), DateUtil.PATTERN_NORMAL_YEAR2SECOND)%></td>
                    <td><%=DateUtil.format(new Date(school.getUpdTime()), DateUtil.PATTERN_NORMAL_YEAR2SECOND)%></td>
                    <td><a class="btn btn-sm btn-default" href="<c:url value='/admin/school/edit/input?id='/><%=school.getObjectId()%>">修改</a></td>
                </tr>
                <%
                        }
                    }
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>

<!-- JS -->
<script type="text/javascript" charset="utf-8" src="<c:url value='/js/jquery.min.js'/>"></script>
<script type="text/javascript" charset="utf-8" src="<c:url value='/js/bootstrap.min.js'/>"></script>
<script type="text/javascript">
    $("#nav").children("li").each(function () {
        $(this).removeClass("active");
    });

    $("#nav_school").addClass("active");
    $("#nav_school").children("a").attr("href", "javascript:void(0)");

</script>
</body>
</html>
