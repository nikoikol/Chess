import java.util.ArrayList;

public class Peice {
    private String side;
    private String type;
    private int[] position;

    public Peice(String side, String type, int[] position){
        this.side = side;
        this.type = type;
        this.position = position;
    }

    public String getSide() {
        return side;
    }

    public String getType() {
        return type;
    }

    public void setPosition(int[] pos){
        position = pos;
    }

    public int[] getPosition(){
        return position;
    }

    public int[] getPosition(int offsetX, int offsetY) {
        return new int[]{position[0] + offsetX, position[1] + offsetY};
    }
    public ArrayList<int[]> getPossibleMoves(){
        return null;
    }
}
