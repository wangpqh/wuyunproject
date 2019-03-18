$(function () {
    // 页面日期显示
    var date = new Date();
    var y = date.getFullYear();
    var m = date.getMonth() + 1;
    var d = date.getDate();
    var h = date.getHours();
    document.getElementById("this_time").innerHTML = "&nbsp;|&nbsp;" + y + "年" + m + "月" + d + "日" + h + "时";

});

function add_artical() {
    //如果是登录状态直接新建否则提示登录
    // if（）{}else(){}
    // alert("未登录，请先登录！");
    document.getElementById("new_artical").innerHTML = "<div id=\"artical_title\">第一章 <input type=\"text\" placeholder=\"章节题\" style=\"width: 52%;height: 26px;\"></div>";


}

function delete_artical() {      //提示删除
    alert("真的要删除吗？");
    document.getElementById("artical_title")
}