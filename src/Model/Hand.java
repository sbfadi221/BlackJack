package Model;

import java.util.ArrayList;

public class Hand {
    public ArrayList<Card> cards;
    public int value;
    public Hand(){
    	cards = new ArrayList<Card>();
    	value =0;
    }
    /**
     * check if the hand is a black jack
     * @param the player or the dealer
     * @return true if blackjack
     */
    public boolean checkBlackJack(String p){
    	calculateValue(p);
    	if(value==21) return true;
    	else return false;
    	
    }
    /**
     * calculates the value of the hand
     * @param the player or the dealer
     */
    public void calculateValue(String p){
    	
    	value=0;
    	if(p.equals("player")){//calculate for player different rules for ace
    		boolean hasAce=false;
    	   for(Card c: cards){
    		   if(c.getValue()==1 && !hasAce){  //if it is the first ace
    			   hasAce= true;
    	    	   value+=(c.getValue()+10);//count as 11 (1+10)
    		   }else{
    			   value+=c.getValue();//add 1
    		   }
    	   }
    	}else{//calculate for dealer different rules for ace
     	   for(Card c: cards){
    		   if(c.getValue()==1 && value<11){  //if the ace doesn't get the dealer busted
    			  
    	    	   value+=(c.getValue()+10);//count as 11 (1+10)
    		   }else{
    			   value+=c.getValue();//add 1
    		   }
    	   }
    	}
    	
    }
}
