package mainpackage.entity.moving.foe.creep;

import mainpackage.entity.moving.character.Character;
import mainpackage.positioning.Coordinate;

public class Dragon extends Creep {
    public Dragon(Coordinate position) {
        super(position, 150, 50);
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
        return "R";
    }
}
