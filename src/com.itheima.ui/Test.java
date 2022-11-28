package com.itheima.ui;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame gameJFrame = new JFrame();
        //javaBean类描述界面的属性 宽 高等行为
        /*
        * 上下左右移动的代码逻辑
        * 统计步数的代码逻辑
        * 一键通关的代码逻辑
        * 查看最终效果
        *
        * */
        gameJFrame.setSize(603,680);
        //界面默认隐藏
        gameJFrame.setVisible(true);

        /*
        * 获取一个登录界面
        * 获取输入的用户名和密码
        * 获取验证码
        * 比较用户名 密码 验证码
        *
        * */
        JFrame loginJFrame = new JFrame();
        loginJFrame.setSize(488,430);
        //界面默认隐藏
        loginJFrame.setVisible(true);

        /*
        * 创建一个注册界面
        * 获取用户名
        * 获取密码
        * 获取验证码
        * 比较2次输入密码是否一致
        * 判断当前用户是否已注册
        * */
        JFrame registerJFrame = new JFrame();
        registerJFrame.setSize(488,500);
        //界面默认隐藏
        registerJFrame.setVisible(true);
    }
}
