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
<div align="center">
    <table id="dg" title="班级通知管理" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            url:'/classsNotice/list',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="title" width="50">标题</th>
            <th field="content" width="50">正文</th>
            <th field="classs" width="50">班级</th>
        </tr>
        </thead>
    </table>
</div>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newClasssNotice()">新建</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editClasssNotice()">编辑</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyClasssNotice()">删除</a>
</div>
<div id="noticeDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#basicForm-buttons">
    <div class="ftitle">基本素质评分信息</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>标题&nbsp;&nbsp;&nbsp;</label>
            <input name="title" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>班级&nbsp;&nbsp;&nbsp;</label>
            <input name="classs">
        </div><br/>
        <div class="fitem">
            <label>正文&nbsp;&nbsp;&nbsp;</label><br/>
            <textarea name="content" style="resize: none;width: 350px;height: 500px;max-width: 350px;max-height: 500px;"></textarea>
        </div>
    </form>
</div>
<div id="basicForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveClasssNotice()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#noticeDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
