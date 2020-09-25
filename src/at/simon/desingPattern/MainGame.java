package at.simon.desingPattern;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


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

    private List<Actor> actors;

    private Circle circle1;
    Random rand = new Random();


    public MainGame(java.lang.String title) {
        super(title);
    }

    @java.lang.Override
    public void init(GameContainer gc) throws SlickException {
        this.actors = new ArrayList<>();
        for(int i = 0; i < 999; i++) {
            this.actors.add(new Circle(rand.nextInt(800), rand.nextInt(600), rand.nextInt(10)));
        }

    }

    @java.lang.Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for(Actor actor : this.actors){
            actor.update(gc,delta);
        }
    }

    @java.lang.Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        for(Actor actor : this.actors){
            actor.render(graphics);
        }
    }
}
