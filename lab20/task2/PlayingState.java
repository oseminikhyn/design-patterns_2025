public class PlayingState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Already playing: " + player.getCurrentTrack());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Paused: " + player.getCurrentTrack());
        player.setState(new PausedState());
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Stopped playing.");
        player.setState(new StoppedState());
    }

    @Override
    public void next(MediaPlayer player) {
        if (player.getCurrentTrackNum() < player.getTracks().size() - 1) {
            player.setTrackNum(player.getCurrentTrackNum() + 1);
        }
        System.out.println("Playing next: " + player.getCurrentTrack());
    }

    @Override
    public void prev(MediaPlayer player) {
        if (player.getCurrentTrackNum() > 0) {
            player.setTrackNum(player.getCurrentTrackNum() - 1);
        }
        System.out.println("Playing previous: " + player.getCurrentTrack());
    }
}
