$(function () {
  layui.use('table', function () {
    var table = layui.table;
    table.render({
      elem: '#productList'
      , url: 'http://gateway.ctnrs.com/product/queryAllProduct'
      , cellMinWidth: 80
      , page: true
      , id: 'productListReload'
      , height: 500
      , response: {
        statusName: 'status' //规定数据状态的字段名称，默认：code
        , statusCode: 200 //规定成功的状态码，默认：0
        , msgName: 'msg' //规定状态信息的字段名称，默认：msg
        , dataName: 'result' //规定数据列表的字段名称，默认：data
      }
      , cols: [[
        {field: 'id', width: 180, title: '序列'}
        , {field: 'productName', title: '商品名称'}
        , {field: 'price', width: 180, title: '商品价格', sort: true}
        , {field: 'stock', title: '商品库存', sort: true}
        , {fixed: 'right', width: 250, align: 'center', title: '操作', toolbar: '#productOperBar'}
      ]]

    });

    //监听操作工具条
    table.on('tool(product-filter)', function (obj) {
      var data = obj.data;
      if (obj.event === 'buy') {
        layer.confirm('您确定要购买' + data.productName + '商品吗？', {
          icon: 3,
          btn: ['确定', '取消'] //按钮
        }, function () {
          //layer.msg('正在下单', {icon: 1});
          $.ajax({
            type: "POST",
            url: "http://gateway.ctnrs.com/order/submitOrder",
            data: {productId: data.id, orderProductName: data.productName,orderPrice:data.price,count:1},
            dataType: "json",
            beforeSend:function(XMLHttpRequest){
              layer.load(1, {
                shade: [0.1,'#fff'] //0.1透明度的白色背景
              });
            },
            success: function (data) {
              layer.msg("下单成功，请查看订单列表！",{time:2000}, function(){
                layer.closeAll();
              })
            },
            error: function (e) {
              console.log(e);
              layer.closeAll();
            }
          });

        }, function (index) {
          layer.closeAll();
        });
      }
    });

    //异步搜索条件
    var $ = layui.$, active = {
      reload: function () {
        var demoReload = $('#demoReload');
        //执行重载
        table.reload('productListReload', {
          page: {
            curr: 1 //重新从第 1 页开始
          }
          , where: {
            name: demoReload.val()
          }
        });
      }
    };

    $('.userTable .layui-btn').on('click', function () {
      var type = $(this).data('type');
      active[type] ? active[type].call(this) : '';
    });
  });
});
