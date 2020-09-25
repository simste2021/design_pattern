package at.simon.desingPattern;

public class MoveRight implements MoveStrategy{
    private float x;
    private float y;
    private float speed;

    public MoveRight(float x, float y, float speed) {
        super();
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(int delta){
        if (this.x >= 0){
            this.x -= delta * speed;
        }else{
            this.x = 900;
        }
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
