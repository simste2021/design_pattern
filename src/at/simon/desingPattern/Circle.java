package at.simon.desingPattern;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;


public class Circle implements Actor {

    private MoveStrategy moveStrategy;

    private int diameter;


    public Circle(MoveStrategy moveStrategy, int diameter){
        super();
        this.moveStrategy = moveStrategy;
        this.diameter = diameter;

    }
    public void render(Graphics gc) {
        gc.drawOval(this.moveStrategy.getX(),this.moveStrategy.getY(),diameter,diameter);
    }

    public void update(GameContainer gc,int delta) {
        moveStrategy.update(delta);
    }
}