package Command;

public class MediaPlayer implements Device {
    @Override
    public void turnOn() {
        System.out.println("MediaPlayer is On!");
    }

    @Override
    public void turnOff() {
        System.out.println("MediaPlayer is Off!");
    }
}
