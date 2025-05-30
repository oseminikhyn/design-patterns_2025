public class Radio implements Device {

    private int volume;
    private double frequency;
    private boolean isOn;

    public Radio() {
        this.isOn = false;
        this.volume = 10;
        this.frequency = 101.1;
        DeviceRegistry.register(this);
    }

    @Override
    public void on() {
        if (isOn) return;
        System.out.println("Radio is on");
        isOn = true;
    }

    @Override
    public void off() {
        if (!isOn) return;
        System.out.println("Radio is off");
        isOn = false;
    }

    @Override
    public void volumeUp() {
        if (!isOn) return;
        volume++;
        System.out.println("Radio volume = " + volume);
    }

    @Override
    public void volumeDown() {
        if (!isOn) return;
        volume--;
        System.out.println("Radio volume = " + volume);
    }

    @Override
    public void nextChanel() {
        if (!isOn) return;
        frequency += 0.1;
        System.out.println("Radio frequency = " + frequency);
    }

    @Override
    public void prevChanel() {
        if (!isOn) return;
        frequency -= 0.1;
        System.out.println("Radio frequency = " + frequency);
    }
}