<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="img/favicon.jpg">
    <title>欢迎来到爱犊家庭教育</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <!-- <script src="../../assets/js/ie-emulation-modes-warning.js"></script> -->
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link href="other/umeditor/themes/default/css/umeditor.css" type="text/css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">
    <style type="text/css">
    </style>
  </head>

  <body>
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Dashboard</a></li>
            <li><a href="#">Settings</a></li>
            <li><a href="#">Profile</a></li>
            <li><a href="#">Help</a></li>
          </ul>
          <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="Search...">
          </form>
        </div>
      </div>
    </nav>
    
<div class="container-fluid">
  <div class="row row-offcanvas row-offcanvas-left">
    <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" style="padding:0px">
        <a href="#" class="list-group-item active">Link</a>
        <a href="#" class="list-group-item">Link</a>
        <a href="#" class="list-group-item">Link</a>
        <a href="#" class="list-group-item">Link</a>
        <a href="#" class="list-group-item">Link</a>
        <a href="#" class="list-group-item">Link</a>
        <a href="#" class="list-group-item">Link</a>
        <a href="#" class="list-group-item">Link</a>
        <a href="#" class="list-group-item">Link</a>
        <a href="#" class="list-group-item">Link</a>
    </div><!--/.sidebar-offcanvas-->
    <div class="col-xs-12 col-sm-9">
      <p class="pull-left visible-xs">
        <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
      </p>
      <div class="row">
        <div class="col-xs-12 col-lg-12" style="height: 1%">
          <iframe src="http://mp.weixin.qq.com/s?__biz=MjM5Njg1NzkxNQ==&mid=206161630&idx=1&sn=d9aebfbaec076d405b880df7dec0d15a#rd" width="100%" height="90%" style="border:0"></iframe>
        </div><!--/.col-xs-6.col-lg-4-->
      </div><!--/row-->
    </div><!--/.col-xs-12.col-sm-9-->
  </div><!--/row-->

</div><!--/.container-->

<!-- JS -->
<script type="text/javascript" charset="utf-8" src="js/jquery.min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('[data-toggle="offcanvas"]').click(function() {
			$('.row-offcanvas').toggleClass('active')
		});
	});
</script>
  </body>
</html>
