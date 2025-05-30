public class MediaPlayer {

    private State state;
    private String icon;

    public MediaPlayer() {
        this.state = new PausedState(); // Початковий стан
        this.icon = "play button";
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }
}
