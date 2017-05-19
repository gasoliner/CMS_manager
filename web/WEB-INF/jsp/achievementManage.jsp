<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>achievement</title>
    <link rel="stylesheet" type="text/css" href="/ui/themes/black/easyui.css">
    <link rel="stylesheet" type="text/css" href="/ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="/ui/demo/demo.css">
    <link rel="stylesheet" type="text/css" href="/ui/cms.css">
    <script type="text/javascript" src="/ui/jquery.min.js"></script>
    <script type="text/javascript" src="/ui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/ui/cms.js"></script>
    <script type="text/javascript">
        function scoreChange() {

            var sum = Number($("#chinese").val())
                        +Number($("#math").val())
                        +Number($("#english").val())
                        +Number($("#wuli").val())
                        +Number($("#hauxue").val())
                        +Number($("#shengwu").val())
                        +Number($("#lishi").val())
                        +Number($("#zhengzhi").val())
                        +Number($("#dili").val());
            $("#sum").val(sum);
        };
    </script>
</head>
<body>
<div align="center">
    <table id="dg" title="成绩管理相关表" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            url:'/achievement/list',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="username" width="50">姓名</th>
            <th field="classs" width="50">班级</th>
            <th field="chinese" width="50">语文</th>
            <th field="math" width="50">数学</th>
            <th field="english" width="50">英语</th>
            <th field="lishi" width="50">历史</th>
            <th field="zhengzhi" width="50">政治</th>
            <th field="dili" width="50">地理</th>
            <th field="wuli" width="50">物理</th>
            <th field="hauxue" width="50">化学</th>
            <th field="shengwu" width="50">生物</th>
            <th field="sum" width="50">总分</th>
        </tr>
        </thead>
    </table>
</div>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newAchievement()">新建</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editAchievement()">编辑</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyAchievement()">删除</a>
</div>
<div id="achievementDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#achievementForm-buttons">
    <div class="ftitle">基本素质评分信息</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>姓名&nbsp;&nbsp;&nbsp;</label>
            <input name="username">
        </div><br/>
        <div class="fitem">
            <label>班级&nbsp;&nbsp;&nbsp;</label>
            <input name="classs">
        </div><br/>
        <div class="fitem">
            <label>语文&nbsp;&nbsp;&nbsp;</label>
            <input name="chinese" id="chinese" onchange="scoreChange()">
        </div><br/>
        <div class="fitem">
            <label>数学&nbsp;&nbsp;&nbsp;</label>
            <input id="math" name="math" onchange="scoreChange()">
        </div><br/>
        <div class="fitem">
            <label>英语&nbsp;&nbsp;&nbsp;</label>
            <input id="english" name="english" onchange="scoreChange()">
        </div><br/>
        <div class="fitem">
            <label>历史&nbsp;&nbsp;&nbsp;</label>
            <input id="lishi" name="lishi" onchange="scoreChange()">
        </div><br/>
        <div class="fitem">
            <label>政治&nbsp;&nbsp;&nbsp;</label>
            <input id="zhengzhi" name="zhengzhi" onchange="scoreChange()">
        </div><br/>
        <div class="fitem">
            <label>地理&nbsp;&nbsp;&nbsp;</label>
            <input id="dili" name="dili" onchange="scoreChange()">
        </div><br/>
        <div class="fitem">
            <label>物理&nbsp;&nbsp;&nbsp;</label>
            <input id="wuli" name="wuli" onchange="scoreChange()">
        </div><br/>
        <div class="fitem">
            <label>化学&nbsp;&nbsp;&nbsp;</label>
            <input id="hauxue" name="hauxue" onchange="scoreChange()">
        </div><br/>
        <div class="fitem">
            <label>生物&nbsp;&nbsp;&nbsp;</label>
            <input id="shengwu" name="shengwu" onchange="scoreChange()">
        </div><br/>
        <div class="fitem">
            <label>总分&nbsp;&nbsp;&nbsp;</label>
            <input id="sum" name="sum">
        </div>
    </form>
</div>
<div id="achievementForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveAchievement()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#achievementDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
