/**
 * @modifier Reuben Tudball 
 */
package crazyeights;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye
 */
public class Card {
    private Rank rank;
    private Suit suit;
    
    public Card(){
        
    }
    
    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * @return the rank
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(Rank rank) {
        this.rank = rank;
    }

    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
    @Override
    public String toString(){
        return this.rank.getDispName() + " of " + this.suit.getDispName();
    }
    
    
    
}
