<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

    <title>更多心愿</title>

    <!-- Bootstrap core CSS -->
      <link href="<%=basePath%>css/flat-ui.css" rel="stylesheet">
      <link href="<%=basePath%>css/MoreWishes.css" rel="stylesheet">


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
   <div class="container">
    <div class="navbar navbar-fixed-top navbar-inverse" role="navigation">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">你好！12345</a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="ShowWishes.html">心愿墙</a></li>
            <li><a href="NewWishEdit.html">发布心愿</a></li>
            <li><a href="ManageWishes.html">发布过的</a></li>
            <li><a href="PickedWishManage.html">拾起过的</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="start.html">注销</a></li>
          </ul>
        </div><!-- /.nav-collapse -->
    </div><!-- /.navbar -->

    <div class="jumbotron">
        <h1>心愿墙</h1>
        <p class="lead">更多、更有趣、更需要你的心愿全都放在了这里！</p>
      </div>

    <div class="row">

        <s:iterator value="#request.allWishes">
          <div class="col-lg-4" id="<s:property value="id" />">
          <h4><s:property value="date" /></h4>
          <p><s:property value="content" /></p>
          <form method="post" >
          <input type="hidden" name="wishId" value="<s:property value="id" />" />
          <p><button  class="btn btn-primary"  type="submit" formaction="wish/pick">查看详情 &raquo;</button></p>
          </form>
       </div>
          
          </s:iterator>
      </div>

      <div class="pagination">
            <ul>
               <li class="previous disabled"><a href="#"><img src="image/previous.png"></a></li>
              <li class="active"><span>1 <span class="sr-only">(current)</span></span></li>
              <li><a href="#">2</a></li>
              <li><a href="#">3</a></li>
              <li><a href="#">4</a></li>
              <li><a href="#">5</a></li>
              <li><a href="#">6</a></li>
              <li><a href="#">7</a></li>
              <li class="next"><a href="#"><img src="image/next.png" /></a></li>
            </ul>
          </div>
    </div>

<script src="js/ButtonDelete.js">
</script>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  </body>
</html>