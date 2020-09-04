package mainpackage.entity.motionless;

import mainpackage.entity.Entity;
import mainpackage.positioning.Coordinate;

public abstract class Motionless extends Entity {
    /**
     * Constructor
     * @param position super
     */
    public Motionless(Coordinate position) {
        super(position);
    }
    @Override
    public int decide() {
        return 0;
    }
}
