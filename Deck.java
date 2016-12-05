
import java.util.ArrayList;
import java.util.Random;



public class Deck {    //寫好洗牌

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}	
		
	Random rnd = new Random();
	private ArrayList<Card> cards;
	private ArrayList<Card> usedCard;
	private ArrayList<Card> openCard; 
	public int nUsed = 0; 
	public Deck(int nDeck){
			cards=new ArrayList<Card>();
			//1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
			//Hint: Use new Card(x,y) and 3 for loops to add card into deck
			//Sample code start
			//Card card=new Card(1,1); ->means new card as clubs ace
			//cards.add(card);
			//Sample code end
				
			for(int i=0 ; i<nDeck ; i++)
			{
				for(Card.Suit j : Card.Suit.values())
				{
					for(int k =1; k<=13 ;k++)
					{
						Card card=new Card(j,k);
						cards.add(card);

					}
				}
			}
		}	
			
	public void printDeck(){
		//Hint: print all items in ArrayList<Card> cards, 
		//please implement and reuse printCard method in Card class

		for(Card c :cards) 
			{c.printCard();}
		}
	
	public void shuffle(){     //把所有的牌收回來，在洗牌，
		  
		usedCard = new ArrayList<Card>();
		nUsed = 0;
		for (Card shuff : cards)
		{
			int newnum = rnd.nextInt(52);  //Random物件的nextInt(bound)方法可以隨機產生大於等於0且小於bound的整數。
			Card newCard = cards.get(newnum);
			cards.set(cards.indexOf(shuff), newCard);  // set(int index, E element)以新值取代指定索引位置之元素
			cards.set(cards.indexOf(newCard), shuff);  // indexOf(Object o)從前端搜尋串列中是否有指定元素, 有傳回其索引, 否則傳回 -1
		}
	}
	
	public Card getOneCard(boolean open) {     //檢查還有沒有牌，沒有shuffle，紀錄發出去幾張牌和其花色大小
		
		openCard = new ArrayList<Card>();
		if (nUsed ==0 || nUsed == 52) 
		{
			shuffle();
		}
		
		Card getCard = cards.get(nUsed);
		if(open)
			{openCard.add(getCard);}
		usedCard.add(getCard);
		nUsed++;
		return getCard;
		
	}	
	 
	public ArrayList<Card> getAllCards(){
		return cards;
	}
		
	public ArrayList<Card> getOpenedCard() {
		return openCard;
	}

	
}


