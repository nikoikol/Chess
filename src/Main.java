import javax.swing.JFrame;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        //red inital adding
        GlobalVars.peices.add(new Pawn("red", "Pawn", new int[]{0, 1}));
        GlobalVars.peices.add(new Pawn("red", "Pawn", new int[]{1, 1}));
        GlobalVars.peices.add(new Pawn("red", "Pawn", new int[]{2, 1}));
        GlobalVars.peices.add(new Pawn("red", "Pawn", new int[]{3, 1}));
        GlobalVars.peices.add(new Pawn("red", "Pawn", new int[]{4, 1}));
        GlobalVars.peices.add(new Pawn("red", "Pawn", new int[]{5, 1}));
        GlobalVars.peices.add(new Pawn("red", "Pawn", new int[]{6, 1}));
        GlobalVars.peices.add(new Pawn("red", "Pawn", new int[]{7, 1}));
        GlobalVars.peices.add(new Rook("red", "Rook", new int[]{0, 0}));
        GlobalVars.peices.add(new Rook("red", "Rook", new int[]{7, 0}));
        GlobalVars.peices.add(new Bishop("red", "Bishop", new int[]{2, 0}));
        GlobalVars.peices.add(new Bishop("red", "Bishop", new int[]{5, 0}));
        GlobalVars.peices.add(new Knight("red", "Knight", new int[]{1, 0}));
        GlobalVars.peices.add(new Knight("red", "Knight", new int[]{6, 0}));
        GlobalVars.peices.add(new King("red", "King", new int[]{4, 0}));
        GlobalVars.peices.add(new Queen("red", "Queen", new int[]{3, 0}));
        //blue initial adding
        GlobalVars.peices.add(new Pawn("blue", "Pawn", new int[]{0, 6}));
        GlobalVars.peices.add(new Pawn("blue", "Pawn", new int[]{1, 6}));
        GlobalVars.peices.add(new Pawn("blue", "Pawn", new int[]{2, 6}));
        GlobalVars.peices.add(new Pawn("blue", "Pawn", new int[]{3, 6}));
        GlobalVars.peices.add(new Pawn("blue", "Pawn", new int[]{4, 6}));
        GlobalVars.peices.add(new Pawn("blue", "Pawn", new int[]{5, 6}));
        GlobalVars.peices.add(new Pawn("blue", "Pawn", new int[]{6, 6}));
        GlobalVars.peices.add(new Pawn("blue", "Pawn", new int[]{7, 6}));
        GlobalVars.peices.add(new Rook("blue", "Rook", new int[]{0, 7}));
        GlobalVars.peices.add(new Rook("blue", "Rook", new int[]{7, 7}));
        GlobalVars.peices.add(new Bishop("blue", "Bishop", new int[]{2, 7}));
        GlobalVars.peices.add(new Bishop("blue", "Bishop", new int[]{5, 7}));
        GlobalVars.peices.add(new Knight("blue", "Knight", new int[]{1, 7}));
        GlobalVars.peices.add(new Knight("blue", "Knight", new int[]{6, 7}));
        GlobalVars.peices.add(new King("blue", "King", new int[]{4, 7}));
        GlobalVars.peices.add(new Queen("blue", "Queen", new int[]{3, 7}));
        JFrame frame = new JFrame("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 835);
        frame.setLocationRelativeTo(null);
        DisplayPanel panel = new DisplayPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}

