

public class Card {   //�̪��C�|�Ʀn

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Description: �N�C�ƵP13*4�i�A�̧�print�X��
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