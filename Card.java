

public class Card {   //依花色列舉排好

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Description: 將每副牌13*4張，依序print出來
		 */
		}
	 	public enum Suit{Club,Diamond,Heart,Spade};
		private Suit suit; //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
		private int rank; //1~13
		public  Card( Suit s,int r){
				suit=s;
				rank=r;
		}	
		public void printCard(){
			//Hint: print (System.out.println) card as suit,rank, for example: print 1,1 as Clubs Ace
			
			System.out.println(suit+","+rank);
		}
		

		public Suit getSuit(){
			return suit;
		}
		public int getRank(){
			return rank;
		}
}