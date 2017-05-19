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
    <table id="dg" title="班级文件管理表" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            url:'/classsFile/list',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="filename" width="50">文件名</th>
            <th field="classs" width="50">班级</th>
            <th field="action" width="50">操作</th>
        </tr>
        </thead>
    </table>
</div>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newFile()">新建</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editFile()">编辑</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyFile()">删除</a>
</div>
<div id="fileDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#file-buttons">
    <div class="ftitle">班级文件管理</div>
    <form id="fm" method="post" enctype="multipart/form-data">
        <div class="fitem">
            <label>文件名&nbsp;&nbsp;&nbsp;</label>
            <input name="filename" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>班级&nbsp;&nbsp;&nbsp;</label>
            <input name="classs" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>文件&nbsp;&nbsp;&nbsp;</label>
            <input name="file" type="file">
        </div>
    </form>
</div>
<div id="file-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveFile()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#fileDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
