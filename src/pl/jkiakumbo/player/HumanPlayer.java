package pl.jkiakumbo.player;

import pl.jkiakumbo.GamePlayer;

import java.awt.*;

public class HumanPlayer extends GamePlayer {

    public HumanPlayer(int mark) {
        super(mark);
    }

    @Override
    public boolean isUserPlayer() {
        return true;
    }

    @Override
    public String playerName() {
        return "User" ;
    }

    @Override
    public Point play(int[][] board) {
        return null;
    }

}
