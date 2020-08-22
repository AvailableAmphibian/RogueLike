package mainpackage.entity.moving;

import mainpackage.entity.Entity;
import mainpackage.positioning.Coordinate;

public abstract class Moving extends Entity {
    private int hp;
    private int atk;

    public Moving(Coordinate position,int hp, int atk) {
        super(position);
        this.hp = hp;
        this.atk = atk;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getAtk() {
        return atk;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }

    public abstract void move();
    public abstract int canMove();
    public abstract void decide();

}
