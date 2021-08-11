package output.converter;

import modelBoard.ChessBoard;

public class ConverterSchemeChessBoardToString {

    private ChessBoard chessBoard;

    public ConverterSchemeChessBoardToString(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public String getScheme() {
        String chessBoardCellType1 = "*";
        String chessBoardCellType2 = " ";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= Math.abs(chessBoard.getWidth() * chessBoard.getHeight()); i++) {
            if (i % 2 == 0) {
                stringBuilder.append(chessBoardCellType2);
            } else {
                stringBuilder.append(chessBoardCellType1);
            }
            if (i % chessBoard.getWidth() == 0) {
                stringBuilder.append("/n");
            }
        }
        return stringBuilder.toString();
    }
}