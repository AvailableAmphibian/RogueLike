package mainpackage.entity.moving.character;

import mainpackage.entity.moving.Moving;
import mainpackage.positioning.Coordinate;
import mainpackage.positioning.Direction;



public class Character extends Moving /*implements KeyListener */{
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
        if(canMove() == 0) {
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
                    break;*/
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
        }
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
