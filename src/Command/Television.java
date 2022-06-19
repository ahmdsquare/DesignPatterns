package Command;

public class Television implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV is On!");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is Off!");
    }
}
