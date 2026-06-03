import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class DisplayPanel extends JPanel implements MouseListener{
    private BufferedImage board;
    private BufferedImage redRook;
    private BufferedImage redQueen;
    private BufferedImage redBishop;
    private BufferedImage redKing;
    private BufferedImage redPawn;
    private BufferedImage blueRook;
    private BufferedImage blueQueen;
    private BufferedImage blueBishop;
    private BufferedImage blueKing;
    private BufferedImage bluePawn;
    private BufferedImage target;
    private BufferedImage blueWin;
    private BufferedImage redWin;
    private BufferedImage blueKnight;
    private BufferedImage redKnight;
    private int[] prevCoords;
    private String turn = "red";

    public DisplayPanel(){
        try{
            board = ImageIO.read(new File("src/board.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            redRook = ImageIO.read(new File("src/RedRook.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            redKing = ImageIO.read(new File("src/RedKing.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            redBishop = ImageIO.read(new File("src/RedBishop.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            redQueen = ImageIO.read(new File("src/RedQueen.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            redPawn = ImageIO.read(new File("src/RedPawn.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }try{
            redRook = ImageIO.read(new File("src/RedRook.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            redKing = ImageIO.read(new File("src/RedKing.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            redBishop = ImageIO.read(new File("src/RedBishop.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            redQueen = ImageIO.read(new File("src/RedQueen.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            redKnight = ImageIO.read(new File("src/RedKnight.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            redPawn = ImageIO.read(new File("src/RedPawn.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            blueRook = ImageIO.read(new File("src/BlueRook.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            blueKing = ImageIO.read(new File("src/BlueKing.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            blueBishop = ImageIO.read(new File("src/BlueBishop.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            blueQueen = ImageIO.read(new File("src/BlueQueen.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            bluePawn = ImageIO.read(new File("src/BluePawn.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            blueKnight = ImageIO.read(new File("src/blueKnight.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            target = ImageIO.read(new File("src/target.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            redWin = ImageIO.read(new File("src/redWin.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }try{
            blueWin = ImageIO.read(new File("src/BlueWin.png"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }

        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(board, 0, 0, null);
        for (Peice peice : GlobalVars.peices){
            int x = GlobalVars.coordinates(peice.getPosition())[0];
            int y = GlobalVars.coordinates(peice.getPosition())[1];
            if (peice.getSide().equals("blue")){
                if (peice.getType().equals("Rook")){
                    g.drawImage(blueRook, x, y, null);
                }
                if (peice.getType().equals("Queen")){
                    g.drawImage(blueQueen, x, y, null);
                }
                if (peice.getType().equals("King")){
                    g.drawImage(blueKing, x, y, null);
                }
                if (peice.getType().equals("Bishop")){
                    g.drawImage(blueBishop, x, y, null);
                }
                if (peice.getType().equals("Pawn")){
                    g.drawImage(bluePawn, x, y, null);
                }
                if (peice.getType().equals("Knight")){
                    g.drawImage(blueKnight, x, y, null);
                }
            }
            if (peice.getSide().equals("red")){
                if (peice.getType().equals("Rook")){
                    g.drawImage(redRook, x, y, null);
                }
                if (peice.getType().equals("Queen")){
                    g.drawImage(redQueen, x, y, null);
                }
                if (peice.getType().equals("King")){
                    g.drawImage(redKing, x, y, null);
                }
                if (peice.getType().equals("Bishop")){
                    g.drawImage(redBishop, x, y, null);
                }
                if (peice.getType().equals("Pawn")){
                    g.drawImage(redPawn, x, y, null);
                }
                if (peice.getType().equals("Knight")){
                    g.drawImage(redKnight, x, y, null);
                }
            }
        }
        for(int[] tar : GlobalVars.targets){
            g.drawImage(target, GlobalVars.coordinates(tar)[0], GlobalVars.coordinates(tar)[1], null);
        }
        if (GlobalVars.blueW) g.drawImage(blueWin, 0, 0, null);
        if (GlobalVars.redW) g.drawImage(redWin, 0, 0, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        int[] coords = GlobalVars.square(new int[]{x, y});
        //check to see if moves
        for(int[] target : GlobalVars.targets){
            if (Arrays.equals(coords, target)){
                GlobalVars.move(prevCoords, coords);
                GlobalVars.targets.clear();
                repaint();
                if (turn.equals("red")){
                    turn = "blue";
                }
                else turn = "red";
                return;
            }
        }
        for (Peice peice : GlobalVars.peices){
            if (Arrays.equals(peice.getPosition(),coords) && peice.getSide().equals(turn)){
                GlobalVars.targets = peice.getPossibleMoves();
                prevCoords = coords;
                repaint();
                return;
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
