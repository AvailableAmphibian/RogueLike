package mainpackage.entity.moving.foe.creep;


import mainpackage.entity.moving.character.Character;
import mainpackage.positioning.Coordinate;

/**
 * Foes that moves randomly in any Direction
 */
public class Spider extends Creep {
    /**
     * Constructor
     * @param position super
     */
    public Spider(Coordinate position) {
        super(position, 30, 10);
    }

    @Override
    public void move() {

    }

    @Override
    public int canMove() {
        return 0;
    }

    @Override
    public int decide() {
        return 0;
    }

    @Override
    public void actWithCharacter(Character c) {

    }
    @Override
    public String toString() {
        return "X";
    }
}
