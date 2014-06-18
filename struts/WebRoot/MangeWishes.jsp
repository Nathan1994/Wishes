。<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="zh-cn">
  <head>
  	<base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">

    <title>管理你的心愿！</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=basePath%>css/ManageWishes.css" rel="stylesheet">

    <!-- Custom styles for this template -->

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]><script src="../../docs-assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
    <div class="navbar navbar-fixed-top navbar-inverse" role="navigation">
      <!-- <div class="container"> -->
        <div class="navbar-header">
          <a class="navbar-brand" href="#">你好！<s:property value="#session.USER_LOGIN.name"/></a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="home">心愿墙</a></li>
            <li><a href="wish/add">发布心愿</a></li>
            <li class="active"><a href="wish/manage">管理心愿</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="start.html">注销</a></li>
          </ul>
        </div><!-- /.nav-collapse -->
    </div><!-- /.navbar -->
    <div class="container bs-docs-container">
      <div class="row">
        <div class="col-md-9" role="main">
          <div class="bs-docs-section">
      <div class="page-header">
        <h1>在这里管理你的心愿！</h1>
      </div>

      <h3>心愿列表：</h3>
      <p>Get three equal-width columns <strong>starting at desktops and scaling to large desktops</strong>. On mobile devices, tablets and below, the columns will automatically stack.</p>
      <div class="bs-example">

        <div class="list-group">
        
          
          <s:iterator value="#request.userWishes">
          <div id="<s:property value="id"/>">
          <a href="#" class="list-group-item">
            <h5 class="list-group-item-heading"><s:property value="date" /><br><span class="badge">7</span></h5>
            <p class="list-group-item-text"><s:property value="content"/></p>
          </a>
          <button type="button" class="btn btn-default" onclick="deleteWish(this.parentNode.id)"> 
            <span class="glyphicon glyphicon-remove"></span>删除
          </button>
          <button type="button" class="btn btn-default"> 
            <span class="glyphicon glyphicon-pencil"></span>修改
          </button>  
          <p></p>   
          </div>
          
          </s:iterator>

      



        </div>
      </div>
      </div>
      </div>
      </div>
    </div><!-- /container -->

<script src="<%=basePath%>js/ButtonDelete.js">
</script>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  </body>
</html>