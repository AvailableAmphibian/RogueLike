package mainpackage.positioning;

public enum Direction {
    NORTH(new Coordinate(0,-1)),
    EAST(new Coordinate(1,0)),
    SOUTH(new Coordinate(0,1)),
    WEST(new Coordinate(-1,0)),
    NORTHEAST(new Coordinate(1,-1)),
    NORTHWEST(new Coordinate(-1,-1)),
    SOUTHEAST(new Coordinate(1,1)),
    SOUTHWEST(new Coordinate(-1,1));

    private Coordinate update;

    /**
     * Getter for update
     * @return update
     */
    public Coordinate getUpdate() {
        return update;
    }

    /**
     * Constructor for Direction
     * @param update direction on xy axis
     */
    Direction(Coordinate update) {
        this.update = update;
    }

    /**
     * Static method used to get only the NESW directions
     * @return an array with the needed Directions
     */
    private static Direction[] getWindRose(){
        return new Direction[]{Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
    }
}
