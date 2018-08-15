/* this program is where the main method is and array of suits and ranks declared in class Cards are called
 *  
 */

public class MainCard {
	public static void main(String args[]){
		
		String[] suits = new String[4];
		
	    suits[0] = "Clubs";
	    suits[1] = "Diamonds";
	    suits[2] = "Hearts";
	    suits[3] = "Spades";
	    
	    
	    String[] ranks = {null, "Ace", "2", "3", "4", "5", "6",
	            "7", "8", "9", "10", "Jack", "Queen", "King"};
	  
	   
		
	Cards card = new Cards(11, 1);
    System.out.println(card);
		
	}
}