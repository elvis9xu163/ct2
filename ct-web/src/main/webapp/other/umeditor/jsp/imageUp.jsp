<%@ page import="java.io.File" %>
<%@ page import="java.util.List" %>
<%@ page import="org.apache.commons.fileupload.FileItem" %>
<%@ page import="org.apache.commons.fileupload.disk.DiskFileItemFactory" %>
<%@ page import="org.apache.commons.fileupload.servlet.ServletFileUpload" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="org.springframework.web.multipart.commons.CommonsMultipartFile" %>
<%@ page import="com.xjd.ct.biz.bo.TokenBo" %>
<%@ page import="com.xjd.ct.utl.DateUtil" %>
<%@ page import="com.xjd.ct.utl.constant.AppConstant" %>
<%@ page import="com.xjd.ct.utl.context.AppContext" %>
<%@ page import="com.xjd.ct.utl.respcode.RespCode" %>
<%@ page import="com.xjd.ct.web.ctrlr.v10.ResourceController10" %>
<%@ page import="com.xjd.ct.web.util.SessionContextUtil" %>
<%@ page import="com.xjd.ct.web.view.ResourceBody" %>
<%@ page import="com.xjd.ct.web.view.View" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");

    String state = "";
    String fileName = "";
    String originalName = "";
    String size = "";
    String type = "";
    String url = "";
    boolean isMultipart = ServletFileUpload.isMultipartContent(request);
    if (!isMultipart) {
        state = "未选择文件!";
    } else {
        DiskFileItemFactory dff = new DiskFileItemFactory();
        File dir = new File(AppContext.getProperty(AppConstant.RESOURCE_TMP_PATH_KEY));
        dir.mkdirs();
        dff.setRepository(dir);
        ServletFileUpload sfu = new ServletFileUpload(dff);
        sfu.setHeaderEncoding("utf-8");
        List<FileItem> items = sfu.parseRequest(request);

        CommonsMultipartFile file = new CommonsMultipartFile(items.get(0));
        ResourceController10 resourceController10 = WebApplicationContextUtils.getWebApplicationContext(session.getServletContext()).getBean(ResourceController10.class);

        View view = resourceController10.upload(DateUtil.nowInMilliseconds() + "", ((TokenBo) session.getAttribute(SessionContextUtil.TOKEN_KEY)).getToken(), null, file, request);


        fileName = file.getName();
        originalName = file.getOriginalFilename();
        size = file.getSize() + "";
        int i = 0;
        type = (originalName != null && (i = originalName.lastIndexOf('.')) != -1) ? originalName.substring(i) : "";
        if (RespCode.RESP_0000.equals(view.getReturnCode())) {
            state = "SUCCESS";
            url = "imageDown.jsp?resId=" + ((ResourceBody) view.getBody()).getResource().getResId();
        } else {
            state = view.getReturnMsg();
        }
    }

    String callback = request.getParameter("callback");

    String result = "{\"name\":\"" + fileName + "\", \"originalName\": \"" + originalName + "\", \"size\": " + size + ", \"state\": \"" + state + "\", \"type\": \"" + type + "\", \"url\": \"" + url + "\"}";

    result = result.replaceAll("\\\\", "\\\\");

    if (callback == null) {
        response.getWriter().print(result);
    } else {
        response.getWriter().print("<script>" + callback + "(" + result + ")</script>");
    }
%>
