package mainpackage.entity.moving.character;

import mainpackage.entity.moving.Moving;
import mainpackage.positioning.Coordinate;
import mainpackage.positioning.Direction;

import lc.kra.system.keyboard.GlobalKeyboardHook;
import lc.kra.system.keyboard.event.GlobalKeyAdapter;
import lc.kra.system.keyboard.event.GlobalKeyEvent;

import java.util.Map;

public class Character extends Moving{
    private static boolean run;
    /**
     * Constructor for Character
     * @param position super
     */
    public Character(Coordinate position) {
        super(position, 60, 10);
    }


    @Override
    public void move() {

    }

    /**
     * Unit moves in the wanted direction
     */
    public void move(Direction d) {
        this.position.update(d);
        System.out.println(d);
    }

    /**
     *
     * @return 0 if there is no foe in the adjacent tiles
     *         1 if there is a a foe on any adjacent tile
     */
    @Override
    public int canMove() {
        return 0;
    }

    /**
     * Deciding method using cooked mode input
     */
    @Override
    public void decide() {
        run = true;
        GlobalKeyboardHook keyboardHook = new GlobalKeyboardHook(false);     /*for (Map.Entry<Long, String> keyboard : GlobalKeyboardHook.listKeyboards().entrySet())
            System.out.format("%d: %s\n", keyboard.getKey(), keyboard.getValue());*/
        keyboardHook.addKeyListener(new GlobalKeyAdapter() {
            @Override
            public void keyPressed(GlobalKeyEvent event) {
                System.out.println(event);
                /*for(Map.Entry<Long,String> keyboard:GlobalKeyboardHook.listKeyboards().entrySet())
                    System.out.format("%d: %s\n", keyboard.getKey(), keyboard.getValue());*/
                switch (event.getVirtualKeyCode()) {
                    case GlobalKeyEvent.VK_LEFT:
                    case GlobalKeyEvent.VK_NUMPAD4:
                        System.out.println("Left");
                        move(Direction.WEST);
                        break;
                    case GlobalKeyEvent.VK_UP:
                    case GlobalKeyEvent.VK_NUMPAD8:
                        System.out.println("up");
                        move(Direction.NORTH);
                        break;
                    case GlobalKeyEvent.VK_RIGHT:
                    case GlobalKeyEvent.VK_NUMPAD6:
                        System.out.println("Right");
                        move(Direction.EAST);
                        break;
                    case GlobalKeyEvent.VK_DOWN:
                    case GlobalKeyEvent.VK_NUMPAD2:
                        System.out.println("down");
                        move(Direction.SOUTH);
                        break;
                    case GlobalKeyEvent.VK_E:
                        //TODO Ajouter Menu
                        System.out.println("Inventory");
                        break;
                    case GlobalKeyEvent.VK_A:
                        //TODO Ajouter Attaque
                        System.out.println("Assault");
                        break;
                    default:
                }
            }

            @Override
            public void keyReleased(GlobalKeyEvent event) {
                System.out.println(event);
                run=false;
            }
        });

        try {
            while (run) Thread.sleep(128);
        } catch (InterruptedException e) { /* nothing to do here*/  } finally {
            keyboardHook.shutdownHook();
        }

        /*if(canMove() == 0) {
            int i = 0;
            switch (line) {
                /*case KeyEvent.VK_LEFT | KeyEvent.VK_NUMPAD4:
                    move(Direction.WEST);
                    break;
                case KeyEvent.VK_UP | KeyEvent.VK_NUMPAD8:
                    move(Direction.NORTH);
                    break;
                case KeyEvent.VK_RIGHT | KeyEvent.VK_NUMPAD6:
                    move(Direction.EAST);
                    break;
                case KeyEvent.VK_DOWN | KeyEvent.VK_NUMPAD2:
                    move(Direction.SOUTH);
                    break;
                case "E":
                case "e":
                    //TODO Ajouter Menu
                    System.out.println("Inventory");
                    break;

                case "A":
                case "a":
                    //TODO Ajouter Attaque
                    System.out.println("Assault");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + line);
            }
        }*/
    }

    /**
     * Interaction with a character
     * @param c is an adjacent character
     */
    @Override
    public void actWithCharacter(Character c) {

    }
    @Override
    public String toString() {
        return "@";
    }
    /*@Override
    public void keyTyped(KeyEvent key) {
        System.out.println("Typed");
        switch (key.getKeyCode()){
            case KeyEvent.VK_LEFT | KeyEvent.VK_NUMPAD4:
                move(Direction.WEST);
                break;
            case KeyEvent.VK_UP | KeyEvent.VK_NUMPAD8:
                move(Direction.NORTH);
                break;
            case KeyEvent.VK_RIGHT | KeyEvent.VK_NUMPAD6:
                move(Direction.EAST);
                break;
            case KeyEvent.VK_DOWN | KeyEvent.VK_NUMPAD2:
                move(Direction.SOUTH);
                break;
            case KeyEvent.VK_E:
                System.out.println("Inventory");
                break;
            case KeyEvent.VK_A:
                System.out.println("Assault");
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent key) {
        System.out.println("Pressed");
        switch (key.getKeyCode()){
            case KeyEvent.VK_LEFT | KeyEvent.VK_NUMPAD4:
                move(Direction.WEST);
                break;
            case KeyEvent.VK_UP | KeyEvent.VK_NUMPAD8:
                move(Direction.NORTH);
                break;
            case KeyEvent.VK_RIGHT | KeyEvent.VK_NUMPAD6:
                move(Direction.EAST);
                break;
            case KeyEvent.VK_DOWN | KeyEvent.VK_NUMPAD2:
                move(Direction.SOUTH);
                break;
            case KeyEvent.VK_E:
                System.out.println("Inventory");
                break;
            case KeyEvent.VK_A:
                System.out.println("Assault");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent key) {
        System.out.println("Released");
        switch (key.getKeyCode()){
            case KeyEvent.VK_LEFT | KeyEvent.VK_NUMPAD4:
                move(Direction.WEST);
                break;
            case KeyEvent.VK_UP | KeyEvent.VK_NUMPAD8:
                move(Direction.NORTH);
                break;
            case KeyEvent.VK_RIGHT | KeyEvent.VK_NUMPAD6:
                move(Direction.EAST);
                break;
            case KeyEvent.VK_DOWN | KeyEvent.VK_NUMPAD2:
                move(Direction.SOUTH);
                break;
            case KeyEvent.VK_E:
                System.out.println("Inventory");
                break;
            case KeyEvent.VK_A:
                System.out.println("Assault");
                break;
        }
    }*/

}
