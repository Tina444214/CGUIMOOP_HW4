import java.util.ArrayList;

public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

		private String name;
		//玩家姓名
		private int chips;
		//玩家有的籌碼
		private int bet=0;
		//玩家此局下注的籌碼
		private ArrayList<Card> oneRoundCard;
		//此牌局的卡
		public Player(String name, int chips){
			
			this.name = name;
			this.chips = chips;
		}
		//Player constructor，新增Player物件時，需要姓名、擁有的籌碼等兩個參數
		public String get_name(){
			
			return name;
		}
		/*name的getter
		return name;*/
		public int make_bet(){
			
			if(chips>=1)
				bet=1;
			else if(chips==0)
				bet=0;
			return bet;
		}
		/*下注，回傳預計下注的籌碼
		基本下注：一次1元
		如
		bet=1;
		return bet;
		注意：要檢查是否還有錢，沒錢了就不能再繼續下注*/
		public void setOneRoundCard(ArrayList<Card> cards){ //讓別人發牌給你
			
			oneRoundCard=cards;
		}    
		/*設定此牌局所得到的卡 setter
		oneRoundCard=cards;*/
		public boolean hit_me(){      //要不要牌，10、11、12、13都算10，A可以當       11也能當1
			
			boolean hit=false;
			if(getTotalValue()<=16)
				{hit=true;}
			return hit;
		}
		/*是否要牌，是回傳true，不再要牌則回傳false
		基本參考條件：16點以下要牌，17點以上不要牌
		提示：用oneRoundCard來算*/
		public int getTotalValue(){
			
			int total = 0;
			for (Card card : oneRoundCard) {
				if (card.getRank() == 1) {

					if ((total + 11) <= 21) 
					{total += 11;}
					else 
				    {total += card.getRank();}
					
				} else if (card.getRank() > 10) {
					total += 10;
				} else {
					total += card.getRank();
				}
			}
			return total;
		}
		//回傳此牌局所得的卡點數加總
		public int get_current_chips(){
			
			return chips;
		}
		//回傳玩家現有籌碼
		public void increase_chips (int diff){
			
			chips += diff;
		}
		//玩家籌碼變動，setter
		public void say_hello(){
			
			System.out.println("Hello, I am " + name + ".");
			System.out.println("I have " + chips + " chips.");
		}
		/*玩家Say Hello
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");*/

	

}
