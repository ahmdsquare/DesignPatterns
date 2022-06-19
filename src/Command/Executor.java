package Command;

public class Executor {
    final static int TV_SLOT = 0;
    final static int MP_SLOT = 1;

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Television tv = new Television();
        MediaPlayer mp = new MediaPlayer();

        TurnOnTelevision turnOnTelevision = new TurnOnTelevision(tv);
        TurnOffTelevision turnOffTelevision = new TurnOffTelevision(tv);

        remoteControl.addCommand(TV_SLOT, turnOnTelevision, turnOffTelevision);

        remoteControl.onButtonPressed(TV_SLOT);
        remoteControl.offButtonPressed(TV_SLOT);

        TurnOffMediaPlayer turnOffMediaPlayer = new TurnOffMediaPlayer(mp);
        TurnOnMediaPlayer turnOnMediaPlayer = new TurnOnMediaPlayer(mp);

        remoteControl.addCommand(MP_SLOT, turnOnMediaPlayer, turnOffMediaPlayer);

        remoteControl.onButtonPressed(MP_SLOT);
        remoteControl.offButtonPressed(MP_SLOT);
    }
}
