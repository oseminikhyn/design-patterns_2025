public class PausedState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("Resumed: " + player.getCurrentTrack());
        player.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayer player) {
        System.out.println("Already paused.");
    }

    @Override
    public void stop(MediaPlayer player) {
        System.out.println("Stopped from pause.");
        player.setState(new StoppedState());
    }

    @Override
    public void next(MediaPlayer player) {
        System.out.println("Can't go next while paused.");
    }

    @Override
    public void prev(MediaPlayer player) {
        System.out.println("Can't go back while paused.");
    }
}
