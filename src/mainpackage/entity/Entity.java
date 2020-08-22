package mainpackage.entity;

import mainpackage.positioning.Coordinate;

public abstract class Entity {
    protected Coordinate position;
    public String line;

    public Entity(Coordinate position) {
        this.position = position;
        line = "";
    }

    public Coordinate getPosition() {
        return position;
    }

    public void setPosition(Coordinate position) {
        this.position = position;
    }

    public abstract void actWithCharacter(mainpackage.entity.moving.character.Character c);
    public abstract void decide();
}
