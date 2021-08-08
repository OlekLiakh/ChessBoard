package inputParameters;

import modelBoard.ChessBoard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputParametersFromMainClassWithParameters implements InputParameters {

    String errorMessage = "Input parameter must be an integer. Incorrect value of ";
    ChessBoard chessBoard;

    public InputParametersFromMainClassWithParameters(String[] args) {
        chessBoard = setParametersChessBord(args);
    }

    private ChessBoard setParametersChessBord(String[] args) {
        int height = 0, width = 0;
        if (args.length == 0) {
            System.out.println("Enter height and width for output chess board");
            height = getParameter("height");
            width = getParameter("width");
        } else {
            height = getParameter(args[0], "height");
            try {
                width = getParameter(args[1], "width");
            } catch (ArrayIndexOutOfBoundsException e) {
                width = getParameter("width");
            }
        }
        return new ChessBoard(height, width);
    }

    private int getParameter(String value, String param) {
        int parameter = 0;
        try {
            parameter = Integer.parseInt(value);
        } catch (NumberFormatException nfe) {
            System.out.println(errorMessage + param);
            parameter = getParameter(param);
        }
        return parameter;
    }

    private int getParameter(String param) {
        int parameter = 0;
        boolean isSuccessful = false;
        while (!isSuccessful) {
            try {
                System.out.println("Enter " + param);
                BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
                parameter = Integer.parseInt(bf.readLine());
                isSuccessful = true;
            } catch (IOException | NumberFormatException e) {
                System.out.println(errorMessage + param);
            }
        }
        return parameter;
    }

    @Override
    public ChessBoard getChessBoard() {
        return chessBoard;
    }
}