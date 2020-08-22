package mainpackage.entity.moving.foe.creep;

import mainpackage.entity.moving.foe.Foe;
import mainpackage.positioning.Coordinate;

/**
 * Not so significant foes
 */
public abstract class Creep extends Foe {
    /**
     * Constructor
     * @param position super
     * @param hp super
     * @param atk super
     */
    public Creep(Coordinate position, int hp, int atk) {
        super(position, hp, atk);
    }
}
