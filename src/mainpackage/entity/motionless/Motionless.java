package mainpackage.entity.motionless;

import mainpackage.entity.Entity;
import mainpackage.positioning.Coordinate;

public abstract class Motionless extends Entity {
    public Motionless(Coordinate position) {
        super(position);
    }
    @Override
    public void decide() {

    }
}
