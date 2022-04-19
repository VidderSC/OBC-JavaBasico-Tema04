package poo.ejercicioPoo;

public class SmartPhone extends SmartDevice{

    boolean fingerPrint;
    int cameraResolution;
    int storageCapacity;

    public SmartPhone(){}

    public SmartPhone(String brand, String model, String color, double screenSize, boolean celular, String chargerType, boolean fingerPrint, int cameraResolution, int storageCapacity) {
        super(brand, model, color, screenSize, celular, chargerType);
        this.fingerPrint = fingerPrint;
        this.cameraResolution = cameraResolution;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "fingerPrint=" + fingerPrint +
                ", cameraResolution=" + cameraResolution +
                ", storageCapacity=" + storageCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", screenSize=" + screenSize +
                ", celular=" + celular +
                ", chargerType='" + chargerType + '\'' +
                '}';
    }
}
