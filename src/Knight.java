import java.util.ArrayList;
import java.util.Arrays;

public class Knight extends Peice {

    public Knight(String side, String type, int[] position){
        super(side, type, position);
    }

    @Override
    public ArrayList<int[]> getPossibleMoves(){
        int xPos = this.getPosition(0, 0)[0];
        int yPos = this.getPosition(0, 0)[1];
        ArrayList<int[]> possibleMoves = new ArrayList<>();
        // check up 1 right 2
        if (xPos < 6 && yPos < 7) {
            possibleMoves.addFirst(this.getPosition(2, 1));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(2, 1))) {
                    possibleMoves.remove(0);
                }
            }
        }
        // check  up 2 right 1
        if (xPos < 7 && yPos < 6) {
            possibleMoves.add(0, this.getPosition(1, 2));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(1, 2))) {
                    possibleMoves.remove(0);
                }
            }
        }
        // check down 1 right 2
        if (xPos < 6 && yPos > 0) {
            possibleMoves.add(0, this.getPosition(2, -1));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(2, -1))) {
                    possibleMoves.remove(0);
                }
            }
        }
        // check down 2 right 1
        if (xPos < 7 && yPos > -1) {
            possibleMoves.add(0, this.getPosition(1, -2));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(1, -2))) {
                    possibleMoves.remove(0);
                }
            }
        }
        // check down 2 left 1
        if (xPos > 0 && yPos > -1) {
            possibleMoves.add(0, this.getPosition(-1, -2));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(-1, -2))) {
                    possibleMoves.remove(0);
                }
            }
        }
        // check down 1 left 2
        if (xPos > -1 && yPos > 0) {
            possibleMoves.add(0, this.getPosition(-2, -1));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(-2, -1))) {
                    possibleMoves.remove(0);
                }
            }
        }
        // check up 1 left 2
        if (xPos > -1 && yPos < 7) {
            possibleMoves.add(0, this.getPosition(-2, 1));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(-2, 1))) {
                    possibleMoves.remove(0);
                }
            }
        }
        // check up 2 left 1
        if (xPos > 0 && yPos < 6) {
            possibleMoves.add(0, this.getPosition(-1, 2));
            for (Peice peice : GlobalVars.peices) {
                if (peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(-1, 2))) {
                    possibleMoves.remove(0);
                }
            }
        }
        return possibleMoves;
    }
}
