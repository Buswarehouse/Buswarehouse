layui.use(['form'], function () {
    var form = layui.form;
    form.render();
    // 表单赋值
    layui.$('#LAY-component-form-setval').on('click', function(){
        $.ajax({
            type:"post",
            dataType:"text",
            url: '/MyMessage/getSelect',
            data: "",
            success: function (data) {
                var newData=JSON.parse(data);
                console.log(newData)
                console.log(newData.job)
                form.val('example', {
                    "Account": newData.account
                    , "name": newData.name
                    , "sex": newData.sex
                    , "educational": newData.educational
                    , "job": newData.job
                    , "phoneNumber": newData.phoneNumber
                    , "Email": newData.email
                });
            }
        });
    });
});