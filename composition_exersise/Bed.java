package composition_exersise;

public class Bed {
    private String manufacturer;
    private BedSize originalBedSize;
    private String color;



    public Bed(String manufacturer, BedSize originalBedSize, String color) {
        this.manufacturer = manufacturer;
        this.originalBedSize = originalBedSize;
        this.color = color;

    }
    public void make(){
        System.out.println("the bed --> making");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public BedSize getOriginalBedSize() {
        return originalBedSize;
    }
    public String getColor() {
        return color;
    }

}
