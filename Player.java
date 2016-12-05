import java.util.ArrayList;

public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

		private String name;
		//���a�m�W
		private int chips;
		//���a�����w�X
		private int bet=0;
		//���a�����U�`���w�X
		private ArrayList<Card> oneRoundCard;
		//���P�����d
		public Player(String name, int chips){
			
			this.name = name;
			this.chips = chips;
		}
		//Player constructor�A�s�WPlayer����ɡA�ݭn�m�W�B�֦����w�X����ӰѼ�
		public String get_name(){
			
			return name;
		}
		/*name��getter
		return name;*/
		public int make_bet(){
			
			if(chips>=1)
				bet=1;
			else if(chips==0)
				bet=0;
			return bet;
		}
		/*�U�`�A�^�ǹw�p�U�`���w�X
		�򥻤U�`�G�@��1��
		�p
		bet=1;
		return bet;
		�`�N�G�n�ˬd�O�_�٦����A�S���F�N����A�~��U�`*/
		public void setOneRoundCard(ArrayList<Card> cards){ //���O�H�o�P���A
			
			oneRoundCard=cards;
		}    
		/*�]�w���P���ұo�쪺�d setter
		oneRoundCard=cards;*/
		public boolean hit_me(){      //�n���n�P�A10�B11�B12�B13����10�AA�i�H��       11�]���1
			
			boolean hit=false;
			if(getTotalValue()<=16)
				{hit=true;}
			return hit;
		}
		/*�O�_�n�P�A�O�^��true�A���A�n�P�h�^��false
		�򥻰Ѧұ���G16�I�H�U�n�P�A17�I�H�W���n�P
		���ܡG��oneRoundCard�Ӻ�*/
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
		//�^�Ǧ��P���ұo���d�I�ƥ[�`
		public int get_current_chips(){
			
			return chips;
		}
		//�^�Ǫ��a�{���w�X
		public void increase_chips (int diff){
			
			chips += diff;
		}
		//���a�w�X�ܰʡAsetter
		public void say_hello(){
			
			System.out.println("Hello, I am " + name + ".");
			System.out.println("I have " + chips + " chips.");
		}
		/*���aSay Hello
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");*/

	

}
