package at.simon.desingPattern;

public class MoveLeft implements MoveStrategy {
    private float x;
    private float y;
    private float speed;

    public MoveLeft(float x, float y, float speed) {
        super();
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(int delta){
        if (this.x <= 800){
            this.x += delta * speed;
        }else{
            this.x = 0;
        }
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

}
