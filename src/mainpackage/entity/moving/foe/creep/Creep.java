package mainpackage.entity.moving.foe.creep;

import mainpackage.entity.moving.foe.Foe;
import mainpackage.positioning.Coordinate;

public abstract class Creep extends Foe {
    public Creep(Coordinate position, int hp, int atk) {
        super(position, hp, atk);
    }
}
