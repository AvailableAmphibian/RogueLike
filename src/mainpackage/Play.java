package mainpackage;

import mainpackage.entity.Entity;
import mainpackage.entity.moving.character.Character;
import mainpackage.map.Map;
import mainpackage.positioning.Coordinate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

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
        //addKeyListener(me);
        /*for (int i = 0;i < 5;i++){
            me.decide();
        }*/

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

    /**
     * currently testing
     */
    @Override
    public void run() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(!me.line.equalsIgnoreCase("quit")){
            try {
                me.line = in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            me.decide();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
