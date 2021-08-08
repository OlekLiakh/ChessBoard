package output;

import modelBoard.ChessBoard;
import output.converter.ConverterSchemeChessBoardToString;

public class OutputChessBoardSchemeToConsole implements OutputChessBoardScheme {

    ChessBoard chessBoard;

    public OutputChessBoardSchemeToConsole(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    @Override
    public void outputChessBoardScheme() {
        ConverterSchemeChessBoardToString converter = new ConverterSchemeChessBoardToString(chessBoard);
        System.out.println(converter.getScheme());
    }
}
