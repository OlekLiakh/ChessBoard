package output;

import output.converter.ConverterSchemeChessBoardToString;
import modelBoard.ChessBoard;

public class OutputChessBoardSchemeToConsole implements OutputChessBoardScheme {

    ChessBoard chessBoard;

    public OutputChessBoardSchemeToConsole(ChessBoard chessBoard){
        this.chessBoard = chessBoard;
    }

    @Override
    public void outputChessBoardScheme() {
        ConverterSchemeChessBoardToString converter = new ConverterSchemeChessBoardToString(chessBoard);
        System.out.println(converter.getScheme());
    }
}
