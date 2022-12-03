package TankWorld.Tank;

import javax.swing.*;

public class TankGame01 extends JFrame {

    MyPanel mp ;

    public TankGame01(){

        this.mp = new MyPanel();

        Thread thread = new Thread(mp);

        thread.start();

        this.add(mp);

        this.setSize(1000,750);

        this.addKeyListener(mp);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }

    public static void main(String[] args) {

        TankGame01 tankGame01 = new TankGame01();
    }


}
