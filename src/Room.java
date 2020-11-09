public class Room {
    private double length;
    private double width;
    private Furniture furniture;

    public Room(double length, double width, Furniture furniture) {
        this.length = length;
        this.width = width;
        this.furniture = furniture;
    }

    public void changeBedColor(String newColor) {
        this.furniture.getCurrentBed().getColor();
    }
}
