public class PausedState implements State {
    @Override
    public void play(MediaPlayer player) {
        player.setState(new PlayingState());
        player.setIcon("pause button");
        System.out.println("Video playing, icon set to " + player.getIcon());
    }

    @Override
    public void pause(MediaPlayer player) {
        // already paused, do nothing
    }
}
