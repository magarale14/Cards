/* This program is to create array of objects of a deck, String tostring of card in cards class
 * Author: Reeta
 * Date: 8/14/18
 */
public class Cards {

    private int rank;
    private int suit;

    public Cards(int rank, int suit) { // constructor
        this.rank = rank;
        this.suit = suit;
    }
     
    public String toString(){
        String[] ranks = {null, "Ace", "2", "3", "4", "5", "6",
                   "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        
        String s = ranks[this.rank] + " of " + suits[this.suit];
        return s;
    }
   
    
    
}


    
    
    
    

