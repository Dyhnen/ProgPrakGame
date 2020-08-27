public class Position3D {
    float x = 0;
    float y = 0;
    float gravitaion = 0;
    float speed = 0;
    float accel = 0;


    Position3D(){

    }
    Position3D(float x, float y, float speed, float grav, float accel){
        this.x = x;
        this.y = y;
        this.gravitaion = grav;
        this.accel = accel;
        this.speed = speed;
    }
}
