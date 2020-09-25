package at.simon.desingPattern;

import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Player {
    public int x;
    public int y;
    public float speed;

    public Player(int x, int y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void draw(Graphics g){
        g.fillRect(this.x,this.y,50,50);
    }

    public void move(GameContainer gc, int delta){
        if(gc.getInput().isKeyDown(Input.KEY_LEFT)){
            if(this.x >= 0){
                this.x -= (float) delta *speed;
            }
        }
        if(gc.getInput().isKeyDown(Input.KEY_RIGHT)){
            if(this.x <= 750) {
                this.x += delta * speed;
            }
        }
        if(gc.getInput().isKeyDown(Input.KEY_DOWN)){
            if(this.y <= 500) {
                this.y += delta * speed;
            }
        }
        if(gc.getInput().isKeyDown(Input.KEY_UP)){
            if(this.y >= 0) {
                this.y -= delta * speed;
            }
        }
    }
}
