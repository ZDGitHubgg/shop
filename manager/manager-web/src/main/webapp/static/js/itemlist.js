layui.extend({
    admin: '{/}../../static/js/admin'
});

layui.use(['table', 'jquery', 'admin'], function () {
    var table = layui.table,
        $ = layui.jquery,
        admin = layui.admin;

    //监听工具条
    table.on('tool(item)', function(obj){
        var data = obj.data;
        if(obj.event === 'del'){
            layer.confirm('是否删除？', function(index){
                obj.del();
                layer.close(index);
                //向服务端发送删除指令
                $.ajax({
                    url:"../../item/delete",
                    type:"post",
                    data:{"pro_id":data.pro_id},
                    success:function(data){
                        if(data==1){
                            layer.msg('删除成功', {
                                icon: 1
                            });
                        }else {
                            layer.msg('删除失败', {
                                icon: 2
                            });
                        }
                    }
                });
                obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                layer.close(index);
            });
        } else if(obj.event === 'edit'){
            var title = "修改商品";
            var url = "../../pages/item/edit";
            var w = ($(window).width() * 0.6);
            var h = ($(window).height() - 50);
            layer.open({
                type: 2,
                area: [w + 'px', h + 'px'],
                fix: false, //不固定
                maxmin: true,
                shadeClose: true,
                shade: 0.4,
                title: title,
                content: url,
                success: function (layero, index) {
                    var body = layer.getChildFrame('body', index);
                    //巧妙的地方在这里哦
                    body.contents().find("#pro_name").val(data.pro_name);
                    body.contents().find("#pro_price").val(data.pro_price);
                    body.contents().find("#pro_desc").val(data.pro_desc);
                    body.contents().find("#pro_date").val(data.pro_date);
                    body.contents().find("#cat_name").val(data.cat_name);
                    body.contents().find("#pro_id").val(data.pro_id);
                },
                error: function (layero, index) {
                    alert("aaa");
                }
            });

        }
    });

    table.render({
        //容器元素
        elem: '#itemList',
        //最小宽度
        cellMinWidth: 80,
        //列
        cols: [
            [{
                type: 'checkbox'
            }, {
                field: 'pro_id', title: '商品编号',width:100, sort: true
            },{
                field: 'cat_name', title: '商品分类'
            },{
                field: 'pro_name', title: '商品名称'
            },{
                field: 'pro_desc', title: '商品详情'
            },{
                field: 'statusName', title: '商品状态'
            },{
                field: 'operate', title: '操作', toolbar: '#operateTpl',width:160, unresize: true
            }]
        ],
        //通过URL进行数据绑定
        url:'../../items',
        //是否开启分页
        page: true,
        limits:[2,5,10]
    });

    var active = {
        reload: function () {
            //val() text() html()
            var title = $('#title').val();
            table.reload('articleList', {
                page: {curr: 1},
                where: {title: title}
            });
        },
        getCheckData: function () { //获取选中数据
            var checkStatus = table.checkStatus('itemList'),
                data = checkStatus.data;
            if (data.length > 0) {
                layer.confirm('确认要删除吗？', function (index) {
                    //在前台页面把选中数据删除：找到所有被选中的
                    $(".layui-table-body .layui-form-checked").parents('tr').remove();
                    //形成一个ID的数组
                    var ids = [];
                    for (var i = 0; i < data.length; i++) {
                        ids.push(data[i].pro_id);
                    }
                    //发出异步的请求去后台
                    //发出异步请求
                    $.ajax({
                        url:"../../item/batch",
                        type:"post",
                        data:{"ids[]":ids},
                        success:function(data){
                            console.log(data);
                        }
                    });
                    //提示用户删除成功
                    layer.msg('删除成功', {
                        icon: 1
                    });
                });
            } else {
                layer.msg("请先选择需要删除的商品！");
            }

        }
    };

    $('.demoTable .layui-btn').on('click', function () {
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });
    $('.we-search .layui-btn').on('click', function () {
        var type = $(this).data('type');//reload
        active[type] ? active[type].call(this) : '';//调用active中reload方法
    });


});