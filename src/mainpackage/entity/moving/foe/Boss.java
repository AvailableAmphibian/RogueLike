package mainpackage.entity.moving.foe;

import mainpackage.entity.moving.Moving;
import mainpackage.entity.moving.character.Character;
import mainpackage.positioning.Coordinate;

public class Boss extends Moving {

    public Boss(Coordinate position) {
        super(position, 300, 40);
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
}
