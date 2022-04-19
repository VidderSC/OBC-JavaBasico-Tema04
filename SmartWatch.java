package poo.ejercicioPoo;

public class SmartWatch extends SmartDevice{

    String strapMaterial;
    boolean sportModel;

    public SmartWatch(){}

    public SmartWatch(String brand, String model, String color, double screenSize, boolean celular, String chargerType, String strapMaterial, boolean sportModel) {
        super(brand, model, color, screenSize, celular, chargerType);
        this.strapMaterial = strapMaterial;
        this.sportModel = sportModel;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "strapMaterial='" + strapMaterial + '\'' +
                ", sportModel=" + sportModel +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", screenSize=" + screenSize +
                ", celular=" + celular +
                ", chargerType='" + chargerType + '\'' +
                '}';
    }
}
