package mainpackage.positioning;

import mainpackage.Play;

public class Coordinate {
    private int x;
    private int y;
    public Coordinate(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
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

    private Coordinate update(Coordinate delta) {
        return new Coordinate(delta.getX() + this.x,delta.getY() + this.y);
    }
    public Coordinate update(Direction d) {
        return this.update(d.getUpdate());
    }
    public Coordinate update(Direction d,int howMuch){
        Coordinate c = this;
        for(int i = 0; i < (howMuch);i++) c = c.update(d);
        return c;
    }

    public static Coordinate randomCoordinate(){
        return new Coordinate(Play.rnd.nextInt(10), Play.rnd.nextInt(10));
    }
    @Override
    public String toString() {
        return "(" + x +"," + y + ")";
    }
}
