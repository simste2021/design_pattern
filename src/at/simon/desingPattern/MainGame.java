package at.simon.desingPattern;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;


public class MainGame extends BasicGame {
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("First Game"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    public MainGame(java.lang.String title) {
        super(title);
    }
    private int x ;
    private int y;

    @java.lang.Override
    public void init(GameContainer gc) throws SlickException {
        this.x = 100;
        this.y = 100;
    }

    @java.lang.Override
    public void update(GameContainer gc, int delta) throws SlickException {
        this.x ++;
    }

    @java.lang.Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x,this.y,10,10);
    }
}
