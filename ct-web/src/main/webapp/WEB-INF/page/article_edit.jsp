<%@ page pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>文章编辑</title>
<link rel="icon" href="img/favicon.jpg">
<%@include file="common_head.jsp"%>
<link href="other/umeditor/themes/default/css/umeditor.css" type="text/css" rel="stylesheet">
</head>
<body>
  <%@include file="common.jsp"%>

  <div class="container">
        <div class="row">
          <div class="col-md-5">
            <div class="form-group">
              <label for="inputTitle">标&nbsp;题</label>
              <input type="text" name="title" class="form-control" id="inputTitle" placeholder="请输入标题">
            </div>
            <div class="form-group">
              <label for="inputSummary">摘&nbsp;要</label>
              <input type="text" name="summary" class="form-control" id="inputSummary" placeholder="请输入摘要">
            </div>
            <form action="上传图片">
            <div class="form-group">
              <label for="inputImg">图&nbsp;片</label>
              <input type="file" name="img" id="inputImg" />
               <p class="help-block">该图片将用在文章列表中展现.</p>
            </div>
            </form>
            <div class="form-group">
              <label>内容类型</label>
              <div class="radio">
                <label><input type="radio" name="contentType" value="link"> 使用外部链接 </label>
                <label><input type="radio" name="contentType" value="text"> 编辑页面内容 </label>
              </div>
            </div>
            <div class="form-group">
              <label for="inputLink">内容链接</label>
              <input type="text" name="link" class="form-control" id="inputLink" placeholder="请输入链接"/>
            </div>
          </div>
          <div class="col-md-7">
            <div class="form-group">
              <label for="inputImg">内容编辑</label>
              <!--style给定宽度可以影响编辑器的最终宽度-->
              <script type="text/plain" id="myEditor" style="width:100%; height:300px;">
                <p>请输入内容</p>
              </script>
            </div>
          </div>
        </div>
        <button type="button" class="btn btn-default">提&nbsp;交</button>
  </div>

  <!-- JS -->
  <script type="text/javascript" charset="utf-8" src="js/jquery.min.js"></script>
  <script type="text/javascript" charset="utf-8" src="js/bootstrap.min.js"></script>
  <script type="text/javascript" charset="utf-8" src="other/umeditor/umeditor.config.js"></script>
  <script type="text/javascript" charset="utf-8" src="other/umeditor/umeditor.min.js"></script>
  <script type="text/javascript" src="other/umeditor/lang/zh-cn/zh-cn.js"></script>
  <script type="text/javascript">
  	$("input[name='contentType']").click(function() {
  		alert($(this).attr("selected"));
  	});
  	
  	//实例化编辑器
  	var um = UM.getEditor('myEditor');
  	UM.getEditor('myEditor').setDisabled('fullscreen');
  </script>
</body>
</html>
