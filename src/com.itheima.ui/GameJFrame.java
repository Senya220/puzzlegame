package com.itheima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //JFrame  界面  窗口
    //GameJFrame是游戏的主界面  所有主界面相关的写这里
    private int width = 603;
    private int height = 680;

    public GameJFrame(){
        initJFrame();
        initJMenuBar();
        //添加图片  alt+enter->快速创建方法
        initImage();

        //设置窗口可见
        this.setVisible(true);
    }

    private void initImage() {
        int number = 1;
        for (int i = 0; i < 3; i++) {
            //内循环 一行添加3张图片
            for (int j = 0; j < 3; j++) {
                //创建imageIcon
                //创建Jlabel
                JLabel jLabel = new JLabel(new ImageIcon("jetbrains://idea/navigate/reference?project=puzzlegame&path=picture" + number + ".png"));
                //指定图片位置
                jLabel.setBounds(105*j,105*i,105,105);
                //把管理容器添加到界面
                //创建JFrame时就存在一个隐藏的容器Pane
                //this.setLayout(null) ->取消居中显示，才会按照XY轴设置显示
                //JFrame.java -> frameInit -> setRootPane(createRootPane());
                this.getContentPane().add(jLabel);
                number ++;
            }
        }
    }

    private void initJMenuBar() {
        //初始化菜单
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单上的两个选项的对象  功能  关于我们
        JMenu functionMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("关于我们");
        //创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");
        JMenuItem accountItem = new JMenuItem("公众号");
        //将每一个选项下面的条目添加到选项中
        functionMenu.add(replayItem);
        functionMenu.add(reLoginItem);
        functionMenu.add(closeItem);

        aboutMenu.add(accountItem);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);

        jMenuBar.add(functionMenu);
        jMenuBar.add(aboutMenu);
    }

    private void initJFrame() {
        //设置顶层
//        this.setAlwaysOnTop(true);
        //设置居中
        this.setLocationRelativeTo(null);
        //关闭界面(jvm也关闭)
        this.setDefaultCloseOperation(3);
        this.setSize(width, height);
        //设置界面标题
        this.setTitle("拼图version 1.1");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置默认的关闭方式
        //ctrl+b查看源码
        //public interface WindowConstants.java 查看关闭模式
       //3  关闭一个窗口就会关闭所有窗口且jvm也会停止
        this.setDefaultCloseOperation(3);
//        //与上面的参数3等同
//        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //取消默认的居中方式，才会按照XY的坐标形式显示
        this.setLayout(null);
    }


}
