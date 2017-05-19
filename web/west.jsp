<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style type="text/css">
    .menu-last{
        margin-bottom: 5px;
    }
</style>
<body>
<div class="easyui-accordion" style="width:auto;height: 350px;border: 0px;">
    <div title="班级管理" iconCls="icon-cog" style="overflow: auto;padding: 10px;">
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('班级简介管理','UI/classInfo')">班级简介管理</a><br/>
        </div>
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('班级通知管理','UI/classTongZhi')">班级通知管理</a><br/>
        </div>
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('班级文件管理','UI/classFile')">班级文件管理</a><br/>
        </div>
    </div>
    <div title="我的资料管理" iconCls="icon-mini-edit" selected="true" style="padding:10px;">
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('密码修改','UI/updatePass')">&nbsp;&nbsp;密&nbsp;码&nbsp;修&nbsp;改&nbsp;</a>
        </div>
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('个人资料修改','UI/personalInfo')">个人资料修改</a>
        </div>
    </div>
    <div title="成绩管理" iconCls="icon-computer" style="overflow:auto;padding:10px;">
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('成绩管理','UI/achievementManage')">成绩管理</a>
        </div>
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('成绩录入','UI/achievementAdd')">成绩录入</a>
        </div>
    </div>
    <div title="人员管理" iconCls="icon-man" style="overflow: auto;padding: 10px;">
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('用户列表','UI/userList')">用户列表</a>
        </div>
        <div class="menu-last">
            <a href="#" class="easyui-linkbutton" onclick="addTab('用户添加','UI/userAdd')">用户添加</a>
        </div>
    </div>
</div>
</body>
