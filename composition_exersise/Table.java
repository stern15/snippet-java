package composition_exersise;

public class Table {
    private int numberStand;
    private String manufacturer;
    private TableSize originalTableSize;

    public Table(int numberStand, String manufacturer, TableSize tableSize) {
        this.numberStand = numberStand;
        this.manufacturer = manufacturer;
        this.originalTableSize = tableSize;
    }

    public int getNumberStand() {
        return numberStand;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public TableSize getSize() {
        return originalTableSize;
    }
}
