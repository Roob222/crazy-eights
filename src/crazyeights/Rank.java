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
public enum Rank {
    ACE(1,"Ace","A"),
    TWO(2,"Two","2"),
    THREE(3,"Three","3"),
    FOUR(4,"Four","4"),
    FIVE(5,"Five","5"),
    SIX(6,"Six","6"),
    SEVEN(7,"Seven","7"),
    EIGHT(8,"Eight","8"),
    NINE(9,"Nine","9"),
    TEN(10,"Ten","10"),
    JACK(11,"Jack","J"),
    QUEEN(12,"Queen","Q"),
    KING(13,"King","K");
    
    private int dispNum;
    private String dispName;
    private String shortDispName;
    
    private Rank(int dispNum, String dispName, String shortDispName){
        this.dispNum = dispNum;
        this.dispName = dispName;
        this.shortDispName = shortDispName;
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
     * @return the shortDispName
     */
    public String getShortDispName() {
        return shortDispName;
    }
}
