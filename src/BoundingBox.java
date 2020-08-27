public class BoundingBox {
    Vec2 min;
    Vec2 max;

    enum COLLISION {
        UPPER, UNDER, RIGHT, LEFT, NOTHING
    };


    public BoundingBox(float minX, float minY, float maxX, float maxY){
        this.min = new Vec2(minX, minY);
        this.max = new Vec2(maxX, maxY);
    }


    //
    public COLLISION checkCollision(BoundingBox b){
        if (min.x <= b.max.x && max.x >= b.min.x && max.y >= b.min.y && min.y <= b.max.y){

            System.out.println("Upper-Collision");
            return COLLISION.UPPER;
        }

        if (b.checkCollision(this) == COLLISION.UPPER){
            System.out.println("Lower-Collision");
            return COLLISION.UNDER;

        }

        if (max.x >= b.min.x && min.y <= b.max.y && min.x <= b.min.y && max.y >= b.min.y ){
            System.out.println("Right-Collosion");
            return COLLISION.RIGHT;
        }

        if(b.checkCollision(this) == COLLISION.RIGHT) {
            System.out.println("Left-Collision");
            return COLLISION.LEFT;
        }
        return COLLISION.NOTHING;
    }


    public boolean intersect(BoundingBox b){
        return (min.x <= b.max.x) &&
                (max.x >= b.min.x)&&
                (min.y <= b.max.y)&&
                (max.y >= b.min.y);
    }



    public Vec2 overlapSize(BoundingBox b){
        Vec2 result = new Vec2(0,0);

        //X
        if (min.x <b.min.x){
            result.x = max.x - b.min.x;
        } else {
            result.x = b.max.x - min.x;
        }

        //Y
        if (min.y < b.min.y){
            result.y = max.y - b.min.y;
        } else {
            result.y = b.max.y - min.y;
        }



        return result;

    }

}
