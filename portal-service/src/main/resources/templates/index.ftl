<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<head lang="en">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>简单微服务应用案例</title>
    <meta name="description" content="简单微服务应用案例">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="stylesheet" href="../js/layui/css/layui.css" media="all">
</head>
<body>
<div style="background: url('/images/bg.png')  no-repeat; height: 900px; position: relative;">
    <#--    <a href="http://www.ctnrs.com"><img alt="容器学院-www.ctnrs.com" src="../images/logo.png"></a>-->
    <div class="page-container"
         style="width: 310px;height: 50px;background-color: #f0f3ef;left: 40%;top: 40%;position: absolute;">
        <h1 class="title"></h1>
        <div>
            <button class="layui-btn layui-btn-lg layui-btn-primary layui-btn-radius" onclick="queryProductList()">
                查询商品服务
            </button>
            <button class="layui-btn layui-btn-lg layui-btn-primary layui-btn-radius" onclick="queryOrderList()">
                查询订单服务
            </button>
        </div>

    </div>
</div>
    <div style="margin-left: 50%;font-size: 20px"><a href="http://www.ctnrs.com" target="_black">容器学院 www.ctnrs.com</a></div>

    <script src="../js/jquery-1.8.2.min.js"></script>
    <script src="../js/layui/layui.js"></script>
    <script src="../js/index.js"></script>

</body>
</html>
