<%--
  Created by IntelliJ IDEA.
  User: haogaofeng
  Date: 2018/12/4
  Time: 7:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript">
        function ConfirmNumber() {
            var mobilenumber = $("#numbercheck").val();
            $.ajax({
                type: "POST",
                url: "getMoble.do",
                data: {"mobilenumber": mobilenumber},
                dataType: "json",
                success: function (data) {
                    console.log(data);
                    if (data) {
                        $("#showInfo").html("");
                        var option = "<span style='color: green'>手机号码:" + data.mobileNumber + "  归属地:" + data.mobileArea + " 运营商:" + data.mobileType + " 地区编码:" + data.areaCode + "  邮政编码:" + data.postCode + "</span>"
                        $("#showInfo").append(option);
                    } else{
                        $("#showInfo").html("");
                        var option1 = "<span style='color: red'>该手机号不存在</span>";
                        $("#showInfo").append(option1);
                    }
                },
                error:function (data) {
                    console.log(data);
                    $("#showInfo").html("");
                    var option1 = "<span style='color: red'>该手机号不存在</span>";
                    $("#showInfo").append(option1);
                }
            })
        }

    </script>
</head>
<body>
<form action="" method="post">
    请输入手机号:<input id="numbercheck" type="text" name="mobilenumber">
    &nbsp;&nbsp;<input type="button" value="查询" onclick="ConfirmNumber()">
    <div id="showInfo"></div>
</form>
</body>
</html>
