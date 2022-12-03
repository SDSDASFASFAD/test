package TankWorld.Tank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class MyPanel extends JPanel implements KeyListener ,Runnable{

    MyTank myTank ;

    Vector<EnemyTank> enemyTanks;

    int enemyTankNums = 3;

    public MyPanel(){

        this.myTank = new MyTank(100,100);
        this.myTank.setSpeed(10);

        enemyTanks = new Vector<EnemyTank>();

        for (int i = 0; i < enemyTankNums; i++) {
            enemyTanks.add(new EnemyTank(100*(i+1),0,2));
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // 填充矩形，默认黑色
        g.fillRect(0,0,1000,750);

        drawTank(myTank.getX(),myTank.getY(),g,myTank.getDirection(),0);

        for (EnemyTank enemyTank : enemyTanks) {
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirection(),1);
        }


        for (int i = 0 ; i < myTank.getBoom_list().get_size() ; i++){
            boom boom = myTank.getBoom_list().get_boom(i);
            g.setColor(Color.CYAN);
            g.fill3DRect(boom.getX(),boom.getY(),5,5,false);
        }


    }

    /**
     *
     * @param x 横坐标
     * @param y 纵坐标
     * @param g  画笔
     * @param direction 坦克方向（上下左右）
     * @param type 坦克类型
     */
    public void drawTank(int x, int y , Graphics g , int direction ,int type){
        switch (type){
            case 0:
                g.setColor(Color.CYAN);
                break;
            case 1:
                g.setColor(Color.ORANGE);
                break;
        }

        // 根据坦克方向绘制对应形状的坦克
        // direct 表示方向(0:向上,1：向右,2：向下,3:向左)
        switch (direction){
            case  0:
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y,x+20,y+30);
                break;
            case 1:
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y+30,60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                g.drawLine(x+30,y+20,x+60,y+20);
                break;
            case 2:
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y+30,x+20,y+60);
                break;
            case 3:
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y+30,60,10,false);
                g.fill3DRect(x+10,y+10,40,20,false);
                g.fillOval(x+20,y+10,20,20);
                g.drawLine(x+30,y+20,x,y+20);
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

//    public void draw_boom(boom boom ,Graphics g ,int type){
//        System.out.println("画出炮弹");
//
//        switch (type){
//            case 0:
//                g.setColor(Color.CYAN);
//                break;
//            case 1:
//                g.setColor(Color.ORANGE);
//                break;
//        }
//
//        switch (boom.getDirection()) {
//            case 0:
//                g.fillOval(boom.getX()+20,boom.getY()+30,100,100);
//                break;
//            case 1:
//                g.fillOval(boom.getX()+60,boom.getY()+20,100,100);
//                break;
//            case 2:
//                g.fillOval(boom.getX()+20,boom.getY()+60,100,100);
//                break;
//            case 3:
//                g.fillOval(boom.getX()+00,boom.getY()+20,100,100);
//                break;
//            default:
//                System.out.println("暂时没有处理");
//        }
//    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_S){
            myTank.moveDown();
            myTank.setDirection(2);
        }else if(e.getKeyCode() == KeyEvent.VK_W){
            myTank.moveUp();
            myTank.setDirection(0);
        }else if(e.getKeyCode() == KeyEvent.VK_A){
            myTank.moveLeft();
            myTank.setDirection(3);
        }else if(e.getKeyCode() == KeyEvent.VK_D){
            myTank.moveRight();
            myTank.setDirection(1);
        }

//        if (e.getKeyCode() == KeyEvent.VK_J){
//            System.out.println("J被按下");
//            myTank.setShoot(true);
//        }

          if (e.getKeyCode() == KeyEvent.VK_J){
              myTank.shoot();
          }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("重绘");
            this.repaint();
        }
    }
}
