/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author egzamin
 */
public class Opponent {
    
    int opponentScore = 0;
    int possiblePlayerScore = 0; //will need to be expanded later, because it would be cool if bot would actually have some intelligence
    List opponentsDeck = new ArrayList();
    
    //returns false if bot stays, true if draws card
    public boolean playTurn(){
        
        //add code to count opponents score here later
        
        Random rand = new Random();
        int greed = rand.nextInt(3) + 2; //add some randomisation for fun, also we dont want the bot to draw while being as little as 2 away from 21
        
        //decide if the opponent wants to draw or pass
        if(opponentScore < 21){
            
            if (opponentScore <= 21-greed){
                drawCard();
                return true;
            }
            
        }
        
        return false;
        
    }
    
    public void drawCard(){
        
        int newCard = 0;
        //place function to get cards here after it's made
        opponentsDeck.add(newCard);
    }
    
}
