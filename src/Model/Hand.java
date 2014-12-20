package Model;

import java.util.ArrayList;

public class Hand {
    public ArrayList<Card> cards;
    public int value;
    public Hand(){
    	cards = new ArrayList<Card>();
    	value =0;
    }
    public boolean checkBlackJack(String p){
    	calculateValue(p);
    	if(value==21) return true;
    	else return false;
    	
    }
    public void calculateValue(String p){
    	
    	value=0;
    	if(p.equals("player")){
    		boolean hasAce=false;
    	   for(Card c: cards){
    		   if(c.getValue()==1 && !hasAce){  
    			   hasAce= true;
    	    	   value+=(c.getValue()+10);
    		   }else{
    			   value+=c.getValue();
    		   }
    	   }
    	}else{
     	   for(Card c: cards){
    		   if(c.getValue()==1 && value<11){  
    			  
    	    	   value+=(c.getValue()+10);
    		   }else{
    			   value+=c.getValue();
    		   }
    	   }
    	}
    	
    }
}
