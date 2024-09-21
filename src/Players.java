import cs3331Helper.cs3331TicTacToeBoard;
import cs3331Helper.cs3331TicTacToeController;
import cs3331Helper.cs3331TicTacToePlayer;
import cs3331Helper.cs3331TicTacToeSquare;

public class Players implements cs3331TicTacToePlayer{

    private String icon;
    public cs3331TicTacToeBoard board;
    public cs3331TicTacToeController controller;

    public Players(String icon, cs3331TicTacToeBoard board, cs3331TicTacToeController controller) {
        this.icon = icon;
        this.board = board;
        this.controller = controller;
    }

    public void selectSquare(int arg0, int arg1) {
        cs3331TicTacToeSquare sq = board.squareAt(arg0, arg1);
        sq.markSquare(this.icon);
        controller.finishedTurn();
        controller.setControllerMessage("Player " + this.icon + " has finished their turn");
    }
    
}
