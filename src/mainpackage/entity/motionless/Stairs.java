package mainpackage.entity.motionless;

import mainpackage.entity.moving.character.Character;
import mainpackage.positioning.Coordinate;

public class Stairs extends Motionless {
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
