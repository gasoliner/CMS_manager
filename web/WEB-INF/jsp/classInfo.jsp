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
    <table id="dg" title="班级简介管理表" class="easyui-datagrid" style="width: 100%;height:auto"
           toolbar="#toolbar"
           fitColumns="true" singleSelect="true" pagination="true"
           data-options="rownumbers:true,
            url:'/classsInfo/list',
            method:'get',
            pageSize:15,
            pageList:[5,10,15,20,25]">
        <thead>
        <tr>
            <th field="classs" width="50">班级</th>
            <th field="teacher" width="50">班主任</th>
            <th field="countpeople" width="50">人数</th>
            <th field="info" width="50">班级简介</th>
        </tr>
        </thead>
    </table>
</div>
<div id="toolbar">
    <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newClasssInfo()">新建</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editClasssInfo()">编辑</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyClasssInfo()">删除</a>
</div>
<div id="classsInfoDialog" class="easyui-dialog" style="width:500px;height:550px;padding:10px 20px"
     closed="true" buttons="#classsInfoForm-buttons">
    <div class="ftitle">班级简介管理表</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>班级&nbsp;&nbsp;&nbsp;</label>
            <input name="classs" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>班主任&nbsp;&nbsp;&nbsp;</label>
            <input name="teacher" class="easyui-validatebox">
        </div><br/>
        <div class="fitem">
            <label>人数&nbsp;&nbsp;&nbsp;</label>
            <input name="countpeople">
        </div><br/>
        <div class="fitem">
            <label>班级简介&nbsp;&nbsp;&nbsp;</label>
            <textarea id="info" name="info" class="textareaComment"></textarea>
        </div>
    </form>
</div>
<div id="classsInfoForm-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveClasssInfo()">保存</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#classsInfoDialog').dialog('close')">取消</a>
</div>
<div>
    <form id="dfm" method="post">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>
</body>
</html>
