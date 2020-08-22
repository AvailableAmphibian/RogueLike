package mainpackage.entity.motionless;

import mainpackage.entity.moving.character.Character;
import mainpackage.positioning.Coordinate;

/**
 * Used to access higher stages
 */
public class Stairs extends Motionless {
    /**
     * Constructor
     * @param position super
     */
    public Stairs(Coordinate position) {
        super(position);
    }

    @Override
    public void actWithCharacter(Character c) {

    }



    @Override
    public String toString() {
        return "<";
    }
}
