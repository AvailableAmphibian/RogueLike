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
    public Coordinate getUpdate() {
        return update;
    }
    Direction(Coordinate update) {
        this.update = update;
    }
    private static Direction[] getWindRose(){
        return new Direction[]{Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
    }
}
