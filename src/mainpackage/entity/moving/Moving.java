package mainpackage.entity.moving;

import mainpackage.entity.Entity;
import mainpackage.positioning.Coordinate;

public abstract class Moving extends Entity {
    private int hp;
    private int atk;

    /**
     * Constructor with stats parameter
     * @param position Super parameter
     * @param hp health point of an unit
     * @param atk atk points of an unit
     */
    public Moving(Coordinate position,int hp, int atk) {
        super(position);
        this.hp = hp;
        this.atk = atk;
    }

    /**
     * Getter for HP
     * @return hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * Setter for Hp
     * @param hp changes hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * Getter for Atk
     * @return atk
     */
    public int getAtk() {
        return atk;
    }

    /**
     * Setter for Atk
     * @param atk changes atk
     */
    public void setAtk(int atk) {
        this.atk = atk;
    }

    /**
     * moving method
     */
    public abstract void move();

    /**
     * Method created to know if a unit can move
     * @return the moving condition
     */
    public abstract int canMove();

    /**
     * Method created to make a unit choose a move to do during their turn
     */
    public abstract void decide();

}
