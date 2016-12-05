
import java.util.ArrayList;
import java.util.Random;



public class Deck {    //�g�n�~�P

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
	
	public void shuffle(){     //��Ҧ����P���^�ӡA�b�~�P�A
		  
		usedCard = new ArrayList<Card>();
		nUsed = 0;
		for (Card shuff : cards)
		{
			int newnum = rnd.nextInt(52);  //Random����nextInt(bound)��k�i�H�H�����ͤj�󵥩�0�B�p��bound����ơC
			Card newCard = cards.get(newnum);
			cards.set(cards.indexOf(shuff), newCard);  // set(int index, E element)�H�s�Ȩ��N���w���ަ�m������
			cards.set(cards.indexOf(newCard), shuff);  // indexOf(Object o)�q�e�ݷj�M��C���O�_�����w����, ���Ǧ^�����, �_�h�Ǧ^ -1
		}
	}
	
	public Card getOneCard(boolean open) {     //�ˬd�٦��S���P�A�S��shuffle�A�����o�X�h�X�i�P�M����j�p
		
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


