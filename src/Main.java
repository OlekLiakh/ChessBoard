import inputParameters.InputParameters;
import inputParameters.InputParametersFromConsole;
import inputParameters.InputParametersFromConstructor;
import inputParameters.InputParametersFromMainClassWithParameters;
import modelBoard.ChessBoard;
import output.OutputChessBoardScheme;
import output.OutputChessBoardSchemeToConsole;

public class Main {
    public static void main(String[] args) {
//        InputParameters inputParameters = new InputParametersFromConsole();
//        InputParameters inputParameters = new InputParametersFromConstructor(5,-5);
        InputParameters inputParameters = new InputParametersFromMainClassWithParameters(args);
        ChessBoard chessBoard = inputParameters.getChessBoard();
        OutputChessBoardScheme output = new OutputChessBoardSchemeToConsole(chessBoard);
        output.outputChessBoardScheme();
    }
}
