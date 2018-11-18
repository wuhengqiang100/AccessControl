<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title></title>
    <script src="${pageContext.request.contextPath}/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
    <STYLE>
        body {
            background: #ebebeb;
            font-family: "Helvetica Neue", "Hiragino Sans GB", "Microsoft YaHei", "\9ED1\4F53", Arial, sans-serif;
            color: #222;
            font-size: 12px;
        }

        * {
            padding: 0px;
            margin: 0px;
        }

        .top_div {
            background: #008ead;
            width: 100%;
            height: 400px;
        }

        .ipt {
            border: 1px solid #d3d3d3;
            padding: 10px 10px;
            margin-bottom: 2px;

            width: 290px;
            border-radius: 4px;
            padding-left: 35px;
            -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
            box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
            -webkit-transition: border-color ease-in-out .15s, -webkit-box-shadow ease-in-out .15s;
            -o-transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
            transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s
        }

        .ipt:focus {
            border-color: #66afe9;
            outline: 0;
            -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 8px rgba(102, 175, 233, .6);
            box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075), 0 0 8px rgba(102, 175, 233, .6)
        }

        .u_logo {
            background: url("${pageContext.request.contextPath}/static/images/username.png") no-repeat;
            padding: 10px 10px;
            position: absolute;
            top: 43px;
            left: 40px;

        }

        .p_logo {
            background: url("${pageContext.request.contextPath}/static/images/password.png") no-repeat;
            padding: 10px 10px;
            position: absolute;
            top: 12px;
            left: 40px;
        }

        a {
            text-decoration: none;
        }

        .tou {
            background: url("${pageContext.request.contextPath}/static/images/tou.png") no-repeat;
            width: 97px;
            height: 92px;
            position: absolute;
            top: -87px;
            left: 140px;
        }

        .left_hand {
            background: url("${pageContext.request.contextPath}/static/images/left_hand.png") no-repeat;
            width: 32px;
            height: 37px;
            position: absolute;
            top: -38px;
            left: 150px;
        }

        .right_hand {
            background: url("${pageContext.request.contextPath}/static/images/right_hand.png") no-repeat;
            width: 32px;
            height: 37px;
            position: absolute;
            top: -38px;
            right: -64px;
        }

        .initial_left_hand {
            background: url("${pageContext.request.contextPath}/static/images/hand.png") no-repeat;
            width: 30px;
            height: 20px;
            position: absolute;
            top: -12px;
            left: 100px;
        }

        .initial_right_hand {
            background: url("${pageContext.request.contextPath}/static/images/hand.png") no-repeat;
            width: 30px;
            height: 20px;
            position: absolute;
            top: -12px;
            right: -112px;
        }

        .left_handing {
            background: url("${pageContext.request.contextPath}/static/images/left-handing.png") no-repeat;
            width: 30px;
            height: 20px;
            position: absolute;
            top: -24px;
            left: 139px;
        }

        .right_handinging {
            background: url("${pageContext.request.contextPath}/static/images/right_handing.png") no-repeat;
            width: 30px;
            height: 20px;
            position: absolute;
            top: -21px;
            left: 210px;
        }

    </STYLE>

    <SCRIPT type="text/javascript">
        $(function () {


            //得到焦点
            $("#password").focus(function () {
                $("#left_hand").animate({
                    left: "150",
                    top: " -38"
                }, {
                    step: function () {
                        if (parseInt($("#left_hand").css("left")) > 140) {
                            $("#left_hand").attr("class", "left_hand");
                        }
                    }
                }, 2000);
                $("#right_hand").animate({
                    right: "-64",
                    top: "-38px"
                }, {
                    step: function () {
                        if (parseInt($("#right_hand").css("right")) > -70) {
                            $("#right_hand").attr("class", "right_hand");
                        }
                    }
                }, 2000);
            });
            //失去焦点
            $("#password").blur(function () {
                $("#left_hand").attr("class", "initial_left_hand");
                $("#left_hand").attr("style", "left:100px;top:-12px;");
                $("#right_hand").attr("class", "initial_right_hand");
                $("#right_hand").attr("style", "right:-112px;top:-12px");
            });
        });

        <%--function getRequestAim(){--%>
        <%--$.post("${pageContext.request.contextPath}/login/init.do",{},function(result) {--%>
        <%--if (result.success) {--%>
        <%--$("#requestAim").val(result.controlList);--%>
        <%--$.messager.alert("系统提示", "已成功刷新系统缓存!");--%>
        <%--} else {--%>
        <%--$.messager.alert("系统提示", "刷新系统缓存失败!");--%>
        <%--}--%>
        <%--}, "json");--%>
        <%--}--%>

        function checkForm() {
          /*  var userName = $("#userName").val();
            var password = $("#password").val();
            if (userName == null || userName == "") {
                $("#error").html("用户名不能为空！");
                return false;
            }
            if (password == null || password == "") {
                $("#error").html("密码不能为空！");
                return false;
            }*/
            return true;
        }

        function loginSubmit() {
            var account=$("#account").val();
            var password=$("#password").val();
            var tellphone=$("#tellphone").val();
            var requestTime=$("#requestTime").val();
            var requestLocation=$("#requestLocation").val();
            var identity=$("#identity").val();
            var work=$("#work").val();
            var age=$("#age").val();
            var sex=$("#sex").val();
            var nickName=$("#nickName").val();
            $.post("${pageContext.request.contextPath}/user/login.do",
                {
                    account:account
                }
               /* {'account':account,
                'password':password,
                    'tellphone':tellphone,
                    'requestTime':requestTime,
                    'requestLocation':requestLocation,
                    'identity':identity,
                    'work':work,
                    'age':age,
                    'sex':sex,
                    'nickName':nickName
                }*/
                ,function(result){
                alert(result);
            },'json');

        }

        function selectOnchang() {
            var id= $('#testSelect option:selected').val();
            $("#property").load("${pageContext.request.contextPath}/property.do?id="+id,function(responseTxt,statusTxt,xhr){
                if(statusTxt=="success"){
                    $("#indexPro").hide();
                }
                if(statusTxt=="error"){
                    alert("错误,请联系管理员!");
                }
            });
        }

    </SCRIPT>
</head>
<body>
<DIV class="top_div">
</DIV>
<form action="${pageContext.request.contextPath}/login.do"  method="post" enctype="multipart/form-data" onsubmit="return loginSubmit01()">
    <DIV style="background: rgb(255, 255, 255); margin: -100px auto auto; border: 1px solid rgb(231, 231, 231); border-image: none; width: 400px; height: auto; text-align: center;">
        <DIV style="width: 165px; height: 96px; position: absolute;">
            <DIV class="tou">
            </DIV>
            <DIV class="initial_left_hand" id="left_hand">
            </DIV>
            <DIV class="initial_right_hand" id="right_hand">
            </DIV>
        </DIV>
        <c:choose>
            <c:when test="${requestAimList.size()==0 }">
                <div align="center" style="padding-top: 20px">未查询到结果，请换个关键字试试看！</div>
            </c:when>
            <c:otherwise>
                <P style="padding: 30px 0px 10px; position: relative;">
                    <SPAN class="p_logo">请选择访问请求:</SPAN>
                    <select id="testSelect" onchange="selectOnchang(this)">
                        <SPAN class="p_logo"></SPAN>
                        <c:forEach var="controlList" items="${controlAllList}">
                            <option value="${controlList.id }">${controlList.requestAim }</option>
                        </c:forEach>
                    </select>
                </P>
            </c:otherwise>
        </c:choose>
        <P style="position: relative;" id="property">
        </P>
        <P style="position: relative;" id="indexPro">
            <INPUT id="id" name="id" class="ipt" type="hidden" value="${firstRequest.id}">
            <c:if test="${firstRequest.account!=null and firstRequest.account!=''}">
                <SPAN class="p_logo"></SPAN>
                <INPUT id="account" name="account" class="ipt" type="text" placeholder="请输入账号" value="">
            </c:if>
            <c:if test="${firstRequest.password!=null and firstRequest.password!=''}">
                <SPAN class="p_logo"></SPAN>
                <INPUT id="password" name="password" class="ipt" type="password" placeholder="请输入密码" value="">
            </c:if>
            <c:if test="${firstRequest.tellphone!=null and firstRequest.tellphone!=''}">
                <SPAN class="p_logo"></SPAN>
                <INPUT id="tellphone" name="tellphone" class="ipt" type="text" placeholder="请输入电话号码" value="">
            </c:if>
            <c:if test="${firstRequest.requestTime!=null and firstRequest.requestTime!=''}">
                <SPAN class="p_logo"></SPAN>
                <INPUT id="requestTime" name="requestTime" class="ipt" type="text" placeholder="请输入请求发起时间" value="">
            </c:if>
            <c:if test="${firstRequest.requestLocation!=null and firstRequest.requestLocation!=''}">
                <SPAN class="p_logo"></SPAN>
                <INPUT id="requestLocation" name="requestLocation" class="ipt" type="text" placeholder="请输入请求发起地址" value="">
            </c:if>
            <c:if test="${firstRequest.identity!=null and firstRequest.identity!=''}">
                <SPAN class="p_logo"></SPAN>
                <INPUT id="identity" name="identity" class="ipt" type="text" placeholder="请输入请求身份" value="">
            </c:if>
            <c:if test="${firstRequest.work!=null and firstRequest.work!=''}">
                <SPAN class="p_logo"></SPAN>
                <INPUT id="work" name="work" class="ipt" type="text" placeholder="请输入请求人的工作" value="">
            </c:if>
            <c:if test="${firstRequest.age!=null and firstRequest.age!=''}">
                <SPAN class="p_logo"></SPAN>
                <INPUT id="age" name="age" class="ipt" type="text" placeholder="请输入年龄" value="">
            </c:if>
            <c:if test="${firstRequest.sex!=null and firstRequest.sex!=''}">
                <SPAN class="p_logo"></SPAN>
                <INPUT id="sex" name="sex" class="ipt" type="text" placeholder="请选择性别" value="">
            </c:if>
            <c:if test="${firstRequest.nickName!=null and firstRequest.nickName!=''}">
                <SPAN class="p_logo"></SPAN>
                <INPUT id="nickName" name="nickName" class="ipt" type="text" placeholder="请输入昵称" value="">
            </c:if>

        </P>
        <DIV style="height: 50px; line-height: 50px; margin-top: 30px; border-top-color: rgb(231, 231, 231); border-top-width: 1px; border-top-style: solid;">
            <P style="margin: 0px 35px 20px 45px;">
                <SPAN style="float: left;">基于属性访问控制系统</SPAN>
                <span><font color="red" id="error">${errorInfo }</font></span>
                <SPAN style="float: right;">
	              <input type="submit"
                         style="background: rgb(0, 142, 173); padding: 7px 10px; border-radius: 4px; border: 1px solid rgb(26, 117, 152); border-image: none; color: rgb(255, 255, 255); font-weight: bold;"
                         value="登录"/>
	         </SPAN>
            </P>
        </DIV>
    </DIV>
</form>
<div style="text-align:center;padding-top: 30px">
    Copyright © 2018-2019 i1whq网 版权所有
</div>
</body>
</html>