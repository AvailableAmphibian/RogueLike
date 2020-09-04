package mainpackage.entity.moving.foe;

import mainpackage.entity.moving.Moving;
import mainpackage.entity.moving.character.Character;
import mainpackage.positioning.Coordinate;

/**
 * Special foes, they are the only foe in the stage and there is only one room on those stages
 */
public class Boss extends Moving {
    /**
     * Constructor for bosses
     * @param position super
     */
    public Boss(Coordinate position) {
        super(position, 300, 40);
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
}
