import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Tile {
    BoundingBox boundingBox;
    int xNumber;
    int yNumber;
    public static ArrayList<BufferedImage> images = new ArrayList<>();
    public STATE state = STATE.WATER;
    enum STATE{
        WATER, GRASS, AIR;
    }



    public Tile(Vec2 xyMin, Vec2 xyMax, int xNumber, int yNumber){
        this.boundingBox = new BoundingBox(xyMin.x, xyMin.y, xyMax.x, xyMax.y);
        this.xNumber = xNumber;
        this.yNumber = yNumber;
    }

}
