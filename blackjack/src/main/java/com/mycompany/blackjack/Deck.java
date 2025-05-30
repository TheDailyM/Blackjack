/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    
    Random rand = new Random();
    ArrayList<Integer> reserveDeck = new ArrayList<Integer>();
    ArrayList<Integer> playersDeck = new ArrayList<Integer>();
    ArrayList<Integer> opponentsDeck = new ArrayList<Integer>();
    
    int playerScore = 0;
    
    public void initializeGame(){
    
        int[] reserveDeckArray = {2,3,4,5,6,7,8,9,10,11};
        
        for(int i=0;i<reserveDeckArray.length;i++){
            reserveDeck.add(reserveDeckArray[i]);
        }
    
        for(int i=1;i<2;i++){
            int randomCard = rand.nextInt(reserveDeck.size());
            playersDeck.add(reserveDeck.get(randomCard));
            reserveDeck.remove(randomCard);
        }

        for(int i=1;i<2;i++){
            int randomCard = rand.nextInt(reserveDeck.size());
            opponentsDeck.add(reserveDeck.get(randomCard));
            reserveDeck.remove(randomCard);
        }
        
    }
    
    public void drawCard(){
        
        if (playerScore <= 21){
            int randomCard = rand.nextInt(reserveDeck.size());
            playersDeck.add(reserveDeck.get(randomCard));
            reserveDeck.remove(randomCard);
        }else{
            return;
        }
    }
    
    public void pass(){
        
        endPlayerTurn();
        
    }
    
    public void endPlayerTurn(){
        
    }
    
    public ArrayList<Integer> getPlayersDeck(){
        return playersDeck;
    }

}
