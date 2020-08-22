package mainpackage.entity.moving.character;

import mainpackage.entity.moving.Moving;
import mainpackage.positioning.Coordinate;
import mainpackage.positioning.Direction;



public class Character extends Moving /*implements KeyListener */{
    public Character(Coordinate position) {
        super(position, 60, 10);
    }

    @Override
    public void move() {

    }

    public void move(Direction d) {
        System.out.println(d);
    }
    @Override
    public int canMove() {
        return 0;
    }

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
                //TODO Ajouter Menu
                System.out.println("Inventory");
                break;
            case KeyEvent.VK_A:
                //TODO Ajouter Attaque
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
                //TODO Ajouter Menu
                System.out.println("Inventory");
                break;
            case KeyEvent.VK_A:
                //TODO Ajouter Attaque
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
                //TODO Ajouter Menu
                System.out.println("Inventory");
                break;
            case KeyEvent.VK_A:
                //TODO Ajouter Attaque
                System.out.println("Assault");
                break;
        }
    }*/

}
