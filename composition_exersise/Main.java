package composition_exersise;

public class Main {
    public static void main(String args[]){
        TableSize tableSizeObj = new TableSize(40,20,10);
        Table tableObj = new Table(4,"Ikea",tableSizeObj);

        BedSize bedSizeObj = new BedSize(8,6);
        Bed bedObj = new Bed("ike",bedSizeObj,"black");

        Walls walls1Obj = new Walls(4,"green","north");
        Walls walls2Obj = new Walls(4,"green","south");
        Walls walls3Obj = new Walls(4,"green","west");
        Walls walls4Obj = new Walls(4,"green","east");

        Light lightObj = new Light("Philips",240,"tube style",false);

        BedRoom bedRoomObj = new BedRoom("Stern's room",tableObj,bedObj,walls1Obj,walls2Obj,walls3Obj,walls4Obj,lightObj);

        bedRoomObj.numberOfTableStand();
        bedRoomObj.makeBed();
        bedRoomObj.turningLight();
    }
}
