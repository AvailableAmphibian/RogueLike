package mainpackage.entity.moving.character;

import mainpackage.entity.moving.Moving;
import mainpackage.positioning.Coordinate;
import mainpackage.positioning.Direction;

import lc.kra.system.keyboard.GlobalKeyboardHook;
import lc.kra.system.keyboard.event.GlobalKeyAdapter;
import lc.kra.system.keyboard.event.GlobalKeyEvent;

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
     * @return the value of action done
     */
    @Override
    public int decide() {
        run = true;
        final int[] ret = {0};
        GlobalKeyboardHook keyboardHook = new GlobalKeyboardHook(false);     /*for (Map.Entry<Long, String> keyboard : GlobalKeyboardHook.listKeyboards().entrySet())
            System.out.format("%d: %s\n", keyboard.getKey(), keyboard.getValue());*/
        keyboardHook.addKeyListener(new GlobalKeyAdapter() {
            @Override
            public void keyPressed(GlobalKeyEvent event) {
                System.out.println(event);
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
                        //TODO Add Menu
                        System.out.println("Inventory");
                        break;
                    case GlobalKeyEvent.VK_A:
                        //TODO Add attacking move
                        System.out.println("Assault");
                        break;
                    default:
                        ret[0] = 1;
                }

            }

            @Override
            public void keyReleased(GlobalKeyEvent event) {
                System.out.println(event);
                run=false;
            }
        });

        try {
            while (run) //noinspection BusyWait
                Thread.sleep(128);
        } catch (InterruptedException e) { /* nothing to do here*/  } finally {
            keyboardHook.shutdownHook();
        }
        return ret[0];
    }

    /**
     * Interaction with a character
     * @param c is an adjacent character
     */
    @Override
    public void actWithCharacter(Character c) {

    }

    @Override
    public String toString() { return "@"; }
}
