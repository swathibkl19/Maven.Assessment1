package com.zipcodewilmington.assessment1.part1;

import java.awt.print.Paper;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

       /* char c = handSign.charAt(0);
        // checking the 1st character in the input
        if (c == "rock")
            return handSign.ROCK;
        else if (c == "paper")
            return handSign.PAPER;
        else if (c == "scissor")
            return handSign.SCISSOR;
        else
           // getInput();
            return 0;
  */
/*if(handSign.equals("rock")) {
    return "paper";
}
else if (handSign.equals("paper")) {

    return "scissor";
}
else(handSign.equals("scissor")) {
            return "rock";
        }*/
        //  switch (handSign) {
        //case ROCK:
        //   return handSign == SCISSOR;
        //case PAPER:
        //  return handSign == ROCK;
        //case SCISSOR:
        //  return handSign == PAPER;
        //default:
        return PAPER;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {

        return SCISSOR;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        return handSignOfPlayer1 == ROCK ? ROCK :SCISSOR;

    }
}

