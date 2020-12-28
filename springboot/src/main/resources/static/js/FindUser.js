layui.use('element', function(){
    var element = layui.element;

});
layui.use('laydate', function(){
    var laydate = layui.laydate;
    //执行一个laydate实例
    laydate.render({
        elem: '#beginTime' //指定元素
    });
    laydate.render({
        elem: '#endTime' //指定元素
    });
});
layui.use('table', function(){
    var table = layui.table;

    //方法级渲染
    table.render({
        elem: '#LAY_table_user'
        ,url: '/FindUser/getSelectTable'
        ,cellMinWidth:80
        ,cols: [
            [
            {field:'userName', title: '用户名'}
            ,{field:'regTime', title: '注册时间', sort: true}
            ,{field:'score', title: '积分', sort: true}
            ,{field:'uploading', title: '上传文档数', sort: true}
            ,{field:'download', title: '下载文档数', sort: true}
            ,{field:'userState', title: '用户状态', sort: true}
            ,{field:'classify', title: '操作',toolbar: '#barDemo'}
            ]
        ]
        ,id: 'testReload'
        ,page: true
        ,height: 310
    });

    var $ = layui.$, active = {
        reload: function(){
            var demoReload = $('#demoReload');
            var beginTime = $('#beginTime').val();
            var endTime = $('#endTime').val();
            //执行重载
            table.reload('testReload', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,where: {
                    beginTime: beginTime,
                    endTime:endTime,
                    demoReload:demoReload.val(),
                }
            }, 'data');
        }
    };
    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });
});

