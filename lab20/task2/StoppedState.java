public class StoppedState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Started playing: " + player.getCurrentTrack());
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Can't pause. Player is stopped.");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Already stopped.");
    }

    @Override
    public void next(MediaPlayer player) {
        System.out.println("Can't skip while stopped.");
    }

    @Override
    public void prev(MediaPlayer player) {
        System.out.println("Can't go back while stopped.");
    }
}
