package composition_exersise;

public class Light {
    private String manufacturer;
    private int voltage;
    private String style;
    private boolean hasBattery;

    public Light(String manufacturer, int voltage, String style, boolean hasBattery) {
        this.manufacturer = manufacturer;
        this.voltage = voltage;
        this.style = style;
        this.hasBattery = hasBattery;
    }
    public void turnOn(){
        System.out.println("turning on the light");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getVoltage() {
        return voltage;
    }

    public String getStyle() {
        return style;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }
}
