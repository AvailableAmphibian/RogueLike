package mainpackage.positioning;

import mainpackage.Play;

public class Coordinate {
    private final int x;
    private final int y;

    /**
     * Constructor
     * @param x x position
     * @param y y position
     */
    public Coordinate(int x,int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Getter for X
     * @return X
     */
    public int getX() {
        return x;
    }

    /**
     * Getter for Y
     * @return Y
     */
    public int getY() {
        return y;
    }

    /*private Coordinate normalization() {
        int x, y;
        if(this.getX() < 0) {
            x = maxValue + this.getX();
        }else {
            x = this.getX();
        }
        if(this.getY() < 0) {
            y = maxValue + this.getY();
        }else y = this.getY();
        return new Coordinate(x,y);
    }*/

    /**
     * Changes a position
     * @param delta is the position to add
     * @return A new Coordinate that will be our new Position
     */
    private Coordinate update(Coordinate delta) {
        return new Coordinate(delta.getX() + this.x,delta.getY() + this.y);
    }

    /**
     * Calls the update(Coordinate) method with a direction
     * @param d is a direction
     * @return A new Coordinate that will be our new Position
     */
    public Coordinate update(Direction d) {
        return this.update(d.getUpdate());
    }

    /**
     * Calls for a setted number of time the update(Direction) method
     * @param d is a direction
     * @param howMuch shows how much times you move in the direction d
     * @return A new Coordinate that will be our new Position
     */
    public Coordinate update(Direction d,int howMuch){
        Coordinate c = this;
        for(int i = 0; i < (howMuch - 1);i++) c = c.update(d);
        return c.update(d);
    }

    /**
     * Method that puts you on a random Coordinate
     * @return A random Coordinate
     */
    public static Coordinate randomCoordinate(){
        return new Coordinate(Play.rnd.nextInt(10), Play.rnd.nextInt(10));
    }
    @Override
    public String toString() {
        return "(" + x +"," + y + ")";
    }
}
