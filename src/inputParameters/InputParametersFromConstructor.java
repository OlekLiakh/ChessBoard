package inputParameters;

import modelBoard.ChessBoard;

public class InputParametersFromConstructor implements InputParameters{

    ChessBoard chessBoard;

    public InputParametersFromConstructor(int height, int width){
        chessBoard = new ChessBoard(height, width);
    }

    @Override
    public ChessBoard getChessBoard() {
        return chessBoard;
    }
}
