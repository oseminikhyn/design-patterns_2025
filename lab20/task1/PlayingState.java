public class PlayingState implements State {
    @Override
    public void play(MediaPlayer player) {
        // already playing, do nothing
    }

    @Override
    public void pause(MediaPlayer player) {
        player.setState(new PausedState());
        player.setIcon("play button");
        System.out.println("Video paused, icon set to " + player.getIcon());
    }
}
