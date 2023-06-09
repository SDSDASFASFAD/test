package TankWorld.Tank;

public abstract class Tank {
    private int x ;
    private int y ;
    private int direction;
    private int speed;
    private boom_list boom_list;
//    private boolean shoot;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void moveUp(){
        y-=speed;
    }

    public void moveDown(){
        y+=speed;
    }

    public void moveLeft(){
        x-=speed;
    }

    public void moveRight(){
        x+=speed;
    }

    public TankWorld.Tank.boom_list getBoom_list() {
        return boom_list;
    }

    //    public Tank(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }

//    public boolean isShoot() {
//        return shoot;
//    }

//    public void setShoot(boolean shoot) {
//        this.shoot = shoot;
//    }

//    public Tank(int x, int y, int direction) {
//        this.x = x;
//        this.y = y;
//        this.direction = direction;
//    }

    public Tank(int x, int y, int direction, int speed) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.speed = speed;
        this.boom_list = new boom_list();
        this.boom_list.start();
    }
}
