/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crazyeights;

/**
 *
 * @author reube
 */
public class Deck extends GroupOfCards {
    
     Card[] cards = new Card[52];
     
    public Deck(int givenSize) {
        super(givenSize);
        init();
    }
    
   
    
    private void init(){
     int countCards = 0;
    for(Suit s: Suit.values()) {
            for(Rank r: Rank.values()) {
                cards[countCards] = (new Card(r,s));
                countCards++;
            }
        }
    }
    
    public Card pickCard(){
        Card c;
        c = cards[(int) (Math.random() * 52)];
      return c;  
    }
    
 
    @Override
    public void add(Card card) {
        if(showCards().size() < 52){
            showCards().add(card);
        }
    }

    @Override
    public void remove(Card card) {
        if(showCards().size() < 0){
            showCards().remove(card);
        }
    }
    
}
