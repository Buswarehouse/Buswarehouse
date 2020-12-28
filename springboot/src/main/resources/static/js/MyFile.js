layui.use('element', function(){
    var element = layui.element;
});
layui.use('laydate', function(){
    var laydate = layui.laydate;

    //执行一个laydate实例
    laydate.render({
        elem: '#endTime', //指定元素
    });
    laydate.render({
        elem: '#beginTime'
    });
});
layui.use('table', function(){
    var table = layui.table;
    table.render({
        elem: '#MyScore'
        ,url:'/MyFile/getSelect'
        ,cols: [[
            {field:'fileName',  title: '文档标题'}
            ,{field:'uploadTime',  title: '上传时间'}
            ,{field:'loadScore',  title: '下载积分'}
            ,{field:'fileType',title: '文档类型'}
            ,{field:'checkState', title: '审核状态'}
        ]]
        ,id:'testReload'
        ,page: true
    });
    var $ = layui.$, active = {
        reload: function(){
            var demoReload = $('#demoReload');
            var beginTime = $('#beginTime').val();
            var endTime = $('#endTime').val();
            var FileType=$("select[name='FileType'] option:selected").val();
            var checkState=$("select[name='checkState'] option:selected").val();
            //执行重载
            table.reload('testReload', {
                page: {
                    curr: 1 //重新从第 1 页开始
                }
                ,where: {
                        beginTime: beginTime,
                        endTime:endTime,
                        FileType:FileType,
                        checkState:checkState,
                }
            }, 'data');
        }
    };
    $('.demoTable .layui-btn').on('click', function(){
        var type = $(this).data('type');
        active[type] ? active[type].call(this) : '';
    });
});