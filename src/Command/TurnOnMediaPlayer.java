package Command;

public class TurnOnMediaPlayer implements Command {

    private MediaPlayer mp;

    public TurnOnMediaPlayer(MediaPlayer mp) {
        this.mp = mp;
    }

    @Override
    public void execute() {
        this.mp.turnOn();
    }

}
