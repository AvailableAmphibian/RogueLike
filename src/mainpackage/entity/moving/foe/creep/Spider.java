package mainpackage.entity.moving.foe.creep;


import mainpackage.entity.moving.character.Character;
import mainpackage.positioning.Coordinate;

public class Spider extends Creep {
    public Spider(Coordinate position) {
        super(position, 30, 10);
    }

    @Override
    public void move() {

    }

    @Override
    public int canMove() {
        return 0;
    }

    @Override
    public void decide() {

    }

    @Override
    public void actWithCharacter(Character c) {

    }
    @Override
    public String toString() {
        return "X";
    }
}
