<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/3
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户登录</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/messages_zh.js"></script>
    <script type="text/javascript">

        $(function(){
            $("#myform").validate({
                submitHandler : function() {
                    //提交Ajax
                    $.ajax({
                        data : $("#myform").serialize(),
                        dataType : "json",
                        type : "post",
                        url : "${pageContext.request.contextPath }/user/login",
                        success : function(rec) {
                            if(rec!=null){
                                location.href = "http://localhost:82/shop/index";
                            }else{
                                alert("用户名或密码错误!");
                            }
                        }
                    });
                }

            });
        });
    </script>

</head>
<body bgcolor="antiquewhite">
<p style="font-size: 30px;font-style: italic;color: brown;"align="center">
    用户登录
</p>
<form id="myform" >
    <table align="center">
        <tr>
            <td align="right">
                用户名:
            </td>
            <td align="left">
                <input type="text" name="username"/>
            </td>
        </tr>
        <tr>
            <td align="right">
                密码:
            </td>
            <td align="left">
                <input type="password" name="password"/>
            </td>

    </table>
    </table>
    <br />
    <div align="center">
        <input type="reset" value="重置" />
        <input type="submit" value="登录" />
    </div>
</form>
<br />
<div align="center">
    <a href="${pageContext.request.contextPath }/toindex">返回首页</a>
</div>
</body>
</html>
