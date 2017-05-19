<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>basic</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/black/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="/ui/cms.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/cms.js"></script>
</head>
<body>

<div style="width: 900px;height: auto;margin: 0 auto">
    <div class="messager-body" style="width: auto;height: auto;margin: 0 auto">
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label for="number" >学&nbsp;&nbsp;号&nbsp;&nbsp;&nbsp;</label>
                <input id="number" class="easyui-textbox" style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label for="username" >姓&nbsp;&nbsp;名&nbsp;&nbsp;&nbsp;</label>
                <input id="username" class="easyui-textbox" style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label>性&nbsp;&nbsp;别&nbsp;&nbsp;&nbsp;</label>
                <input type="radio" name="sex" value="男">男&nbsp;&nbsp;
                <input type="radio" name="sex" value="女">女&nbsp;&nbsp;
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label>班&nbsp;&nbsp;级&nbsp;&nbsp;&nbsp;</label>
                <input id="classs" name="classs" class="easyui-textbox" style="width: 300px;height: 32px">
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label for="email" >邮&nbsp;&nbsp;箱&nbsp;&nbsp;&nbsp;</label>
                <input id="email" class="easyui-textbox" style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label for="phone" >手机号&nbsp;&nbsp;&nbsp;</label>
                <input id="phone" class="easyui-textbox" style="width: 300px;height: 32px"/>
            </p>
        </div>
        <div class="messager-input" style="height: 56px; margin: 10px;">
            <p align="center" style="font-size: 14px;">
                <label>签&nbsp;&nbsp;名&nbsp;&nbsp;&nbsp;</label>
                <input id="signature" name="signature" class="easyui-textbox" style="width: 300px;height: 32px">
            </p>
        </div>
        <div class="messager-button" style="height: 56px; margin: 10px;">
            <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="subNewUser()">
                <span style="font-size: 14px">保存</span>
            </a>
        </div>
    </div>
</div>
</body>
</html>
