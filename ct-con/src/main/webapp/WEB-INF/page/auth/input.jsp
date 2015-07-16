<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<jsp:include page="/WEB-INF/page/common/head-common.jsp" />
    <title>登录</title>
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-xs-offset-1 col-xs-10 col-sm-offset-3 col-sm-6 thumbnail">
            <form class="form-horizontal" action="<c:url value='/auth/login'/>" method="post">
            <div class="form-group">
                <label class="control-label col-sm-2">账&nbsp;&nbsp;号</label>
                <div class="col-sm-10">
                    <input class="form-control" name="username"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2">密&nbsp;&nbsp;码</label>
                <div class="col-sm-10">
                    <input class="form-control" name="password"/>
                </div>
            </div>
            <div>

            </div>
            </form>
        </div>
    </div>
</div>

<jsp:include page="/WEB-INF/page/common/body-script.jsp" />
<script type="text/javascript">
</script>
</body>
</html>