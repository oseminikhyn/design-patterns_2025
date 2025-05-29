import com.mobile.Legacy.MicroUsbCharger;

public class AdapterTypeCToMicroUsb implements MicroUsbCharger {
    private final TypeCCharger typeCCharger;

    public AdapterTypeCToMicroUsb(TypeCCharger typeCCharger) {
        this.typeCCharger = typeCCharger;
    }

    @Override
    public float getOutputVoltage() {
        return 5.0f;
    }

    @Override
    public float getOutputAmperage() {
        return typeCCharger.getOutputPower() / getOutputVoltage();
    }
}