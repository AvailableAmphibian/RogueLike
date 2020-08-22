package mainpackage.map;

import mainpackage.entity.Entity;
import mainpackage.entity.motionless.Stairs;
import mainpackage.entity.motionless.Wall;
import mainpackage.entity.moving.foe.creep.Dragon;
import mainpackage.entity.moving.foe.creep.Spider;
import mainpackage.entity.moving.foe.creep.Warrior;
import mainpackage.positioning.Coordinate;

public class Map {
    public Entity[][] map;

    public Map() {
        this.map = new Entity[10][20];
        /*this.map[1][15] = new Stairs(new Coordinate(1,15));
        this.map[5][10] = new Spider(new Coordinate(5,10));
        this.map[8][10] = new Dragon(new Coordinate(8,10));
        this.map[4][5] = new Warrior(new Coordinate(4,5));*/
        for (int i = 0;i < 20;i++){
            this.map[0][i] = new Wall(new Coordinate(0,i));
            this.map[9][i] = new Wall(new Coordinate(9,i));
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0;i<10;i++){
            for (int j=0;j<20;j++){
                if(this.map[i][j] == null) res.append(".");
                else res.append(this.map[i][j].toString());
            }
            res.append("\n");
        }
        return res.toString();
    }

}
