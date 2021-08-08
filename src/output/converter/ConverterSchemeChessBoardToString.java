package output.converter;

import modelBoard.ChessBoard;

public class ConverterSchemeChessBoardToString {

    private ChessBoard chessBoard;

    public ConverterSchemeChessBoardToString(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public String getScheme() {

        String firstElem, nextElem;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < Math.abs(chessBoard.getHeight()); i++) {
            if (i % 2 == 0) {
                firstElem = "*";
                nextElem = " ";
            } else {
                firstElem = " ";
                nextElem = "*";
            }
            for (int j = 0; j < Math.abs(chessBoard.getWidth()); j++) {
                if (j % 2 == 0)
                    stringBuilder.append(firstElem);
                else stringBuilder.append(nextElem);
            }
            if (i < Math.abs(chessBoard.getHeight()) - 1)
                stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}