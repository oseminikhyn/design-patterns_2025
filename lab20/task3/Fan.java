public class Fan {

    private FanState state;

    public Fan() {
        this.state = new LowState(); // Початковий стан
    }

    public void setState(FanState state) {
        this.state = state;
    }

    public void turnUp() {
        state.turnUp(this);
    }

    public void turnDown() {
        state.turnDown(this);
    }
}
