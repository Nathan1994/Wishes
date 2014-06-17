<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

    <title>发布新的心愿！</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=basePath%>css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<%=basePath%>css/NewWishEdit.css" rel="stylesheet">

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
          <a class="navbar-brand" href="#">你好！<s:property value="session.get("USER_LOGIN").getName"/></a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="ShowWishes.html">心愿墙</a></li>
            <li class="active"><a href="NewWishEdit.html">发布心愿</a></li>
            <li><a href="ManageWishes.html">管理心愿</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="start.html">注销</a></li>
          </ul>
        </div><!-- /.nav-collapse -->
    </div><!-- /.navbar -->

    <div class="container">
      <div class="jumbotron">
        <h1>编辑你的心愿！：</h1>
    <form method="post">
    	<input  class="form-control" name="wish.content" rows="10" cols="90" placeholder="在此处输入："></textarea>
    	<p></p>
        <p><button class="btn btn-lg btn-success"  type="submit" formaction="newwish/addwish" >马上发布！</a></p>
    </form>
      </div>


      <div class="row marketing">
        <h2>曾经发布的心愿：</h2>
        <div class="col-lg-6">
          <h4>2014.6.2</h4>
          <p>Donec id elit non mi porta gravida at eget metus. Maecenas faucibus mollis interdum.</p>

          <h4>2014.6.2</h4>
          <p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Cras mattis consectetur purus sit amet fermentum.</p>

          <h4>2014.6.2</h4>
          <p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
        </div>

        <div class="col-lg-6">
          <h4>2014.6.3</h4>
          <p>Donec id elit non mi porta gravida at eget metus. Maecenas faucibus mollis interdum.</p>

          <h4>2014.6.3</h4>
          <p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Cras mattis consectetur purus sit amet fermentum.</p>

          <h4>2014.6.3</h4>
          <p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
        </div>
      </div>

      <div class="footer">
        <p>&copy; JavaEE</p>
      </div>

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  </body>
</html>
