package TankWorld.Tank;

public class MyTank extends Tank{

    private boom boom;

    public TankWorld.Tank.boom getBoom() {
        return boom;
    }

    public void shoot(){
        switch (this.getDirection()){
            case 0:
                boom = new boom(this.getX()+20,this.getY(),0,10);
                break;
            case 1:
                boom = new boom(this.getX()+60,this.getY()+20,1,10);
                break;
            case 2:
                boom = new boom(this.getX()+20,this.getY()+60,2,10);
                break;
            case 3:
                boom = new boom(this.getX(),this.getY()+20,3,10);
                break;
            default:
                System.out.println("暂时没有处理");
        }

        boom.start();
    }

    public MyTank(int x, int y ) {
        super(x, y);
    }

}
