$(function () {


});
function login(){
    $.ajax({
        type:'post',
        data:{
            name:$("#name").val(),
            password:$("#password").val()
        },
        url:"user/login",
        sucess:function (data) {
            var obj = eval('(' + data + ')');
            alert(obj.success);
        },
        error:function () {
            alert("登录失败！");
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