package mainpackage;

import mainpackage.entity.Entity;
import mainpackage.entity.moving.character.Character;
import mainpackage.map.Map;
import mainpackage.positioning.Coordinate;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Play implements Runnable {
    static long seed;
    public static Random rnd;
    Thread thread;
    Entity me;
    boolean running;


    /**
     * Constructor for our RogueLike, this is the only method called in the main()
     */
    public Play(){
        seed = (new Random()).nextLong();
        rnd = new Random(seed);
        thread = new Thread(this);
        running = false;
        Map map = new Map();
        me = new Character(new Coordinate(5,11));
        map.map[5][11] = me;
        System.out.println(map);
        start();
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            AtomicInteger a = new AtomicInteger(me.decide());
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println(map);
            if(a.get() ==0) i++;
        }
    }

    /**
     * Currently testing
     */
    private synchronized void start() {
        running = true;
        thread.start();
    }


    public static void main(String[] args){
       Play play = new Play();
    }

    /*
     * currently testing
     */
    @Override
    public void run() {

    }
}
