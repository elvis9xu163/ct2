<%@ page import="com.xjd.ct.utl.context.AppContext" %>
<%@ page import="com.xjd.ct.utl.respcode.RespCode" %>
<%@ page import="com.xjd.ct.web.view.ResourceBody" %>
<%@ page import="com.xjd.ct.web.view.View" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
    <head>
    </head>
    <body>
    <script type="text/javascript">
    <%
        View view = (View) request.getAttribute("appView");
        if (RespCode.RESP_0000.equals(view.getReturnCode())) {
            ResourceBody body = (ResourceBody) view.getBody();
    %>
    parent.setImage('<%=body.getResource().getResId()%>', '<%=AppContext.getProperty(AppContext.KEY_RESOURCE_URL_PREFIX) + body.getResource().getResPath()%>');
    <% } else {%>
    parent.alert("上传文件失败", '<%=view.getReturnMsg()%>');
    <% } %>
    </script>
    </body>
</html>
