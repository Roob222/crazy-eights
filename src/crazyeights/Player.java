/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package crazyeights;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye
 */
public class Player {
    private String playerID; //the unique ID for this player
    public Hand playerHand;
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     * @param hand the hand this player is holding
     */
    public Player(String name, Hand hand)
    {
        this.playerID= name;
        this.playerHand = hand;
    }
    
    /**
     * @return the playerID
     */
    public String getPlayerID() 
    {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }
    
    public Hand getHand(){
        return this.playerHand;
    }
    
    public void setHand(Hand hand){
        this.playerHand = hand;
    }
    
  
}
