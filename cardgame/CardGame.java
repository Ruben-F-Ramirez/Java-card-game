/*
 * Ruben Ramirez
 * SID: 0432694
 * Professor Kewei Sha
 */
package cardgame;

import java.util.Scanner;

/**
 *
 * @author Ruben Ramirez
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DeckOfCards myDeck;
        myDeck = new DeckOfCards();
        myDeck.shuffle();
        
        boolean lose = false;
        boolean win = false;
        char flag = 'y';
        
        int numPlayers;
        Scanner input = new Scanner(System.in);
        System.out.println("How many players are there?");
        numPlayers = input.nextInt();
        numPlayers += 1;
        
        player myPlayers = new player(numPlayers);
        
        // initialize dealer hand
        System.out.print("Dealer gets ");
        myDeck.display();
        myPlayers.dealer(myDeck.dealCard());
        
        myPlayers.setFaceDown(myDeck.dealCard());
        System.out.print("Dealer face up card value is ");
        System.out.println(myPlayers.getHand(0));
        
        
        
        // deal first pair of cards for players
        for (int count = 1; count < numPlayers; count++){
            System.out.printf("Player %d gets ", count);
            myDeck.display();
            myPlayers.hit(myDeck.dealCard(), count);
            
            System.out.printf("Player %d gets ", count);
            myDeck.display();
            myPlayers.hit(myDeck.dealCard(), count);
            
            System.out.printf("Current total is %d for player %d\n",myPlayers.getHand(count), count);
            
            lose = myPlayers.bust(myPlayers.getHand(count));
            win = myPlayers.blackjack(myPlayers.getHand(count));
        } // end first deal
        
        // commence player turn
        for (int count = 1; count < numPlayers; count++){
            
            
            System.out.printf("Current total is %d for player %d\n",myPlayers.getHand(count), count);
            if (lose)
                break;
            if (win)
                break;
            System.out.println("would you like to hit? y for yes, n for no");
            flag = input.next().charAt(0); 
            
            while (flag == 'y'){
                if (win)
                    break;
                System.out.printf("Player %d gets ", count);
                myDeck.display();
                myPlayers.hit(myDeck.dealCard(), count);
                System.out.printf("Current total is %d\n",myPlayers.getHand(count));
                
                lose = myPlayers.bust(myPlayers.getHand(count));
                win = myPlayers.blackjack(myPlayers.getHand(count));
                if (lose)
                    break;
                if (win)
                    break;
                System.out.println("would you like to hit again? y for yes, n for no");
                flag = input.next().charAt(0); 
                
            } // end of player turn
        
        if (win)
            break;
            
        }// end of game
        
    myPlayers.end();    
        
    } // end of main
    
}
