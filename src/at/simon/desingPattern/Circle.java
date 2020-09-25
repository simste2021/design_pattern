package at.simon.desingPattern;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;


public class Circle implements Actor {

    private int x;
    private int y;
    private int diameter;


    public Circle(int x, int y,int diameter){
        super();
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }
    public void render(Graphics gc) {
        gc.drawOval(this.x,this.y,diameter,diameter);
    }

    public void update(GameContainer gc,int delta) {
        if (this.y <= 600) {
            this.y++;
        } else {
            this.y = 0;
        }
    }
}