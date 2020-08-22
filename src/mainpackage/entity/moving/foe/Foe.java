package mainpackage.entity.moving.foe;

import mainpackage.entity.moving.Moving;
import mainpackage.positioning.Coordinate;

public abstract class Foe extends Moving {
    /**
     * Constructor for the foes
     * @param position super
     * @param hp super
     * @param atk super
     */
    public Foe(Coordinate position, int hp, int atk) {
        super(position, hp, atk);
    }
}
