package composition_exersise;

public class Walls {
    private int numWalls;
    private String colorWalls;
    private String direction;

    public Walls(int numWalls, String colorWalls,String direction) {
        this.numWalls = numWalls;
        this.colorWalls = colorWalls;
        this.direction = direction;
    }

    public int getNumWalls() {
        return numWalls;
    }

    public String getColorWalls() {
        return colorWalls;
    }

    public String getDirection() {
        return direction;
    }
}
