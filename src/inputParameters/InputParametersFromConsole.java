package inputParameters;

import modelBoard.ChessBoard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputParametersFromConsole implements InputParameters{

    private ChessBoard chessBoard;
    private BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public InputParametersFromConsole (){
        chessBoard  = this.setParametersChessBord();
    }

    public ChessBoard getChessBoard(){
        return chessBoard;
    }

    private ChessBoard setParametersChessBord() {
        int height = 0, width = 0;
        height = getParameter(bf, "height");
        width = getParameter(bf, "width");
        return new ChessBoard(height,width);
    }

    private int getParameter(BufferedReader bf, String param) {
        int parameter = 0;
        boolean isSuccessful = true;
        String errorMessage = "Incorrect value. Input parameter must be an integer. " +
                "Enter " + param + " again.";
        System.out.printf("Enter %s of chess board \n", param);
        try {
            while(isSuccessful){
                try {
                    parameter = Integer.parseInt(bf.readLine());
                    isSuccessful = false;
                }
                catch (NumberFormatException nfe){
                    System.out.println(errorMessage);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parameter;
    }
}
