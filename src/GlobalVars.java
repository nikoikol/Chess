import java.util.ArrayList;
import java.util.Arrays;

public class GlobalVars{
    public static ArrayList<Peice> peices = new ArrayList<>();
    public static ArrayList<int[]> targets = new ArrayList<>();
    public static boolean redW = false;
    public static boolean blueW = false;
    public static int[] EnPassantCoordinates;
    public static int[] EnPassantableCoordinates;

    public static void move(int[] initial, int[] end){
        int moverIndex = 0;
        int capturedIndex = 0;
        int EnPassant = 0;
        boolean promotionR = false;
        boolean promotionB = false;
        boolean captured = false;
        for (int i =0; i < peices.size(); i++){
            if (Arrays.equals(peices.get(i).getPosition(), initial)) {
                moverIndex = i;
                if ((peices.get(i).getType().equals("Pawn") &&
                        end[1] == 7 &&
                        peices.get(i).getSide().equals("red"))){
                     promotionR = true;
                }
                if ((peices.get(i).getType().equals("Pawn") &&
                        end[1] == 0 &&
                        peices.get(i).getSide().equals("blue"))){
                    promotionB = true;
                }
            }
            else if (Arrays.equals(peices.get(i).getPosition(), end)){
                captured = true;
                capturedIndex = i;
            }
            else if (Arrays.equals(peices.get(i).getPosition(), EnPassantableCoordinates)){
                EnPassant = i;
            }
        }
        peices.get(moverIndex).setPosition(end);
        if (peices.get(capturedIndex).getType().equals("King")){
            if (peices.get(capturedIndex).getSide().equals("blue")) redW = true;
            else blueW = true;
        }
        if(promotionR){
            peices.set(moverIndex,new Queen("red", "Queen", end));

        }
        if(promotionB){
            peices.set(moverIndex, new Queen("blue", "Queen", end));
        }
        if (captured) {
            peices.remove(capturedIndex);
        }
        if(peices.get(moverIndex).getType().equals("Pawn") &&
                Arrays.equals(end, EnPassantCoordinates)){
            peices.remove(EnPassant);
        }
        if (peices.get(moverIndex).getSide().equals("red") &&
                peices.get(moverIndex).getType().equals("Pawn") &&
                initial[1] == 1 &&
                end[1] == 3) {
            EnPassantCoordinates = new int[]{end[0], 2};
            EnPassantableCoordinates = end;
        }
        else if (peices.get(moverIndex).getSide().equals("blue") &&
                peices.get(moverIndex).getType().equals("Pawn") &&
                initial[1] == 6 &&
                end[1] == 4){
            EnPassantCoordinates = new int[]{end[0], 5};
            EnPassantableCoordinates = end;
        }
        else {
            EnPassantCoordinates = null;
            EnPassantableCoordinates = null;
        }
    }

    public static int[] coordinates(int[] square){
        int[] coordinates = {square[0]*100, (7-square[1])*100};
        return coordinates;
    }

    public static int[] square(int[] coordinates){
        int[] square = {coordinates[0]/100, 7-coordinates[1]/100};
        return square;
    }
}
