import java.util.ArrayList;
import java.util.Arrays;

public class Queen extends Peice {

    public Queen(String side, String type, int[] position) {
        super(side, type, position);
    }

    @Override
    public ArrayList<int[]> getPossibleMoves() {
        ArrayList<int[]> possibleMoves = new ArrayList<>();
        //check for x positions to the left
        for(int i = 1; this.getPosition(-i,0)[0] > -1; i++){
            possibleMoves.add(0, this.getPosition(-i, 0));
            for(Peice peice : GlobalVars.peices){
                if(peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(-i, 0))){
                    i = 10;
                    possibleMoves.remove(0);
                }
                else if(!peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(-i, 0))){
                    i = 10;
                }
            }
        }
        //check for x positions to the right
        for(int i = 1; this.getPosition(i,0)[0] < 8; i++){
            possibleMoves.add(0, this.getPosition(i, 0));
            for(Peice peice : GlobalVars.peices){
                if(peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(i, 0))){
                    i = 10;
                    possibleMoves.remove(0);
                }
                else if(!peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(i, 0))){
                    i = 10;
                }
            }
        }
        //check for y positions down
        for(int i = 1; this.getPosition(0,-i)[1] > -1; i++){
            possibleMoves.add(0, this.getPosition(0, -i));
            for(Peice peice : GlobalVars.peices){
                if(peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(0, -i))){
                    i = 10;
                    possibleMoves.remove(0);
                }
                else if(!peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(0, -i))){
                    i = 10;
                }
            }
        }
        //check for y positions up
        for(int i = 1; this.getPosition(0,i)[1] < 8; i++){
            possibleMoves.add(0, this.getPosition(0, i));
            for(Peice peice : GlobalVars.peices){
                if(peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(0, i))){
                    i = 10;
                    possibleMoves.remove(0);
                }
                else if(!peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(0, i))){
                    i = 10;
                }
            }
        }
        //check for x positions left down
        for(int i = 1; this.getPosition(-i,-i)[0] > -1 && this.getPosition(-i,-i)[1] > -1; i++){
            possibleMoves.add(0, this.getPosition(-i, -i));
            for(Peice peice : GlobalVars.peices){
                if((peice.getSide().equals(this.getSide())) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(-i, -i))){
                    i = 10;
                    possibleMoves.remove(0);
                }
                else if(!(peice.getSide().equals(this.getSide())) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(-i, -i))){
                    i = 10;
                }
            }
        }
        //check for x positions right up
        for(int i = 1; this.getPosition(i,i)[0] < 8 && this.getPosition(i,i)[1] < 8; i++){
            possibleMoves.add(0, this.getPosition(i, i));
            for(Peice peice : GlobalVars.peices){
                if(peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(i, i))){
                    i = 10;
                    possibleMoves.remove(0);
                }
                else if(!peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(i, i))){
                    i = 10;
                }
            }
        }
        //check for x positions left up
        for(int i = 1; this.getPosition(-i,i)[0] > -1 && this.getPosition(-i,i)[1] < 8; i++){
            possibleMoves.add(0, this.getPosition(-i, i));
            for(Peice peice : GlobalVars.peices){
                if(peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(-i, i))){
                    i = 10;
                    possibleMoves.remove(0);
                }
                else if(!peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(-i, i))){
                    i = 10;
                }
            }
        }
        //check for x positions right down
        for(int i = 1; this.getPosition(i,-i)[0] < 8 && this.getPosition(i,-i)[1] > -1; i++){
            possibleMoves.add(0, this.getPosition(i, -i));
            for(Peice peice : GlobalVars.peices){
                if(peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(i, -i))){
                    i = 10;
                    possibleMoves.remove(0);
                }
                else if(!peice.getSide().equals(this.getSide()) &&
                        Arrays.equals(peice.getPosition(), this.getPosition(i, -i))){
                    i = 10;
                }
            }
        }
        return possibleMoves;
    }
}