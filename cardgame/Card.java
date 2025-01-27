/*
*Ruben Ramirez
*SID: 0432694
*Professor Kewei Sha
*
*/


package cardgame;

/**
 *
 * @author Ruben Ramirez
 */
public class Card {
    // fields
    
    private String face;  // face of card ( ace, duece,...)
    private String suit; // suit of card ( hearts, diamonds)
    
    public Card(String cardFace, String cardSuit){
        face = cardFace;
        suit = cardSuit;
    } // end constructor
    
    public String getFace(){
        return face;
    }
    
    public String getSuit(){
        return suit;
    }
    
    // return String representation of Card
    public String toString(){
        return face + " of " + suit;
    } // end method

} // end class Card
