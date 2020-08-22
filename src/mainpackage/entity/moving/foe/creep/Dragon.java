package mainpackage.entity.moving.foe.creep;

import mainpackage.entity.moving.character.Character;
import mainpackage.positioning.Coordinate;

/**
 * Foes that attack from range and hit hard
 */
public class Dragon extends Creep {
    /**
     * Constructor
     * @param position super
     */
    public Dragon(Coordinate position) {
        super(position, 150, 50);
    }

    @Override
    public void move() {

    }

    @Override
    public int canMove() {
        return 0;
    }

    @Override
    public void decide() {

    }

    @Override
    public void actWithCharacter(Character c) {

    }
    @Override
    public String toString() {
        return "R";
    }
}
