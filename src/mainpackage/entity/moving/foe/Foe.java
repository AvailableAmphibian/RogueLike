package mainpackage.entity.moving.foe;

import mainpackage.entity.moving.Moving;
import mainpackage.positioning.Coordinate;

public abstract class Foe extends Moving {
    public Foe(Coordinate position, int hp, int atk) {
        super(position, hp, atk);
    }
}
