package Command;

public class TurnOffMediaPlayer implements Command {

    private MediaPlayer mp;

    public TurnOffMediaPlayer(MediaPlayer mp) {
        this.mp = mp;
    }

    @Override
    public void execute() {
        this.mp.turnOff();
    }

}
