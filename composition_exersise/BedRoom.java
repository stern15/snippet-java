package composition_exersise;

public class BedRoom {
    private String name;
    private Table theTable;
    private Bed theBed;
    private Walls theWalls1;
    private Walls theWalls2;
    private Walls theWalls3;
    private Walls theWalls4;
    private Light theLight;

    public BedRoom(String name, Table theTable, Bed theBed, Walls theWalls1, Walls theWalls2, Walls theWalls3, Walls theWalls4, Light theLight) {
        this.name = name;
        this.theTable = theTable;
        this.theBed = theBed;
        this.theWalls1 = theWalls1;
        this.theWalls2 = theWalls2;
        this.theWalls3 = theWalls3;
        this.theWalls4 = theWalls4;
        this.theLight = theLight;
    }

    public void numberOfTableStand(){
        System.out.println("the number of the table stand is "+getTheTable().getNumberStand());
        widthOfBed();

    }
    public void widthOfBed(){
        System.out.println("the width of the bed is "+this.theBed.getOriginalBedSize().getWidth());
    }
    public void makeBed(){
        System.out.println("bedroom --> make");
        this.theBed.make();
    }

    public void turningLight(){
        getTheLight().turnOn();
    }

    private String getName() {
        return name;
    }

    private Table getTheTable() {
        return theTable;
    }

    private Bed getTheBed() {
        return theBed;
    }

    public Walls getTheWalls1() {
        return theWalls1;
    }

    public Walls getTheWalls2() {
        return theWalls2;
    }

    public Walls getTheWalls3() {
        return theWalls3;
    }

    public Walls getTheWalls4() {
        return theWalls4;
    }

    private Light getTheLight() {
        return theLight;
    }
}
