import java.util.ArrayList;
import java.util.Arrays;

public class King extends Peice {

    public King(String side, String type, int[] position){
        super(side, type, position);
    }

    @Override
    public ArrayList<int[]> getPossibleMoves(){
        int xPos = this.getPosition(0, 0)[0];
        int yPos = this.getPosition(0, 0)[1];
        ArrayList<int[]> possibleMoves = new ArrayList<>();
        // check up 1 right 1
        if (xPos < 7 && yPos < 7) {
            possibleMoves.add(0, this.getPosition(1, 1));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(1, 1))) {
                    possibleMoves.remove(0);
                }
            }
        }
        // check right 1
        if (xPos < 7) {
            possibleMoves.add(0, this.getPosition(1, 0));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(1, 0))) {
                    possibleMoves.remove(0);
                }
            }
        }
        // check down 1 right 1
        if (xPos < 7 && yPos > 0) {
            possibleMoves.add(0, this.getPosition(1, -1));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(1, -1))) {
                    possibleMoves.remove(0);
                }
            }
        }
        // check down 1
        if (yPos > 0) {
            possibleMoves.add(0, this.getPosition(0, -1));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(0, -1))) {
                    possibleMoves.remove(0);
                }
            }
        }
        // check donw 1 left 1
        if (xPos > 0 && yPos > 0) {
            possibleMoves.add(0, this.getPosition(-1, -1));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(-1, -1))) {
                    possibleMoves.remove(0);
                }
            }
        }
        // check left 1
        if (xPos > 0) {
            possibleMoves.add(0, this.getPosition(-1, 0));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(-1, 0))) {
                    possibleMoves.remove(0);
                }
            }
        }
        // check up 1 left 1
        if (xPos > 0 && yPos < 0) {
            possibleMoves.add(0, this.getPosition(1, -1));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(1, -1))) {
                    possibleMoves.remove(0);
                }
            }
        }
        // check up 1
        if (yPos < 7) {
            possibleMoves.add(0, this.getPosition(0, 1));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(0, 1))) {
                    possibleMoves.remove(0);
                }
            }
        }
        return possibleMoves;
    }
}
