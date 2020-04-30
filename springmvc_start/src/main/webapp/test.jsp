<%--
  Created by IntelliJ IDEA.
  User: lixiaoxu
  Date: 2020/4/29
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="helloController/saveUser" method="post">
        用户姓名：<input type="text" name="name" /><br/>
        用户年龄：<input type="text" name="age" /><br/>
        用户生日：<input type="text" name="birthday" /><br/>
        <input type="submit" value="提交" />
    </form>

    <form action="helloController/testModelAttribute" method="post">
        用户姓名：<input type="text" name="name" /><br/>
        用户年龄：<input type="text" name="age" /><br/>
        <input type="submit" value="提交" />
    </form>

</body>
</html>
