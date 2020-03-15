/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crazyeights;

/**
 *
 * @author Reuben
 */
public enum Suit {
    CLUBS(1, "Clubs", '\u2663'),
    DIAMONDS(2, "Diamonds", '\u2662'),
    HEARTS(3, "Hearts", '\u2661'),
    SPADES(4, "Spades",  '\u2660');
    
    private int dispNum;
    private String dispName;
    private char dispChar;
    
    private Suit(int dispNum, String dispName, char dispChar){
        this.dispNum = dispNum;
        this.dispName = dispName;
        this.dispChar = dispChar;
    }

    /**
     * @return the dispNum
     */
    public int getDispNum() {
        return dispNum;
    }

    /**
     * @return the dispName
     */
    public String getDispName() {
        return dispName;
    }

    /**
     * @return the dispChar
     */
    public char getDispChar() {
        return dispChar;
    }
}
