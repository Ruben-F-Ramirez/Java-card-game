/*
*Ruben Ramirez
*SID: 0432694
*Professor Kewei Sha
*
*/


package cardgame;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ruben Ramirez
 */
public class player {
    
    player(int num){
        
        players = new int [num];
        
    }
    
    private int [] players;
    Scanner input = new Scanner(System.in);
    
    // dealer is always players[0]
    
    private String faceDown;
    
    // tally current player score
    public void hit(String card, int player){
        
        int points;
        if ("Ace".equals(card)){
            points = ace();
            players[player] += points;
        }
        else{
            
            players[player] += stringToInt(card);;
        }
        
    } // end setHand method
    
    // blackjack method
    public boolean blackjack(int points){
        boolean win;
        if (points == 21)
            {win = true;
            System.out.println("Blackjack, you win!");
            }
        else
            win = false;
        return win;
    }
    
    // bust method
    public boolean bust(int points){
        boolean lose;
        if (points > 21){
            System.out.println("Bust!");
            lose = true;
        }
        else
            lose = false;
        return lose;
    }
    
    // special face down card for dealer
    public void setFaceDown(String card){
        faceDown = card;
    }
    
    
    public int getHand(int player){
        int hand;
        hand = players[player];
        return hand;
    } // end getHand method
    
    
    public void resetPoints(int player){
        players[player] = 0;
    }
    
    public void resetGame(){
        
        Arrays.fill(players, 0);
        
    } // end newHand method
    
    // assigns integer value to cards except for ace
    public int stringToInt(String val){
        
        int points =0;
        
        switch(val){
            
            case "Ten": case "Jack": case "Queen": case "King":
                points = 10; break;
            case "Deuce":
                points = 2;
                break;
            case "Three":
                points = 3;
                break;
            case "Four":
                points = 4;
                break;
            case "Five":
                points = 5;
                break;
            case "Six":
                points = 6;
                break;
            case "Seven":
                points = 7;
                break;
            case "Eight":
                points = 8;
                break;
            case "Nine":
                points = 9;
                break;    
        }
        
        
        
        return points;
    } // end method to get points
    
    public int ace(){ // special selection for ace card value
        
        int num;
        System.out.println("Use Ace as a 1 or 11?\nType 1 or 11");
        num = input.nextInt();
        
        return num;
    } // end ace method
    
    // dealer decision algorithm
    public void dealer(String card){
        
        
        if ("Ace".equals(card)){
            if (players[0] < 12){
            players[0] += 11;
            }
        else
            players[0] += 1;
        }
        else{
            
            players[0] += stringToInt(card);
        }
        
        
        
        
        
    }
    
    // end of game method
    public void end(){
        
        dealer(faceDown);
        
        
        int diff21 = 21;
        int playerScore;
        int winner =0;
        for ( int player = 0; player < players.length; player++){
            
            playerScore = 21-players[player];
            
            if (playerScore < diff21){
                winner = player;
                diff21 = playerScore;
            }
        }
    System.out.printf("The winner is player %d with score of %d\n", winner,players[winner]);    
    }
 

}
