package composition_exersise;

public class TableSize {
    private int height;
    private int depth;
    private int width;

    public TableSize(int height, int depth, int width) {
        this.height = height;
        this.depth = depth;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public int getWidth() {
        return width;
    }
}
