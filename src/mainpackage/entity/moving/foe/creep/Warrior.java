package mainpackage.entity.moving.foe.creep;

import mainpackage.entity.moving.character.Character;
import mainpackage.positioning.Coordinate;

/**
 * Basic foe
 */
public class Warrior  extends Creep {
    /**
     * Constructor
     * @param position super
     */
    public Warrior(Coordinate position) {
        super(position, 60, 10);
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
        return "W";
    }
}
