<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.xjd.ct.web.ctrlr.v10.ResourceController10" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");

    String resId = request.getParameter("resId");
    if (resId != null) {
        ResourceController10 resourceController10 = WebApplicationContextUtils.getWebApplicationContext(session.getServletContext()).getBean(ResourceController10.class);
        resourceController10.download(resId, response);
    } else {
        response.setStatus(404);
    }
%>
