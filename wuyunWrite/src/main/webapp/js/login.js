$(function () {

});

function login(){
    var name=$("#name").val();
    var pass=$("#password").val();
    if(pass===""){
        alert("密码不能为空！");
    }
    $.ajax({
        type:'post',
        data:{
            username:name,
            password:pass
        },
        dataType:"json",
        url:"user/login",
        success:function (data) {
           alert("登录成功");
            window.open("writerInfo.html","_self");

        },
        error:function (data) {
            alert(data);
        }

    })
}
function register(){
    var ps=$("#password").val();
    var psconfim=$("#passwordcom").val();
    if(ps===psconfim){
        $.ajax({
            type:'post',
            data:{
                name:$("#name").val(),
                password:ps
            },
            url:"user/register",
            sucess:function (data) {
                var obj = eval('(' + data + ')');
                alert(obj.success);
            },
            error:function () {
                alert("登录失败！");
            }

        })
    }
    else {
        alert("密码与确认密码不符");
    }

}
