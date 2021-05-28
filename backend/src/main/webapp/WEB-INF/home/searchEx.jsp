<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%--<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>--%>
<html>
<body>
<ul class="login-wrapper">
    <li class="search-text">
        <h2 class="search-title">
            검색하고싶은<br /> <b>영역의 넓이를</b><br /> <b>입력하세요</b>
        </h2>
        <input type="text" name="start_x_axis" id="start_x_axis" placeholder="start_x_axis">
        <input type="text" name="end_x_axis" id="end_x_axis" placeholder="end_x_axis">
        <input type="text" name="start_y_axis" id="start_y_axis" placeholder="start_y_axis">
        <input type="text" name="end_y_axis" id="end_y_axis" placeholder="end_y_axis">
    </li>
    <li class="search-btn">
        <button type="submit" id="submit">submit</button>
    </li>

    <li class = "result-set">
        <p>result of feeds</p>
        <p>index</p>
    </li>
</ul>
</body>
</html>

<script type='text/javascript'>
    var resultTemplate = "";
    $('#submit').click(
        function(event) {
            var inputArea = {
                "x_start" : $("#start_x_axis").val(),
                "x_end" : $("#end_x_axis").val(),
                "y_start" : $("#start_y_axis").val(),
                "y_end" : $("#end_y_axis").val()
            }
            $.ajax({
                type : "post",
                url : "/mapro/loginAuth",
                data : JSON.stringify(inputArea),

                success : function(data) {
                    if (data == "") {
                        $(".result-set").append();
                    }
                }
            })
        }
    )
</script>
var userBody = {
"toolname" : toolname,
"trialnum" : trialnum,
"mynewscore" : mynewscore,
"mycurrentscore" : mycurrentscore,
"ansResult" : correctionList,
"rankingActivationFlag" : rankingActivationFlag,
"mycurrentTotalscore" : mycurrentTotalscore,
}

$.ajax({
type: "post",
url: "/DWSWS/saveTestResult",
contentType: "application/json",
data: JSON.stringify(userBody),
cache: false,

success: function(data) {
if(data == "success") {
alert("저장에 성공했습니다.");
location.href = "diagnose-result";
}
}
})

$("#signin").click(
function(event) {
$.ajax({
type : "post",
url : "/DWSWS/loginAuth",
cache : false,
data : {
"id" : $("#id").val()
},
success : function(data) {
if (data == "") {
alert("존재하지 않는 ID 입니다.");
} else {
var urlParams = window.location.search.substring(5);
if(urlParams == "") { // redirect to main page after login
location.href = 'main';
} else {
location.href = urlParams; // redirect to foward page after login
}
}
},
error : function(request, error) {
console.log(request, error);
alert(
"서버와의 통신 중 오류가 발생했습니다.");
}
})
});