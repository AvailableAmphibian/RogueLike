package mainpackage.entity;

import mainpackage.positioning.Coordinate;

public abstract class Entity {
    protected Coordinate position;
    public String line;

    /**
     * Super Constructor needed for every entity being e.g. a monster, the character or a stair
     * @param position is the position an entity will have
     */
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

    /**
     * Interaction with a character
     * @param c is the character you are interacting with
     */
    public abstract void actWithCharacter(mainpackage.entity.moving.character.Character c);
    public abstract int decide();
}
