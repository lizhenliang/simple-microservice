$(function () {
  layui.use('table', function () {
    var table = layui.table;
    table.render({
      elem: '#orderList'
      , url: 'http://gateway.ctnrs.com/order/queryAllOrder'
      , cellMinWidth: 80
      , page: true
      , id: 'orderListReload'
      , height: 500
      , response: {
        statusName: 'status' //规定数据状态的字段名称，默认：code
        , statusCode: 200 //规定成功的状态码，默认：0
        , msgName: 'msg' //规定状态信息的字段名称，默认：msg
        , dataName: 'result' //规定数据列表的字段名称，默认：data
      }
      , cols: [[
        {field: 'id', width: 180, title: '序列'}
        , {field: 'orderNumber', title: '订单编号'}
        , {field: 'orderProductName', width: 180, title: '订单商品名称'}
        , {field: 'orderPrice', title: '订单商品价格', sort: true}
        , {field: 'count', title: '订单数量', sort: true}
        , {field: 'buyDate', title: '购买日期'}
      ]]

    });

    //监听操作工具条
    table.on('tool(order-filter)', function (obj) {

    });

    //异步搜索条件
    var $ = layui.$, active = {
      reload: function () {
        var demoReload = $('#demoReload');
        //执行重载
        table.reload('orderListReload', {
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
