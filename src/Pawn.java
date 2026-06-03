import java.util.ArrayList;
import java.util.Arrays;

public class Pawn extends Peice {

    public Pawn(String side, String type, int[] position){
        super(side, type, position);
    }

    @Override
    public ArrayList<int[]> getPossibleMoves(){
        ArrayList<int[]> possibleMoves = new ArrayList<>();
        boolean forward = true;
        boolean forward2 = ((this.getPosition()[1] == 1 && this.getSide().equals("red")) ||
                (this.getPosition()[1] == 6 && this.getSide().equals("blue")));
        // check if at edge
        if ((this.getPosition()[1] == 7 && this.getSide().equals("red")) ||
                (this.getPosition()[1] == 0 && this.getSide().equals("blue"))) return possibleMoves;
        if (this.getSide().equals("red")) {
            for (Peice peice : GlobalVars.peices) {
                //check for eats on the sides
                if (!(this.getSide().equals(peice.getSide())) &&
                        (Arrays.equals(this.getPosition(1, 1), peice.getPosition()) ||
                                Arrays.equals(this.getPosition(-1, 1), peice.getPosition()))) {
                    possibleMoves.add(peice.getPosition());
                }
                //check if can move forward
                if (Arrays.equals(this.getPosition(0, 1), peice.getPosition())) {
                    forward = false;
                    forward2 = false;
                }
                if (Arrays.equals(this.getPosition(0, 2), peice.getPosition())) forward2 = false;
            }
            if (forward) possibleMoves.add(this.getPosition(0, 1));
            if (forward2) possibleMoves.add(this.getPosition(0, 2));
        }
        else{
            for (Peice peice : GlobalVars.peices) {
                //check for eats on the sides
                if (!this.getSide().equals(peice.getSide()) &&
                        (Arrays.equals(this.getPosition(-1, -1), peice.getPosition()) ||
                                Arrays.equals(this.getPosition(1, -1), peice.getPosition()))) {
                    possibleMoves.add(peice.getPosition());
                }
                //check if can move forward
                if (Arrays.equals(this.getPosition(0, -1), peice.getPosition())) {
                    forward = false;
                    forward2 = false;
                }
                if (Arrays.equals(this.getPosition(0, -2), peice.getPosition())) forward2 = false;
            }
            if (forward) possibleMoves.add(this.getPosition(0, -1));
            if (forward2) possibleMoves.add(this.getPosition(0, -2));
        }
        //check en passant
        if (this.getSide().equals("blue") && (
                Arrays.equals(this.getPosition(-1, -1),GlobalVars.EnPassantCoordinates) ||
                Arrays.equals(this.getPosition(1, -1),GlobalVars.EnPassantCoordinates))){
            possibleMoves.add(GlobalVars.EnPassantCoordinates);
        }
        if (this.getSide().equals("red") && (
                Arrays.equals(this.getPosition(-1, 1),GlobalVars.EnPassantCoordinates) ||
                Arrays.equals(this.getPosition(1, 1),GlobalVars.EnPassantCoordinates))){
            possibleMoves.add(GlobalVars.EnPassantCoordinates);
        }
        return possibleMoves;
    }
}
