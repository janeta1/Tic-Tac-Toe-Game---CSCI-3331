import cs3331Helper.cs3331TicTacToeBoard;
import cs3331Helper.cs3331TicTacToeController;
import cs3331Helper.cs3331TicTacToeGame;
import cs3331Helper.cs3331TicTacToeSquare;
import javafx.scene.paint.Color;

public class myTicTacToe implements cs3331TicTacToeGame {
    cs3331TicTacToeBoard myBoard = new cs3331TicTacToeBoard();
    cs3331TicTacToeController newController = new cs3331TicTacToeController();
    Players player1 = new Players("X", myBoard, newController);
    Players player2 = new Players("O", myBoard, newController);

    public myTicTacToe() {
        newController.setControllerMessage("Select a square to start playing");
        newController.addPlayer(player1);
        newController.addPlayer(player2);
    }

    @Override
    public void invalidSquareChosen(int arg0, int arg1) {
        cs3331TicTacToeSquare sq = myBoard.squareAt(arg0, arg1);
        if (sq != null) {
            newController.setControllerMessage("Square chosen has already been taken. Try again.");
            sq.flashColor(Color.RED);
        }
    }

    @Override
    public void noWinner() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'noWinner'");
    }

    @Override
    public void playerWins() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'playerWins'");
    }

    @Override
    public void restartGame() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'restartGame'");
    }

}
