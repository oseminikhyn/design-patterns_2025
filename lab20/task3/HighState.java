public class HighState implements FanState {
    @Override
    public void turnUp(Fan fan) {
        System.out.println("Fan is already on high");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new MediumState());
        System.out.println("Fan is on medium");
    }
}
