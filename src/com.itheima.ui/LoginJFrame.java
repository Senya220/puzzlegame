package com.itheima.ui;

import javax.swing.*;


public class LoginJFrame extends JFrame {
    //LoginJFrame相关的都写这里
    private int width = 488;
    private int height = 430;

    public LoginJFrame(){
        this.setSize(width,height);
        this.setTitle("拼图 login");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置默认的关闭方式
        //ctrl+b查看源码
        //public interface WindowConstants.java 查看关闭模式
        this.setDefaultCloseOperation(3);
//        //与上面的参数3等同
//        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //设置窗口可见
        this.setVisible(true);
    }
}
