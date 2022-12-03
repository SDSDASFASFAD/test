package TankWorld.Tank;

public class boom {

    private int x;

    private int y;

    private int direction ;

    private int speed ;

    private boolean survive = true;

    public boom(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.speed = 10;
    }

    public boom(int x, int y, int direction, int speed) {
        this.x = x;
        this.y = y;
        this.direction = direction;
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

    public int getSpeed() {
        return speed;
    }

    public boolean isSurvive() {
        return survive;
    }

    public void setSurvive(boolean survive) {
        this.survive = survive;
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

    public boom clone(){
        return this.clone();
    }

}
