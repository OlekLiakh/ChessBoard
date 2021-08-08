import inputParameters.InputParameters;
import inputParameters.InputParametersFromConsole;
import inputParameters.InputParametersFromConstructor;
import inputParameters.InputParametersFromMainClassWithParameters;
import output.OutputChessBoardScheme;
import output.OutputChessBoardSchemeToConsole;

public class Main {
    public static void main(String[] args) {

//        InputParameters inputParameters = new InputParametersFromConsole();
//        InputParameters inputParameters = new InputParametersFromConstructor(5,-5);
        InputParameters inputParameters = new InputParametersFromMainClassWithParameters(args);

        OutputChessBoardScheme output = new OutputChessBoardSchemeToConsole(inputParameters.getChessBoard());

        output.outputChessBoardScheme();

    }
}
