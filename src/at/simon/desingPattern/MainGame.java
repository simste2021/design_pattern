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

    Player player = new Player(10,10, (float) 2);

    @java.lang.Override
    public void init(GameContainer gc) throws SlickException {
        this.actors = new ArrayList<>();


        MoveStrategy mr1 = new MoveRight(rand.nextInt(700),rand.nextInt(300), (float) 0.3);

        MoveStrategy mr2 = new MoveLeft(rand.nextInt(700),rand.nextInt(300), (float) 0.3);

        actors.add(new Circle(mr1, rand.nextInt(99)));

        actors.add(new Circle(mr2, rand.nextInt(99)));

    }

    @java.lang.Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for(Actor actor : this.actors){
            actor.update(gc,delta);
        }
        player.move(gc,delta);
    }

    @java.lang.Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        for(Actor actor : this.actors){
            actor.render(graphics);
        }
        player.draw(graphics);

    }
}
