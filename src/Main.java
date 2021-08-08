import inputParameters.InputParameters;
import inputParameters.InputParametersFromConsole;
import inputParameters.InputParametersFromConstructor;
import output.OutputChessBoardScheme;
import output.OutputChessBoardSchemeToConsole;

public class Main {
    public static void main(String[] args) {

//        InputParameters inputParameters = new InputParametersFromConsole();
        InputParameters inputParameters = new InputParametersFromConstructor(5,-5);

        OutputChessBoardScheme output = new OutputChessBoardSchemeToConsole(inputParameters.getChessBoard());

        output.outputChessBoardScheme();

    }
}
