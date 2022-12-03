package TankWorld.draw;

import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;

/**
 * 演示如何在面板上画出图形
 */
public class DrawCircle  extends  JFrame{

    private  MyPanel mp = null ;

    public DrawCircle() {
        // 初始化面板
        this.mp = new MyPanel();
        // 把面板放入到窗口(画框)
        this.add(mp);
        // 设置窗口的大小
        this.setSize(1920,1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new DrawCircle();

    }
}

// 1.先定义一个面板myPanel,继承JPanel类,画图形,就在面板上
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawOval(0,0,1000,1000);
    }
}
