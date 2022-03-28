package classtest;


public class CardEx {
	public static void main(String[] args) {
		Card card1=new Card("heart", 7);
		Card card2=new Card("spade", 4);
		Card card3=new Card("heart", 8);
		
		
		System.out.println("card1 kind= "+card1.kind+" , "+"card number= "+card1.number+" , "+
		                   "card1 width= "+Card.width+" , "+"card height= "+Card.height);

    	System.out.println("card1 kind= "+card2.kind+" , "+"card number= "+card2.number+" , "+
            "card1 width= "+Card.width+" , "+"card height= "+Card.height);
    	
    	Card.width=50;
    	Card.height=80;
    	System.out.println("card1 kind= "+card3.kind+" , "+"card number= "+card3.number+" , "+
                "card1 width= "+Card.width+" , "+"card height= "+Card.height);
    }
}
