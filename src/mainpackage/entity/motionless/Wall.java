package mainpackage.entity.motionless;

import mainpackage.entity.moving.character.Character;
import mainpackage.positioning.Coordinate;

/**
 * Can't move through them
 */
public class Wall extends Motionless {
    /**
     * Constructor
     * @param position super
     */
    public Wall(Coordinate position) {
        super(position);
    }

    @Override
    public void actWithCharacter(Character c) {

    }
    @Override
    public String toString() {
        return "■";
    }
}
