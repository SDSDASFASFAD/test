package TankWorld.Tank;

public class EnemyTank extends Tank{
//    public EnemyTank(int x, int y) {
//        super(x, y);
//    }
//
    public EnemyTank(int x, int y, int direction) {
        super(x, y, direction,10);
    }

    public EnemyTank(int x, int y, int direction, int speed) {
        super(x, y, direction, speed);
    }
}
