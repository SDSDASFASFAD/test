package interface_;

public class Camera implements Usb {

    @Override
    public void start() {
        System.out.println("相机开机");
    }

    @Override
    public void stop() {
        System.out.println("相机关机");
    }
}
