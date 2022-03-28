package poly;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	Product items[]=new Product[10];
	int i=0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액 부족으로 물건 구매 불가");
			
		}
		money -=p.price;
		bonusPoint += p.bonusPoint;
		items[i++]=p;
		System.out.println(p+"을/를 구매합니다");
	}

}
